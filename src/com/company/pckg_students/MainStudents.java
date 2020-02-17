package com.company.pckg_students;

import com.company.pckg_students.classes.Student;
import com.company.pckg_students.enums.EFirstName;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.nio.file.*;
import java.util.Random;

public class MainStudents {
    public static final Path testFilePath =  Paths.get("C://JAVA//files//studentsList.txt");
    public static final Path filteredStudents =  Paths.get("C://JAVA//files//filteredStudents.txt");
    public static final Path filteredStudents2 =  Paths.get("C://JAVA//files//filteredStudents.txt");
    public static final Path filteredStudentsDel =  Paths.get("C://JAVA//files//filteredStudentsDeleted.txt");


    public static void main(String[] args) throws Exception  {

        //manual append students...
//        Student[] student=new Student [7];
//        student[0]=new Student("Иванов","Иванов", (float) 7.5);
//        student[1]=new Student("Петров","Петров",(float)4.5);
//        student[2]=new Student("Алексеев","Артем",(float)9.3);
//        student[3]=new Student("Алексеев","Иван",(float)8.3);
//        student[4]=new Student("Ратиков","Михаил",(float)5.9);
//        student[5]=new Student("Фрейд","Зигмунд",(float)7.3);
//        student[6]=new Student("Воронов","Рустам",(float)6.2);
//
//        for (int i=0;i<student.length;i++){
//            student[i].infoStudent();
//        }

        //создаем путь с указанием файла...
        //Path testFilePath =  Paths.get("C://JAVA//files//studentsList.txt");
        try {
            //если этого файла нету, тогда создаем
            if (!new File(String.valueOf(testFilePath)).exists()) {
                FileWriter writer = new FileWriter(String.valueOf(testFilePath), false);
                List<Student> collectionStudent = new ArrayList<>();
                for (int i = 0; i < 100; i++) {
                    Student student = new Student();
                    collectionStudent.add(student);
                    writer.write(student.infoStudentPrint());
                    writer.append('\n');
                    writer.flush();
                }
                //закрываем поток
                writer.close();
                System.out.printf("Файл сохранен в директории: "+String.valueOf(testFilePath)+"\nДля дальнейшей работы запустите проект еще раз!");
            }
            else {
                System.out.println("Файл уже существует! Начинаем считывание информации...");
                List<String> collectionStudent = new ArrayList<>();
                FileReader reader=new FileReader(String.valueOf(testFilePath));
                BufferedReader bufferedReader=new BufferedReader(reader);
                String ss;

                //читаем, пока есть следующая строка                
                String sss = "";
                String fName = null,lName=null;
                int rRating=0;
                Student[] student=new Student [100];
                List<Student> collectionStudentReader = new ArrayList<>();
                List<Student> collectionStudentFiltered = new ArrayList<>();//здесь будет храниться отфильтрованный список (ниже 7 баллов)

                int ii=0;
                while ( (sss=bufferedReader.readLine())!=null) {

                    int cnt=0;

                    for (String retval : sss.split(";", 3)) {
                        switch (cnt) {
                            case 0:{
                                fName=retval;
                                break;
                            }
                            case 1:{
                                lName=retval;
                                break;
                            }
                            case 2:{
                                rRating=Integer.parseInt(retval);
                                break;
                            }
                        }
                        cnt++;
                    }
                    student[ii]=new Student(fName,lName, rRating);
                    //collectionStudentReader.add(new Student(fName,lName, rRating));
                    collectionStudentReader.add(student[ii]);
                    ii++;
                }

                //закрываем поток
                bufferedReader.close();
                reader.close();

                System.out.println("---INFO FROM FILE-----");
                //до сортировки..
                for (int i=0;i<collectionStudentReader.size();i++)
                    //System.out.println(student[i].infoStudentPrint());
                    System.out.println(collectionStudentReader.get(i).toString());
                Collections.sort(collectionStudentReader);

                //после сортировки
                System.out.println("-----SORTED----------");
                for (int i=0;i<collectionStudentReader.size();i++)
                    System.out.println(collectionStudentReader.get(i).toString());

                System.out.println("---BAD RATING-----");
                for (int i=0;i<student.length;i++)
                    if (student[i].badRating()){
                        collectionStudentFiltered.add(student[i]);
                    }

                Collections.sort(collectionStudentFiltered);
                for (int i=0;i<collectionStudentFiltered.size();i++)
                    System.out.println(collectionStudentFiltered.get(i).toString());

                //сорханяем отфильтрованную инфу в файл...
//                Path filteredStudents =  Paths.get("C://JAVA//files//filteredStudents.txt");
                        FileWriter writer = new FileWriter(String.valueOf(filteredStudents), false);
                        //List<Student> collectionStudent = new ArrayList<>();
                        for (int i = 0; i < collectionStudentFiltered.size(); i++) {
                            writer.write(collectionStudentFiltered.get(i).toString());
                            writer.append('\n');
                            writer.flush();
                        }
                        //закрываем поток
                        writer.close();
                        System.out.printf("Файл сохранен в директории: "+String.valueOf(filteredStudents));
                   ///////////////////////////
                //читаем отфильтрованную инфу из файла...
//                Path filteredStudents2 =  Paths.get("C://JAVA//files//filteredStudents.txt");
                FileReader reader2=new FileReader(String.valueOf(filteredStudents2));
                BufferedReader bufferedReader2=new BufferedReader(reader2);
                Student[] student2=new Student [100];
                List<Student> collectionStudentReader2 = new ArrayList<>();

                ii=0;
                while ((sss=bufferedReader2.readLine())!=null) {
                    int cnt=0;
                    for (String retval : sss.split(";", 3)) {
                        switch (cnt) {
                            case 0:{
                                fName=retval;
                                break;
                            }
                            case 1:{
                                lName=retval;
                                break;
                            }
                            case 2:{
                                rRating=Integer.parseInt(retval);
                                break;
                            }
                        }
                        cnt++;
                    }
                    student2[ii]=new Student(fName,lName, rRating);
                    //collectionStudentReader.add(new Student(fName,lName, rRating));
                    collectionStudentReader2.add(student2[ii]);
                    ii++;
                }
                //закрываем поток
                bufferedReader2.close();
                reader2.close();

                int rGold;
                System.out.println("\n");
                    for (int k=0;k<3;k++) {
                        rGold = (int) (Math.random() * collectionStudentFiltered.size() + 1);
                        System.out.println("Будет удален: "+collectionStudentReader2.get(rGold).toString());
                        collectionStudentReader2.remove(rGold);
                    }
                System.out.println("\nНовый список");
                for (int i=0;i<collectionStudentReader2.size();i++)
                    System.out.println(collectionStudentReader2.get(i).toString());

//                Path filteredStudentsDel =  Paths.get("C://JAVA//files//filteredStudentsDeleted.txt");
                FileWriter writerDel = new FileWriter(String.valueOf(filteredStudentsDel), false);
                //List<Student> collectionStudent = new ArrayList<>();
                for (int i = 0; i < collectionStudentReader2.size(); i++) {
                    writerDel.write(collectionStudentReader2.get(i).toString());
                    writerDel.append('\n');
                    writerDel.flush();
                }
                //закрываем поток
                writerDel.close();
                System.out.printf("Файл сохранен в директории: "+String.valueOf(filteredStudentsDel));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
