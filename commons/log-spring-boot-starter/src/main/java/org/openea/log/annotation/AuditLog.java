package org.openea.log.annotation;

import java.lang.annotation.*;

/**
 * @author zlt
 * @date 2020/2/3
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AuditLog {
    /**
     * 操作信息
     */
    String operation();
}
