package com.company.pckg_messenger.pckg_chat;
import com.company.pckg_messenger.User;
import com.company.pckg_messenger.pckg_message.EMessageType;
import com.company.pckg_messenger.pckg_message.IMessage;


import java.io.Serializable;
import java.util.Set;

public class TextChat extends AChat implements IChat, Serializable {

    public TextChat() {
        super();
    }

    public TextChat(Set<User> users) {
        super(users);
    }

    @Override
    public void addMessage(IMessage message) {
        if(!EMessageType.TEXT.equals(message.getType())){
            throw new IllegalArgumentException("Это только текстовый чат");
        }
        super.addMessage(message);
    }
}
