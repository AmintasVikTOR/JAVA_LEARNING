package com.company.pckg_students.classes;

import com.company.pckg_calculate.COperations;
import com.company.pckg_students.enums.EFirstName;
import com.company.pckg_students.enums.ELastName;
import com.company.pckg_students.interfaces.IStudent;
import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Random;

public class Student implements IStudent, Comparable<Student> {
    private String firstName;
    private String lastName;
    private int rating;
    private IStudent student;


    public Student (){
        //получаем случайную фамилию из имеющегося enum...
        Random randomFirstName=new Random();
        EFirstName fName = EFirstName.values()[randomFirstName.nextInt(EFirstName.values().length)];
        this.firstName=fName.toString();

        //получаем случайное имя из имеющегося enum...
        Random randomLastName=new Random();
        ELastName lName = ELastName.values()[randomLastName.nextInt(ELastName.values().length)];
        this.lastName=lName.toString();

        //получаем случайную оценку...
        //Random randomRating=new Random();
        //DecimalFormat df1=new DecimalFormat("##");//шаблон..
        this.rating=(int) ( Math.random() * 11 );
        //this.rating=Integer.parseInt(df1.format(randomRating.nextInt()*11));
    }
    //constructorStudent
    public Student (String firstName, String lastName, int rating){
        //this.firstName=firstName;
        //this.lastName=lastName;
        //this.rating=rating;
        setFirstName(firstName);
        setLastName(lastName);
        setRating(rating);
    }


    public void infoStudent() {
        System.out.printf("Фамилия: "+getFirstName()+"\nИмя: "+getLastName()+"\nОценка: "+ getRating()+"\n");
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getFirstName() {
        return this.firstName;
    }


    public String getLastName() {
        return this.lastName;
    }

    public int getRating() {
        return this.rating;
    }
    public String infoStudentPrint() {
        return getFirstName()+";"+getLastName()+";"+ getRating();
        //System.out.printf("Фамилия: "+getFirstName()+"\nИмя: "+getLastName()+"\nОценка: "+ getRating()+"\n");
    }

    //это для сортировки...
    @Override
    public int compareTo(Student o) {
        int compQuanty= ((Student) o).getRating();
        return this.rating - compQuanty;

    }

    //это для вывода инфы чз список
    @Override
    public String toString() {
        return firstName + ';' +
                lastName + ';'+
                rating;
    }

    public boolean badRating (){
        if (this.getRating()<7)
            return true;
        else
            return false;
    }
}
