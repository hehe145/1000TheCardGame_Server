package com.hehe145.cardgame.server.model;

public class Message {

    public enum MessageCode {
       PLAYER_REGISTERED, PLAYER_LOGIN, PLAYER_LOGOUT, TABLE_ADDED, TABLE_EXIST, TABLE_FULL, JOINED_TO_TABLE, LEFT_TABLE, WRONG_LOGIN_OR_PASSWORD, PLAYER_EXIST
    }

    private String message;
    private MessageCode code;

    public Message() {
    }

    public Message(String message, MessageCode code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MessageCode getCode() {
        return code;
    }

    public void setCode(MessageCode code) {
        this.code = code;
    }
}
