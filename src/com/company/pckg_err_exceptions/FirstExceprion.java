package com.company.pckg_err_exceptions;

import java.io.IOException;

public class FirstExceprion extends Exception {

    //конструируем... а-ля IOException :))
    public FirstExceprion (String message) {
        super(message);
    }

    public FirstExceprion () {
        super();
    }

    //это может пригодиться в дальнейшем...
   /* public FirstExceprion (String message) {
        super(message);
    }


    public FirstExceprion (String message, Throwable cause) {
        super(message, cause);
    }
    public FirstExceprion (Throwable cause) {
        super(cause);
    }*/
    //IOExc.. end


    //throws для того, чтобы компилятор был в курсе, что вызов этого метода может обернуться
    //исключительной ситуацией...
    public int myExceptionFirst (int a) throws FirstExceprion {
            int b=0,c;
            //я хочу, чтобы пользователь вводил исключительно целочисленные значения больше нуля..
            //загоняем блок в проверку и если ввод меньше или равно нуля... сообщаем с вызовом except..
            if (a<=0)
                try{
                    c=a/b;
                }
            catch (Exception ex){
                    throw new FirstExceprion("Говорит Родитель! Введите значение больше нуля!");
                }
            return a;
    }
}
