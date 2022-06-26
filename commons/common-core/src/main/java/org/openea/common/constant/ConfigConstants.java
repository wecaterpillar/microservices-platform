package org.openea.common.constant;

/**
 * 配置项常量
 *
 */
public interface ConfigConstants {
    /**
     * 是否开启自定义隔离规则
     */
    String CONFIG_RIBBON_ISOLATION_ENABLED = "ea.ribbon.isolation.enabled";

    String CONFIG_LOADBALANCE_ISOLATION = "ea.loadbalance.isolation";

    String CONFIG_LOADBALANCE_ISOLATION_ENABLE = CONFIG_LOADBALANCE_ISOLATION + ".enabled";

    String CONFIG_LOADBALANCE_ISOLATION_CHOOSER = CONFIG_LOADBALANCE_ISOLATION + ".chooser";

    String CONFIG_LOADBALANCE_VERSION = "ea.loadbalance.version";


}
