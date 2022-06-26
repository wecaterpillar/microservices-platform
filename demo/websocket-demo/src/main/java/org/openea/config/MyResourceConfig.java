package org.openea.config;

import org.openea.oauth2.common.config.DefaultResourceServerConf;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * security资源服务器配置
 *
 */
@Configuration
@EnableResourceServer
public class MyResourceConfig extends DefaultResourceServerConf {
}
