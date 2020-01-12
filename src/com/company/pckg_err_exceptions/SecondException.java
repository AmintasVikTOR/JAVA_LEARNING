package com.company.pckg_err_exceptions;

public class SecondException extends FirstExceprion {

    @Override
    public int myExceptionFirst(int a) throws SecondException {
        int tmp=0;
        if (a<=0) {
            try {
                //System.out.println("Говорит предок! Введите значение больше 0! Будет вызван родитель!");
                return super.myExceptionFirst(a);
            }
            catch (SecondException ee){
                System.out.println("Говорит предок! Введите значение больше 0! Будет вызван родитель!");
            } catch (FirstExceprion firstExceprion) {
                System.out.println("Сообщение из 2 класса со ссылкой на 1-й");
            }

        }
        return a;
        //else {
//            System.out.println("Говорит предок! Введено корректное значение!");
//            return a;
//        }
    }

}
