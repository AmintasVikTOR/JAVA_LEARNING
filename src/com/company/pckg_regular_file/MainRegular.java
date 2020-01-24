package com.company.pckg_regular_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainRegular {
    public static void main(String[] args) throws IOException {
        //Regular myRegular=new Regular();
        //myRegular.myRegular();

        String s1="война";

        FileReader fileReader=new FileReader("C://myfile//full.txt");
        //Scanner scanner=new Scanner(fileReader);

        BufferedReader bufferedReader=new BufferedReader(fileReader);
        ArrayList <String> list=new ArrayList<>();


        int i=0;
        int cntWarLine=0;
        int cntWar=0;
        String value="";
        s1=s1.toUpperCase();

        Pattern pattern1 = Pattern.compile(s1+"(\\h*)");


        while(fileReader.ready()){
            //строку из файла загоняем в переменную
            String temp=bufferedReader.readLine();

            for (String s11 : temp.split(" ")){
                String sss =s11.toUpperCase();
                Matcher match1 = pattern1.matcher(sss);
                if (match1.find()) {
                    cntWar++;
                }
//                if (sss.contains(s1))
//                    cntWar++;
            }


        }

        //закрываемся...
        bufferedReader.close();


        System.out.println("Количество слов 'ВОЙНА'... "+cntWar);

    }
}
