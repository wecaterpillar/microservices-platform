package org.openea.controller;

import org.openea.oauth2.common.config.WcAuthConfigurator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;


@Slf4j
@Component
@ServerEndpoint(value = "/websocket/test", configurator = WcAuthConfigurator.class)
public class TestWebSocketController {
    @OnOpen
    public void onOpen(Session session) throws IOException {
        session.getBasicRemote().sendText("TestWebSocketController-ok");
    }
}
