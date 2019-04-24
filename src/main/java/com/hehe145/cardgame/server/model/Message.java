package com.hehe145.cardgame.server.model;

public class Message {

    public enum MessageType {
        ERROR, SUCCESS
    }

    private String message;
    private int code;
    private MessageType messageType;

    public Message(String message, int code, MessageType messageType) {
        this.message = message;
        this.code = code;
        this.messageType = messageType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }
}
