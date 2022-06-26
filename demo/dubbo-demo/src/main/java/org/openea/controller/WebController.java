package org.openea.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.openea.service.RpcService;


@Slf4j
@RestController
public class WebController {
    @DubboReference
    private RpcService dubboService;

    @GetMapping("/test/{p}")
    public String test(@PathVariable("p") String param) {
        log.info("==============WebController");
        return dubboService.test(param);
    }
}
