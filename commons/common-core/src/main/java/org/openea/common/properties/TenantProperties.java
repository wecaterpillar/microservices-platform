package org.openea.common.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import java.util.ArrayList;
import java.util.List;

/**
 * 多租户配置
 */
@Setter
@Getter
@ConfigurationProperties(prefix = "ea.tenant")
@RefreshScope
public class TenantProperties {
    /**
     * 是否开启多租户
     */
    private Boolean enable = false;

    /**
     * 配置不进行多租户隔离的表名
     */
    private List<String> ignoreTables = new ArrayList<>();

    /**
     * 配置不进行多租户隔离的sql
     * 需要配置mapper的全路径如：org.openea.user.mapper.SysUserMapper.findList
     */
    private List<String> ignoreSqls = new ArrayList<>();
}
