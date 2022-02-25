package com.cf_houduan.cf_houduan.controller;

import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@ServerEndpoint("/websocket/{username}")
@Component
public class MyWebSocket {
    /**
     * 静态变量，用来记录当前在线连接数。应该把它设计成线程安全的。
     */
    private static int onlineCount = 0;

    /**
     * concurrent包的线程安全Set，用来存放每个客户端对应的MyWebSocket对象。若要实现服务端与单一客户端通信的话，可以使用Map来存放，其中Key可以为用户标识
     */
//    private static CopyOnWriteArraySet<MyWebSocket> webSocketSet = new CopyOnWriteArraySet<MyWebSocket>();
    private static Map<String, MyWebSocket> map = new HashMap<>();

    /**
     * 与某个客户端的连接会话，需要通过它来给客户端发送数据
     * tomcat
     */
    private Session session;

    @OnOpen
    public void onOpen(Session session, @PathParam("username") String username) {
        this.session = session;
        map.put(username, this); // 加入set中
        addOnlineCount(); // 在线数加1
        System.out.println("有新连接加入！当前在线人数为" + getOnlineCount());
    }

    /**
     * 连接关闭调用的方法
     */
    @OnClose
    public void onClose(@PathParam("username") String username) {
        map.remove(username); // 从set中删除
        subOnlineCount(); // 在线数减1
        System.out.println("有一连接关闭！当前在线人数为" + getOnlineCount());
    }

    @OnMessage
    public void onMessage(String msg, @PathParam("username") String username) throws IOException {
        System.out.println("来自客户端的消息:" + msg);
        msg = msg.trim();
        if (msg.contains("@") && msg.startsWith("@") && msg.contains(":")) {
            String name = "";
            String[] split = msg.split(":");
            if (split.length == 2) {
                msg = split[1];
                name = split[0].substring(1, split[0].length());
                if (map.get(name) != null) {
                    map.get(name).sendMessage(username + ":" + msg);
                    this.sendMessage(username + ":" + msg);
                } else {
                    this.sendMessage(username + ":你@的人不存在");
                }
            } else {
                msg = "你发了个寂寞";
                this.sendMessage(username + ":" + msg);
            }

        } else {
            for (String s : map.keySet()) {
                map.get(s).sendMessage(username + ":" + msg);
            }
        }
    }

    @OnError
    public void onError(Session session, Throwable error) {
        System.out.println("发生错误");
        error.printStackTrace();
    }

    public void sendMessage(String message) throws IOException {
        this.session.getBasicRemote().sendText(message);
        // this.session.getAsyncRemote().sendText(message);
    }

    public static synchronized int getOnlineCount() {
        return onlineCount;
    }

    public static synchronized void addOnlineCount() {
        MyWebSocket.onlineCount++;
    }

    public static synchronized void subOnlineCount() {
        MyWebSocket.onlineCount--;
    }
}