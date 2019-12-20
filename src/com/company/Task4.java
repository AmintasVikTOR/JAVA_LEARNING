//Here saved task-3
package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        boolean t_f = true;
        int choice=0;
        do {
            //System.out.println("Make your choice (0-3):");
            //System.out.println("Heads or Tails?");
            choice = user_dialog();
            switch (choice) {
                case 0:
                    t_f=false;
                    System.out.println("The program will be closed");
                    break;
                case 1:
                    HeadsVSTails();
                    break;

            }
        }
        while (t_f);
    }

    public static void HeadsVSTails() {
        int cnt=0, number=0, randomium=0, head=0, tail=0;
        System.out.println("Input random number (MAX="+Integer.MAX_VALUE+")");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        if (number!=0 && number>0 && number<=Integer.MAX_VALUE)
        {
            for (cnt=0;cnt<number;cnt++)
            {
                randomium=(int) (Math.random()*2);
                switch (randomium){
                    case 0:
                        head++;
                        //System.out.println("Head "+randomium);
                        continue;
                    case 1:
                        tail++;
                        //System.out.println("Tail "+randomium);
                        continue;
                    default:
                        System.out.println("Don't have a match!");
                        break;
                }

            }
            DecimalFormat df1=new DecimalFormat("##.###");
            DecimalFormat df2=new DecimalFormat("##.###");
            System.out.println("Counts HEAD (ОРЕЛ):"+head);
            System.out.println("Counts TAIL (решка):"+tail);
            System.out.println("In percent:\nОРЕЛ: "+ df1.format((float)(head)/(float)(number)*100)+
                    "%\nРЕШКА:"+ df2.format((float)(tail)/(float)(number)*100)+"%");
        }
        else
            System.out.println("Uncorrected number!");

    }
    public static Integer user_dialog() {
        Integer choice = 0;
        System.out.println("Make your choice (0-3):");
        System.out.println("1 - Heads or Tails ?");
        System.out.println("0 - Exit");
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();
        return choice;
    }

}
