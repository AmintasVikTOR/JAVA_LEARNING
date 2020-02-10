package com.company.pckg_messenger.pckg_message;

import java.util.Date;

public interface IMessage<T> {
    Object getUser();
    EMessageType getType();

    Date getDate();
    void setDate(Date date);

    T getData();
    void setData(T data);
}

