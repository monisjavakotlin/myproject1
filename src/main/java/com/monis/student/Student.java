package com.monis.student;

public class Student {
    String id;
    String name;
    int english;
    int math;
    static int pass = 60;

//    public Student(){}

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public int highest() {
//        int max = (english > math) ? english : math;

       /* int max = 0;
        if (english > math) {
            max = english;
        } else {
            max = math;
        }*/
        return (english > math) ? english : math;
    }

    public void print() {
        System.out.print(name + "\t" + english + "\t" + math +
                "\t" + getAverage() + "\t" +
                ((getAverage() >= pass) ? "PASS" : "FAILED"));
        char grading = 'F';
        switch (getAverage()/10) {
            case 10:
            case 9:
                grading = 'A';
                break;
            case 8:
                grading = 'B';
                break;
            case 7:
                grading = 'C';
                break;
            case 6:
                grading = 'D';
                break;
            default:
                grading = 'F';
        }
/*        if (getAverage() >= 90 && getAverage() <= 100) {
            grading = 'A';
        } else if (getAverage() >= 80 && getAverage() <= 89) {
            grading = 'B';
        } else if (getAverage() >= 70 && getAverage() <= 79) {
            grading = 'C';
        } else if (getAverage() >= 60 && getAverage() <= 69) {
            grading = 'D';
        }*/
        System.out.println("\t" + grading);

       /* if (getAverage() >= 60) {
            System.out.println("\tPASS");
        } else {
            System.out.println("\tFAILED");
        }*/
    }

    public int getAverage() {
        return (english+math)/2;
    }
}
