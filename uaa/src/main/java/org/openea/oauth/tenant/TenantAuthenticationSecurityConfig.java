package org.openea.oauth.tenant;

import org.openea.oauth.service.impl.UserDetailServiceFactory;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.stereotype.Component;


@Component
public class TenantAuthenticationSecurityConfig extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {
    private final UserDetailServiceFactory userDetailsServiceFactory;

    private final PasswordEncoder passwordEncoder;

    public TenantAuthenticationSecurityConfig(UserDetailServiceFactory userDetailsServiceFactory, PasswordEncoder passwordEncoder) {
        this.userDetailsServiceFactory = userDetailsServiceFactory;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void configure(HttpSecurity http) {
        TenantAuthenticationProvider provider = new TenantAuthenticationProvider();
        provider.setUserDetailsServiceFactory(userDetailsServiceFactory);
        provider.setPasswordEncoder(passwordEncoder);
        http.authenticationProvider(provider);
    }
}
