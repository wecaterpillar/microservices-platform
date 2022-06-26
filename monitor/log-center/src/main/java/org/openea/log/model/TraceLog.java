package org.openea.log.model;

import lombok.Getter;
import lombok.Setter;

/**
 * 日志链路对象
 *
 */
@Setter
@Getter
public class TraceLog {
    private String spanId;
    private String parentId;
    private String appName;
    private String serverIp;
    private String serverPort;
}
