package com.company.pckg_regular_file;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular {

    public void myRegular() {
        //+ один или больше
        //* может быть, может не быть
        //? один раз или НИсколько

        //h пробел или табуляция

        //find() - Ищет подстроку вводной строки, которая совпадает с шаблоном
        //matches - Ищет совпадения всей строки и шаблона

        String mgs_out = "";
        String message = "Я люблю JAVA";
        Pattern pattern1 = Pattern.compile("JAVA(\\h+)");
        Pattern pattern2 = Pattern.compile("JAVA(\\h*)");
        Pattern pattern3 = Pattern.compile("JAVA(\\h?)");
        Matcher match1 = pattern1.matcher(message);
        Matcher match2 = pattern2.matcher(message);
        Matcher match3 = pattern3.matcher(message);

        // ничего не выведет, т.к. после слова JAVA д.б. минимум 1 пробел
        int cnt = 1;


        System.out.print("Result (+) of method 'find():");
        while (match1.find()) {
            System.out.println(match1.group());
            System.out.println("start(): " + match1.start());
            System.out.println("end(): " + match1.end());
            System.out.println("Number of match: " + cnt);
            cnt++;
        }
        if (cnt == 1)
            System.out.println(" no result!");

        System.out.println("------------------");

        cnt = 1;
        //Выведет ток 1 раз, т.к. условие * необязательно

        System.out.println("Result (*) of method 'find():");
        while (match2.find()) {
            System.out.println(match2.group());
            System.out.println("start(): " + match2.start());
            System.out.println("end(): " + match2.end());
            System.out.println("Number of match: " + cnt);
            cnt++;
        }
        if (cnt == 1)
            System.out.println(" no result!");

        System.out.println("------------------");

        cnt = 1;
        //Выведет все имеющиеся совпадения по слову, т.к. по условию ? может встречаться, может не встречаться \h

        System.out.println("Result (?) of method 'find():");
        while (match3.find()) {
            System.out.println(match3.group());
            System.out.println("start(): " + match3.start());
            System.out.println("end(): " + match3.end());
            System.out.println("Number of match: " + cnt);
            cnt++;
        }
        if (cnt == 1)
            System.out.println(" no result!");


        System.out.println("------------------");

        System.out.println("Result (+) of method 'matches(): " + match1.matches());
        System.out.println("Result (*) of method 'matches(): " + match2.matches());
        System.out.println("Result (?) of method 'matches(): " + match3.matches());
    }
}
