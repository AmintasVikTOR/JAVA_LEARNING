package com.company.pckg_messenger.pckg_message;

import com.company.pckg_messenger.User;

import java.util.Date;

public class TextMessage implements IMessage<String> {
    private final User user;
    private Date date;
    private String data;

    public TextMessage(User user) {
        this.user = user;
    }

    public TextMessage(User user, Date date, String data) {
        this.user = user;
        this.date = date;
        this.data = data;
    }

    @Override
    public EMessageType getType() {
        return EMessageType.TEXT;
    }

    @Override
    public Object getUser() {
        return user;
    }

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String getData() {
        return data;
    }

    @Override
    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "TextMessage{" +
                "user=" + user +
                ", date=" + date +
                ", data='" + data + '\'' +
                '}';
    }
}
