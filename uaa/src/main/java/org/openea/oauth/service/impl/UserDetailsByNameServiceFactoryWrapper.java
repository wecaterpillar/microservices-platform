package org.openea.oauth.service.impl;

import org.openea.oauth.service.EaUserDetailsService;
import lombok.Setter;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken;
import org.springframework.util.Assert;

/**
 * 重写 UserDetailsByNameServiceWrapper 支持多帐户类型
 *
 * @see UserDetailsByNameServiceWrapper
 */
public class UserDetailsByNameServiceFactoryWrapper <T extends Authentication> implements
        AuthenticationUserDetailsService<T>, InitializingBean {
    @Setter
    private UserDetailServiceFactory userDetailServiceFactory;

    public UserDetailsByNameServiceFactoryWrapper() {

    }

    public UserDetailsByNameServiceFactoryWrapper(final UserDetailServiceFactory userDetailServiceFactory) {
        Assert.notNull(userDetailServiceFactory, "userDetailServiceFactory cannot be null.");
        this.userDetailServiceFactory = userDetailServiceFactory;
    }

    /**
     * Check whether all required properties have been set.
     *
     * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
     */
    @Override
    public void afterPropertiesSet() {
        Assert.notNull(this.userDetailServiceFactory, "UserDetailServiceFactory must be set");
    }

    /**
     * Get the UserDetails object from the wrapped UserDetailsService implementation
     */
    @Override
    public UserDetails loadUserDetails(T authentication) throws UsernameNotFoundException {
        EaUserDetailsService userDetailsService;
        if (authentication instanceof PreAuthenticatedAuthenticationToken) {
            userDetailsService = this.userDetailServiceFactory.getService((Authentication)authentication.getPrincipal());
        } else {
            userDetailsService = this.userDetailServiceFactory.getService(authentication);
        }
        return userDetailsService.loadUserByUsername(authentication.getName());
    }
}
