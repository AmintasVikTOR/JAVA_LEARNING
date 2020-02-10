package com.company.pckg_messenger.pckg_saver;

import com.company.pckg_messenger.pckg_chat.IChat;
import com.company.pckg_messenger.pckg_message.IMessage;
import com.company.pckg_messenger.pckg_saver.ISaverChat;

import java.io.*;
import java.util.List;

public class FileSaver implements ISaverChat {
    private FileOutputStream stream;

    public FileSaver() throws FileNotFoundException {
        this("default_name.txt");
    }

    public FileSaver(String fileName) throws FileNotFoundException {
        this(new FileOutputStream(fileName));
    }

    public FileSaver(FileOutputStream stream) {
        this.stream = stream;
    }

    @Override
    public void save(IChat chat) {
        List<? extends IMessage> messages = chat.getMessages();
        try (PrintWriter writer = new PrintWriter(stream)) {
            for (IMessage message : messages) {
                writer.println(message);
            }
        }
    }
}
