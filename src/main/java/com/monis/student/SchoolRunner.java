package com.monis.student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
//        userInput();
        Student.pass=50;
        Student stu = new Student("monis",25,90);
        Student stu2 = new Student("snow", 60, 40);
        Student stu3 = new Student("lulu", 30, 55);
        GraduateStudent gstu = new GraduateStudent("maxx", 55, 65, 60);
        gstu.print();
        stu.print();
        stu2.print();
        stu3.print();
        System.out.println("High score : " + stu.highest());
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter student's name : ");
        String name = scanner.next();
        System.out.println("Please enter student's english : ");
        int english = scanner.nextInt();
        System.out.println("Please enter student's math : ");
        int math = scanner.nextInt();
        Student stu = new Student(name,english,math);
        stu.print();
        System.out.println("High score : " + stu.highest());
    }
}
