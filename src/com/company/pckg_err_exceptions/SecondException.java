package com.company.pckg_err_exceptions;

public class SecondException extends FirstExceprion {

    @Override
    public int myExceptionFirst(int a) throws SecondException {
        if (a<=0) {
            try {
                //System.out.println("Говорит предок! Введите значение больше 0! Будет вызван родитель!");
                return super.myExceptionFirst(a);
            }
            catch (SecondException ee){
                System.out.println("Говорит наследник! Введите значение больше 0! Будет вызван родитель!");
            } catch (FirstExceprion firstExceprion) {
                System.out.println("Сообщение из 2 класса со ссылкой на 1-й");
            } catch (Exception e) {
                //e.printStackTrace();
                System.out.println("Тут какая-то ошибка по Exception из 2-го моего класса!");
            }

        }
        return a;
        //else {
//            System.out.println("Говорит предок! Введено корректное значение!");
//            return a;
//        }
    }

    public int arraySize (int size) throws SecondException {
            if (size<=0)
                throw new SecondException("Введите значение больше нуля!", this);
        return Math.abs(size);
    }

    //конструируем...
    public SecondException (String message, Throwable b) {
        super(message, b);
    }

    public SecondException () {
        super();
    }

    public SecondException (String message) {
        super(message);
    }

//    @Override
//    public String getMessage() {
//        return "Ошибка в обработчике\n"+super.getMessage();
//    }
}
