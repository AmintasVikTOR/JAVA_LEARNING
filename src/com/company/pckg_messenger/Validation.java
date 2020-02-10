package com.company.pckg_messenger;

public class Validation {

    private String name;
    private static boolean tf;
    //для проверки корректности имени (эл.почта)
    public static boolean validateName(String name){
        if (name=="test1@gmail.com")
            tf=true;
        else
            tf=false;
        return tf;
    }

    //для проверки корректности пароля
    public static boolean validatePass(String pass){
        if (pass=="1234")
            tf=true;
        else
            tf=false;
        return tf;
    }
}
