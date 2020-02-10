package com.company.pckg_messenger.pckg_chat;
import com.company.pckg_messenger.pckg_message.IMessage;
import com.company.pckg_messenger.pckg_saver.ISaverChat;
import java.util.List;

public interface IChat {
    long countMessages();
    long countUsers();

    void addMessage(IMessage message);
    void addMessage(IMessage[] message);
    void addMessage(List<IMessage> message);
    List<? extends IMessage> getMessages();
    void save(ISaverChat saver);
}