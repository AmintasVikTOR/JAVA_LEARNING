package com.company.pckg_messenger;

import java.util.LinkedHashMap;
import java.util.Map;

public class Registration {

    private final Map<String, User> users = new LinkedHashMap<>();

    public User registration(String name, String pass){
        //if(users.containsKey(name)){
        if(users.containsValue(name)){
            throw new IllegalArgumentException("Пользователь с таким именем уже существует");
        }
        System.out.println(users.size());

        //users.put(name,);
        return (new User((long) (users.size() + 1), name, pass));
        //return
        }
}

