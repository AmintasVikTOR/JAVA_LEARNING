//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.company;

import com.sun.deploy.security.SelectableSecurityManager;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static int choice = 0;
    public static final String CONSTANT1 = "1 - 1.1: Таблица умножения в консоль";
    public static final String CONSTANT2 = "2 - 1.2: Умножение чисел от 1 до введенного пользователем";
    public static final String CONSTANT3 = "3 - 1.3: Ввод и умножение между собой (с выводом хода вычислений в консоли) (ver.1)";
    public static final String CONSTANT3_2 = "4 - 1.3: Ввод и умножение между собой (с выводом хода вычислений в консоли) (ver.2)";
    public static final String CONSTANT4 = "5 - 2.1.1: Ввод элементов и вывод через консоль (do...while)";
    public static final String CONSTANT5 = "6 - 2.1.2: Ввод элементов и вывод через консоль (while)";
    public static final String CONSTANT6 = "7 - 2.1.3: Ввод элементов и вывод через консоль (for)";
    public static final String CONSTANT7 = "8 - 2.1.4: Ввод элементов и вывод через консоль (foreach)";
    public static final String CONSTANT8 = "9 - 2.2: Вывести каждый 2-й элемент массива";
    public static final String CONSTANT9 = "10 - 3.1: Сортировка выбором";
    public static final String CONSTANT10 = "11 - 3.2.1: Сортировка обменом ('Пузырёк')";
    public static final String CONSTANT11 = "12 - 3.2.2: Сортировка обменом ('Шейкер')";
    public static final String CONSTANT12 = "13 - 3.3: Сортировка с помощью включения";
    public static final String CONSTANT13 = "14 - 3.4: Сортировка слиянием";
    public static final String CONSTANT14 = "15 - 3.5: Сортировка разделением(быстрая сортировка)";
    public static final String CONSTANT15 = "16 - 4: Удаление дубликатов и сортировка массива";
    public static final String CONSTANT16 = "0 - EXIT...";
    public static int[] mer;//it's a public-global array for merge-sort
    public static int cnt_mer = 0;//it's for size to public-global array

    public Main() {
    }

    public static void main(String[] args) {

        full_out();

    }

    public static void full_out() {
        boolean t_f = true;

        do {
            choice = user_dialog();
            switch (choice) {
                case 0:
                    System.out.println("The program will be ended..");
                    t_f = false;
                    break;
                case 1:
                    mult_table();
                    break;
                case 2:
                    factorial();
                    break;
                case 3:
                    inpun_mult();
                    break;
                case 4:
                    inpun_mult2();
                    break;
                case 5:
                    cycle_do_while();
                    break;
                case 6:
                    cycle_while();
                    break;
                case 7:
                    cycle_for();
                    break;
                case 8:
                    cycle_foreach();
                    break;
                case 9:
                    every_twice();
                    break;
                case 10:
                    sort_choice();
                    break;
                case 11:
                    sort_bubble();
                    break;
                case 12:
                    sort_shaker();
                    break;
                case 13:
                    sort_inserted();
                    break;
                case 14:
                    sort_merger();
                    break;
                case 15:
                    sort_fast();
                    break;
                case 16:
                    drop_sort();
                    break;

                default:
                    System.out.println("Incorrect choice! Try again...");
            }
        } while (t_f);

    }

    public static void drop_sort() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input array size ...");
        int n = input.nextInt();//size array
        int[] array_merge = new int[n];
        cnt_mer = n;

        int i = 0;
        int temp = 1;
        //input array
        do {
            System.out.println("Input " + temp + "-element from " + n + ": ");
            array_merge[i] = input.nextInt();
            temp++;
            i++;
        }
        while (i < n);

        mer = array_merge;
        System.out.print("Your original array:");
        for (int out : array_merge) {
            System.out.print(" " + out);
        }
        System.out.print("\n");
        //sort
        //Arrays.sort(array_merge);
        sort_merger_step1(0, n - 1);
        //output sorted array
        System.out.print("Your sorted array:");
        for (int out : array_merge) {
            System.out.print(" " + out);
        }
        int cnt_new = 0, mer_temp = array_merge[0];
        int cc = 1;
        mer_temp = array_merge[0];
        if (array_merge.length != 1) {
            System.out.print("\nYour modify (with deleted replied elements) array: ");
            while (cc < array_merge.length) {
                //mer_temp = array_merge[cc - 1];
                if (mer_temp == array_merge[cc]) {
                    mer_temp = array_merge[cc - 1];
                    cnt_new++;

                }
                mer_temp=array_merge[cc];
                cc=cc+1;

            }
        } else {
            System.out.print("\nYour modify array array has 1-element: ");
            System.out.print(array_merge[0] + "\n");

        }
        //System.out.println("COUNT!!: "+cnt_new);

        int new_array[]=new int [array_merge.length-cnt_new];//create new array
        int var_write=array_merge[0];
        new_array[0]=var_write;
        int na=0;
        for (i=0;i<array_merge.length;i++)
        {
            var_write=array_merge[i];
            if (var_write!=new_array[na])
            {
                new_array[na+1]=array_merge[i];
                na++;
            }
        }
        System.out.println("NEW MASS:");
        for (int out : new_array) {
            System.out.print(" " + out);
        }
        System.out.println("\n---------------------------------");
    }

    public static void quickSort(int[] array, int begin, int end) {
        if (array.length == 0)
            return;

        if (begin >= end)
            return;

        int middle = begin + (end - begin) / 2;
        int elem = array[middle];

        int i = begin, j = end;
        while (i <= j) {
            while (array[i] < elem) {
                i++;
            }

            while (array[j] > elem) {
                j--;
            }

            if (i <= j) {//glass-exchange))
                int glass = array[i];
                array[i] = array[j];
                array[j] = glass;
                i++;
                j--;
            }
        }
        if (begin < j)
            quickSort(array, begin, j);

        if (end > i)
            quickSort(array, i, end);
    }

    public static void sort_fast() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input array size ...");
        int n = input.nextInt();//size array
        int[] array = new int[n];
        int i=0;
        int temp=1;

        //input array
        do {
            System.out.println("Input "+temp+"-element from "+n+": ");
            array[i] = input.nextInt();
            temp++;
            i++;
        }
        while (i<n);

        System.out.print("Your original array:");
        for (int out:array)
        {
            System.out.print(" "+out);
        }
        System.out.print("\n");

        //sort
        quickSort(array,0,array.length-1);
        //output sorted array
        System.out.print("Your sorted array:");
        for (int out:array)
        {
            System.out.print(" "+out);
        }
        System.out.println("\n---------------------------------");

    }

    public static void sort_merger_step2(int begin, int end) {
        int middle = (begin + end) / 2;

        int[] array_step2 = new int[end - begin + 1];

        int temp_begin = begin;

        int temp_middle = middle + 1;

        int temp = 0;

        while ((temp_begin <= middle) || (temp_middle <= end)) {
            if (temp_begin > middle) {
                array_step2[temp++] = mer[temp_middle++];
                continue;
            }
            if (temp_middle > end) {
                array_step2[temp++] = mer[temp_begin++];
                continue;
            }
            if (mer[temp_middle] > mer[temp_begin]) {
                array_step2[temp++] = mer[temp_begin++];
                continue;
            } else {
                array_step2[temp++] = mer[temp_middle++];
                continue;
            }
        }
        for (int i = 0; i < end - begin + 1; i++) {
            mer[i + begin] = array_step2[i];
        }
    }

    public static void sort_merger_step1(int begin, int end) {

        if (begin == end)
            return;

        int middle = (begin + end) / 2;

        sort_merger_step1(begin  , middle); // recursion, step-1 (first chapter array)
        sort_merger_step1(middle + 1, end); // recursion, step-2 (twice chapter array)
        sort_merger_step2(begin, end);
    }

    public static void sort_merger() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input array size ...");
        int n = input.nextInt();//size array
        int[] array_merge = new int[n];
        cnt_mer=n;

        int i=0;
        int temp=1;
        //input array
        do {
            System.out.println("Input "+temp+"-element from "+n+": ");
            array_merge[i] = input.nextInt();
            temp++;
            i++;
        }
        while (i<n);

        mer=array_merge;
        System.out.print("Your original array:");
        for (int out:array_merge)
        {
            System.out.print(" "+out);
        }
        System.out.print("\n");

        //sort
        sort_merger_step1(0, n - 1);

        //output sorted array
        System.out.print("Your sorted array:");
        for (int out:array_merge)
        {
            System.out.print(" "+out);
        }
        System.out.println("\n---------------------------------");

    }
    // sort include/inserted
    public static void sort_inserted() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input array size ...");
        int n = input.nextInt();//size array
        int[] array = new int[n];
        int i=0;
        int temp=1;

        //input array
        do {
            System.out.println("Input "+temp+"-element from "+n+": ");
            array[i] = input.nextInt();
            temp++;
            i++;
        }
        while (i<n);

        System.out.print("Your original array:");
        for (int out:array)
        {
            System.out.print(" "+out);
        }
        System.out.print("\n");

        //sort
        temp=0;
        for (i = 0; i < array.length; i++)
        {
            temp = array[i];
            int j=i-1;
            while(j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
        //output sorted array
        System.out.print("Your sorted array:");
        for (int out:array)
        {
            System.out.print(" "+out);
        }
        System.out.println("\n---------------------------------");

    }

    public static void sort_shaker() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input array size ...");
        int n = input.nextInt();//size array
        int[] array = new int[n];
        int i=0;
        int temp=1;

        //input array
        do {
            System.out.println("Input "+temp+"-element from "+n+": ");
            array[i] = input.nextInt();
            temp++;
            i++;
        }
        while (i<n);

        System.out.print("Your original array:");
        for (int out:array)
        {
            System.out.print(" "+out);
        }
        System.out.print("\n");

        //sort

        temp=0;
        int begin=0;
        int end=array.length-1;
        do {
            for (i=begin; i<end;i++) {
                if (array[i]>array[i+1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            end--;
            for (i=end; i>begin; i--) {
                if (array[i]<array[i-1]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            begin++;
        } while (begin <end);

        //output sorted array
        System.out.print("Your sorted array:");
        for (int out:array)
        {
            System.out.print(" "+out);
        }
        System.out.println("\n---------------------------------");

    }

    public static void sort_bubble() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input array size ...");
        int n = input.nextInt();//size array
        int[] array = new int[n];
        int i=0;
        int temp=1;

        //input array
        do {
            System.out.println("Input "+temp+"-element from "+n+": ");
            array[i] = input.nextInt();
            temp++;
            i++;
        }
        while (i<n);

        System.out.print("Your original array:");
        for (int out:array)
        {
            System.out.print(" "+out);
        }
        System.out.print("\n");

        //sort
        for(i = array.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( array[j] > array[j+1] ){
                    int glass = array[j];
                    array[j] = array[j+1];
                    array[j+1] = glass;
                }
            }
        }
        //output sorted array
        System.out.print("Your sorted array:");
        for (int out:array)
        {
            System.out.print(" "+out);
        }
        System.out.println("\n---------------------------------");

    }

    public static void sort_choice() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input array size ...");
        int n = input.nextInt();//size array
        int[] array = new int[n];
        int i=0;
        int temp=1;

        //input array
        do {
            System.out.println("Input "+temp+"-element from "+n+": ");
            array[i] = input.nextInt();
            temp++;
            i++;
        }
        while (i<n);

        System.out.print("Your original array:");
        for (int out:array)
        {
            System.out.print(" "+out);
        }
        System.out.print("\n");
        //sort
        for (i = 0; i < array.length - 1; i++) {
            int ii = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[ii]) {
                    ii = j;
                }
            }
            int glass = array[i];
            array[i] = array[ii];
            array[ii] = glass;
        }

        System.out.print("Your sorted array:");
        for (int out:array)
        {
            System.out.print(" "+out);
        }
        System.out.println("\n---------------------------------");

    }

    public static void every_twice() {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.print("Your original array: ");
        for (int i=0;i<array.length;i++)
        {
            if (i!=0)
                System.out.print(", "+array[i]);
            else
                System.out.print(array[i]);
        }
        System.out.print("\nEvery twice: ");
        for (int i=1;i<array.length;i+=2)
        {
            if (i!=1)
                System.out.print(", "+array[i]);
            else
                System.out.print(array[i]);
        }
        System.out.print("\n");
        System.out.println("---------------------------------");

    }

    public static void cycle_foreach() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input array size ...");
        int n = input.nextInt();//size array
        int[] array = new int[n];
        int temp=1;//for number
        int temp2=0;
        int i=0;
        //input array
        do {
            System.out.println("Input "+temp+"-element from "+n+": ");
            array[i] = input.nextInt();
            temp++;
            i++;
        }
        while (i<n);

        System.out.println("Your array consists of  "+n+" elements: ");
        //output array
        for (int j:array) {
            if (temp2 != 0) {
                System.out.print(", " + j);
            } else
                System.out.print(j);
            temp2++;
        }
        System.out.print("\n");
        System.out.println("---------------------------------");

    }

    public static void cycle_for() {
        int result = 0;
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Input array size ...");
        int n = input.nextInt();
        int[] array = new int[n];
        int temp = 1;

        int i;
        for(i = 0; i < array.length; ++i) {
            System.out.println("Input " + temp + "-element from " + n + ": ");
            array[i] = input.nextInt();
            ++temp;
        }

        System.out.println("Your array consists of  " + n + " elements: ");

        for(i = 0; i < array.length; ++i) {
            if (i != 0) {
                System.out.print(", " + array[i]);
            } else {
                System.out.print(array[i]);
            }
        }

        System.out.print("\n");
        System.out.println("---------------------------------");
    }

    public static void cycle_while() {
        int result = 0;
        int i = 0;
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Input array size ...");
        int n = input.nextInt();
        int[] array = new int[n];

        for(int temp = 1; i < array.length; ++i) {
            System.out.println("Input " + temp + "-element from " + n + ": ");
            array[i] = input.nextInt();
            ++temp;
        }

        i = 0;
        System.out.println("Your array consists of  " + n + " elements: ");

        for(; i < array.length; ++i) {
            if (i != 0) {
                System.out.print(", " + array[i]);
            } else {
                System.out.print(array[i]);
            }
        }

        System.out.print("\n");
        System.out.println("---------------------------------");
    }

    public static void cycle_do_while() {
        int result = 0;
        int i = 0;
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Input array size ...");
        int n = input.nextInt();
        int[] array = new int[n];
        int temp = 1;

        do {
            System.out.println("Input " + temp + "-element from " + n + ": ");
            array[i] = input.nextInt();
            ++temp;
            ++i;
        } while(i < array.length);

        i = 0;
        System.out.println("Your array consists of  " + n + " elements: ");

        do {
            if (i != 0) {
                System.out.print(", " + array[i]);
            } else {
                System.out.print(array[i]);
            }

            ++i;
        } while(i < array.length);

        System.out.print("\n");
        System.out.println("---------------------------------");
    }

    public static void inpun_mult2() {
        String[] array = new String[]{"2639", "2345"};
        int x2 = 0;
        int full = 0;

        for(Integer i = 0; i < array.length; i = i + 1) {
            char[] symbol = array[i].toCharArray();
            System.out.println("Умножение цифр для числа: " + array[i]);

            for(Integer j = 0; j < array[i].length(); j = j + 1) {
                char char1 = symbol[j];
                int x1 = Integer.parseInt(String.valueOf(char1));
                if (j != 0) {
                    char char2 = symbol[j - 1];
                    x2 = Integer.parseInt(String.valueOf(char2));
                    full *= x1;
                    x2 = Integer.parseInt(String.valueOf(char2));
                    System.out.println("Произведение " + full / x1 + " * " + x1 + "=" + full);
                } else {
                    System.out.println("Первое число = " + x1);
                    full = x1;
                }
            }
        }

    }

    public static void inpun_mult() {
        Integer[] array = new Integer[]{2, 1, 3, 4, 5, 9, 4, 2};
        Integer result = array[0];
        System.out.println("---------------");

        for(Integer i = 0; i < array.length; i = i + 1) {
            if (i > 0) {
                result = result * array[i];
                System.out.println("Temp result: " + result);
            }
        }

        System.out.println("---------------");
        System.out.println("Full result: " + result);
    }

    public static void factorial() {
        int result = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Input number...");
        int n = input.nextInt();

        for(Integer i = 1; i < n + 1; i = i + 1) {
            result *= i;
        }

        System.out.println("Result " + n + "!=" + result);
    }

    public static void mult_table() {
        for(Integer i = 1; i < 10; i = i + 1) {
            for(Integer j = 1; j < 10; j = j + 1) {
                int result = i * j;
                System.out.println("Result " + i + "*" + j + "=" + result);
            }
        }

    }

    public static Integer user_dialog() {
        Integer choice = 0;
        Scanner input = new Scanner(System.in);
        //System.out.println("Make your choice (1-16):");
        System.out.println(CONSTANT1);
        System.out.println(CONSTANT2);
        System.out.println(CONSTANT3);
        System.out.println(CONSTANT3_2);
        System.out.println(CONSTANT4);
        System.out.println(CONSTANT5);
        System.out.println(CONSTANT6);
        System.out.println(CONSTANT7);
        System.out.println(CONSTANT8);
        System.out.println(CONSTANT9);
        System.out.println(CONSTANT10);
        System.out.println(CONSTANT11);
        System.out.println(CONSTANT12);
        System.out.println(CONSTANT13);
        System.out.println(CONSTANT14);
        System.out.println(CONSTANT15);
        System.out.println(CONSTANT16);
        choice = input.nextInt();
        return choice;
    }

    public static void example() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please. choice: \n1-do while\n2-ARRAY\n0-EXIT");
        int choice = input.nextInt();
        switch(choice) {
            case 0:
                System.out.println("The program will be ended..");
                break;
            case 1:
                System.out.println("Choice 1");
                break;
            case 2:
                System.out.println("Choice 2");
                break;
        }

    }

    private static void array() {
        System.out.println("This choice in DEV-process.. Please, wait");
    }

    private static void do_while() {
        int i = 1;
        int sum = 0;

        do {
            System.out.println("i=" + i);
            sum += i;
            if (i == 5) {
                System.out.println("Hi,I=5!!!!");
                break;
            }

            ++i;
        } while(i < 10);

        System.out.println("Sum=" + sum);
    }
}
