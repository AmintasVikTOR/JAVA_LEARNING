package com.company.pckg_messenger;

import com.company.pckg_messenger.pckg_chat.TextChat;
import com.company.pckg_messenger.pckg_saver.ConsoleSaver;
import com.company.pckg_messenger.pckg_saver.FileSaver;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MessangerMain {
    public static Registration regCenter = new Registration();

    public static void main(String[] args) {
        TextChat textChat = new TextChat();

        textChat.save(new ConsoleSaver());
        try {
            textChat.save(new FileSaver(new FileOutputStream("c:\\1\\fileMessanger.txt")));

            String name = "test1@gmail.com";
            String pass = "1234";

            createUser();

            createUser();

            //#2
            name = "test1@gmail.com";
            if(Validation.validateName(name)){
                pass = "1234";
                //если валидация пароля пройдена, тогда смотрим далее..
                if(Validation.validatePass(pass)){
                    regCenter.registration(name,pass);

                }

            }



            //regCenter.registration(name, pass);
            //return regCenter.registration(name, pass);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
        }
    }

    public static User createUser(){
        String name = "test1@gmail.com";
        if(Validation.validateName(name)){

        }
        String pass = "1234";
        if(Validation.validatePass(pass)){

        }
        return regCenter.registration(name, pass);
    }
}
