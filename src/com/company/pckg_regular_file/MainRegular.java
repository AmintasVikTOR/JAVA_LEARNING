package com.company.pckg_regular_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MainRegular {
    public static void main(String[] args) throws IOException {
        //Regular myRegular=new Regular();
        //myRegular.myRegular();

        String s1="ВОЙНА";

        FileReader fileReader=new FileReader("C://myfile//full.txt");
        //Scanner scanner=new Scanner(fileReader);

        BufferedReader bufferedReader=new BufferedReader(fileReader);
        ArrayList <String> list=new ArrayList<>();


        int i=0;
        int cntWar=0;
        String value="";

        //Pattern pattern1 = Pattern.compile("Война(\\h*)");
        //Matcher match1;

        while(fileReader.ready()){
            //строку из файла загоняем в переменную
            String temp=bufferedReader.readLine();
            String sss=temp.toUpperCase();
            if (sss.contains(s1))
                cntWar++;
        }

        //закрываемся...
        bufferedReader.close();


        System.out.println("Количество строк со значением 'ВОЙНА'... "+cntWar);

    }
}
