package com.example.test3.websocket;

import org.springframework.stereotype.Service;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@ServerEndpoint(value = "/chatt")
@Service
public class WebSocketChatting {

    private static Set<Session> CLIENTS = Collections.synchronizedSet(new HashSet<>());

    @OnOpen
    public void onOpen(Session session) {
        System.out.println(session.toString());

        if(CLIENTS.contains(session)) {
            System.out.println("already Connected Session > " + session);
        } else {
            CLIENTS.add(session);
            System.out.println(" new Session > " + session);
        }
    }

    @OnClose
    public void onClose(Session session) throws Exception {
        CLIENTS.remove(session);
        System.out.println("Session onClose. : " + session);
    }

    @OnMessage
    public void onMessage(String message, Session session) throws Exception {
        System.out.println("Input Message > " + message);

        for(Session client: CLIENTS) {
            System.out.println("Message Delivers > " + message);
            client.getBasicRemote().sendText(message);
        }
    }
}
