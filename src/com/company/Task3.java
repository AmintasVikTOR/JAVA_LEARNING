//Here saved task-3
package com.company;

import java.util.Scanner;

public class Task3 {
 public static void main(String[] args) {

     int choice;
     boolean t_f = true;
     do {
         System.out.println("Take a choice:\n1 - Call from class Main(HomeTask #2)\n2 - Compare 2-sting: 'Мама мыла раму'' и 'Мама' +  'мыла' + 'раму' ");
         System.out.println("3 - Compare 2 string: Input text in console and constant('Мама мыла раму') ");
         System.out.println("0 - Exit");
         Scanner input = new Scanner(System.in);
         choice = input.nextInt();
         Main Task3Class=new Main();
         switch (choice) {
             case 0:
                 System.out.println("The program will be ended..");
                 t_f = false;
                 break;
             case 1:
                 System.out.println("You choice #1");
                 // call in this class a hometask-2 from Main-class
                 //create new object "Mail-class"
                 //i'm use only one method, because this method calls all others methods in the Main-class
                 // and user must make his choice))
                 Task3Class.full_out();
                 break;
             case 2:
                 task_mother1();
                 break;
             case 3:
                 task_mother2();
                 break;
             default:
                 System.out.println("Incorrect choice! Try again...");
                 continue;
         }
         }
     while (t_f);
 }
    public static void task_mother2() {
     String s1="Мама мыла раму";
     System.out.println("Input text for compare with '"+s1+"'");
     Scanner input = new Scanner(System.in);
     String input_string = input.nextLine();
     //if (s1.equals(input_string)
     if (s1==input_string)
         System.out.println("True. Comparison made using '=='");
     //result  returned FALSE, because this method compared links s1 and s2. They are various...
     else
         System.out.println("False. Comparison made using '=='");
    }

    public static void task_mother1() {
        String s1="Мама мыла раму";
        String s2="Мама";
        s2+=" мыла ";
        s2+="раму";
        Boolean t_f=s1.equals(s2);
        if (t_f=true)
            System.out.println("Result your choice (Method EQUALS input strings):" + t_f + "\nbecause method compared chars to strings s1 and s2. They are identical");
        else
            System.out.println("Result your choice (Method EQUALS input strings):" + t_f + "\nbecause method compared chars to strings s1 and s2. They are various");
        //equals returned TRUE, because this method compared symbols to strings..
        System.out.println("Result your choice (Method 'EQUALS':"+t_f);
        if (s1==s2) {
            //result  returned FALSE, because this method compared links s1 and s2. They are various...
            t_f = true;
            System.out.println("Result your choice (Method '==' input strings):" + t_f + "\nbecause method compared links s1 and s2. They are identical");
        }
        else {
            t_f = false;
            System.out.println("Result your choice (Method '==' input strings):" + t_f+"\nbecause method compared links s1 and s2. They are various");
        }
    }
}
