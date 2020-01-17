package com.company.pckg_err_exceptions;

import com.sun.xml.internal.bind.api.Bridge;
import com.sun.xml.internal.ws.api.model.CheckedException;
import com.sun.xml.internal.ws.api.model.ExceptionType;
import com.sun.xml.internal.ws.api.model.JavaMethod;
import com.sun.xml.internal.ws.api.model.SEIModel;
import com.sun.xml.internal.ws.model.CheckedExceptionImpl;

import java.io.IOException;

public class FirstExceprion extends Exception {


    //конструируем... а-ля IOException :))
    public FirstExceprion (String message) {
        super(message);
    }

    public FirstExceprion () {
        super();
    }

    public FirstExceprion (String message, Throwable cause) {
        super(message, cause);
    }
    public FirstExceprion (Throwable cause) {
        super(cause);
    }
    //IOExc.. end


    //throws для того, чтобы компилятор был в курсе, что вызов этого метода может обернуться
    //исключительной ситуацией...
    public int myExceptionFirst (int a) throws Exception {
            int b=1,c;
            //я хочу, чтобы пользователь вводил исключительно целочисленные значения больше нуля..
            // загоняем блок в проверку и если ввод меньше или равно нуля... сообщаем с вызовом except..
           // я вынужден буду прервать выполнение программы с генерацией своего типа исключения FirstExceprion с помощью throw

        if ((a/b)<=0) {
            System.out.println("Возникла ошибка. Детали ошибки:");
            //throw new Exception();
            throw new FirstExceprion("Говорит Родитель! Введите значение больше нуля!", this);
        }
            return a;
    }

    @Override
    public String getMessage() {
        return "Ошибка в обработчике\n"+super.getMessage();
    }

}
