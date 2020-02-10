package com.company.pckg_messenger.pckg_chat;

import com.company.pckg_messenger.User;
import com.company.pckg_messenger.pckg_message.IMessage;
import com.company.pckg_messenger.pckg_saver.ISaverChat;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class AChat implements IChat {
    private final List<IMessage> messages = new ArrayList<>();
    private final Set<User> users = new HashSet<>();

    public AChat() {
    }

    public AChat(Set<User> users) {
        users.addAll(users);
    }

    @Override
    public void addMessage(IMessage message) {
        if(this.users.contains(message.getUser())){
            this.messages.add(message);
        } else {
            throw new IllegalArgumentException("Вас нет в этом чате");
        }
    }

    @Override
    public void addMessage(IMessage[] message) {
        if(message != null){
            for (IMessage iMessage : message) {
                this.addMessage(iMessage);
            }
        }
    }

    public void addMessage(List<IMessage> message) {
        if(message != null){
            for (IMessage iMessage : message) {
                this.addMessage(iMessage);
            }
        }
    }

    @Override
    public List<? extends IMessage> getMessages() {
        return this.messages;
    }

    @Override
    public void save(ISaverChat saver) {
        saver.save(this);
    }

    @Override
    public long countMessages() {
        return this.messages.size();
    }

    @Override
    public long countUsers() {
        return this.users.size();
    }
}

