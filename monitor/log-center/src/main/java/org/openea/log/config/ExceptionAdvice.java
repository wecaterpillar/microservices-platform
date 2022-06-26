package org.openea.log.config;

import org.openea.common.exception.DefaultExceptionAdvice;
import org.springframework.web.bind.annotation.ControllerAdvice;

/**
 * 统一异常处理
 *
 */
@ControllerAdvice
public class ExceptionAdvice extends DefaultExceptionAdvice {
}
