package org.openea.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.openea.service.RpcService;


@Slf4j
@DubboService(protocol = "dubbo")
public class RpcServiceImpl implements RpcService {
    @Override
    public String test(String param) {
        log.info("==============RpcServiceImpl");
        return "dubbo service: " + param;
    }
}
