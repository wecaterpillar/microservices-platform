package org.openea.common.annotation;

import java.lang.annotation.*;

/**
 * 请求的方法参数上添加该注解，则注入当前登录账号的应用id
 * 例：public void test(@LoginClient String clientId) //注入webApp
 *
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LoginClient {
}
