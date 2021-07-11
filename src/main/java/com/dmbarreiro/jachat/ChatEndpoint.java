package com.dmbarreiro.jachat;

import java.io.IOException;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint(value = "/chat/{username}")
public class ChatEndpoint {

    @OnOpen
    public void onOpen(Session session) throws IOException {

    }

    @OnMessage
    public void onMessage(Session session, String message) throws IOException {

    }

    @OnClose
    public void onClose(Session session) throws IOException {

    }

    @OnError
    public void onError(Session session, Throwable throwable) {

    }
}
