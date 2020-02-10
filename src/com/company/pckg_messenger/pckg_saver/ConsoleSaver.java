package com.company.pckg_messenger.pckg_saver;


import com.company.pckg_messenger.pckg_chat.IChat;
import com.company.pckg_messenger.pckg_message.IMessage;

import java.util.List;

public class ConsoleSaver implements ISaverChat {
    @Override
    public void save(IChat chat) {
        List<? extends IMessage> messages = chat.getMessages();
        for (IMessage message : messages) {
            System.out.println(message);
        }
    }
}

