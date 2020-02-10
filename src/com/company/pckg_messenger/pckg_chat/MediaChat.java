package com.company.pckg_messenger.pckg_chat;

import com.company.pckg_messenger.User;

import java.util.Set;
import com.company.pckg_messenger.pckg_chat.IChat;

public class MediaChat extends AChat implements IChat {

    public MediaChat(Set<User> users) {
        super(users);
    }
}