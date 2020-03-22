package org.openea.oauth.config;

import org.openea.db.config.DefaultMybatisPlusConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zlt
 * @date 2018/12/10
 */
@Configuration
@MapperScan({"org.openea.oauth.mapper*"})
public class MybatisPlusConfig extends DefaultMybatisPlusConfig {

}
