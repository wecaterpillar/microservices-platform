package org.openea.es.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * es的httpClient连接池配置
 *
 */
@Setter
@Getter
@ConfigurationProperties(prefix = "ea.elasticsearch.rest-pool")
@RefreshScope
public class RestClientPoolProperties {
    /**
     * 链接建立超时时间
     */
    private Integer connectTimeOut = 1000;
    /**
     * 等待数据超时时间
     */
    private Integer socketTimeOut = 30000;
    /**
     * 连接池获取连接的超时时间
     */
    private Integer connectionRequestTimeOut = 500;
    /**
     * 最大连接数
     */
    private Integer maxConnectNum = 30;
    /**
     * 最大路由连接数
     */
    private Integer maxConnectPerRoute = 10;
}
