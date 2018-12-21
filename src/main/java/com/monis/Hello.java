package com.monis;

import com.monis.student.Student;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello");
//        Person p = new Person();
//        Person p = new Person(66.5f, 1.7f);
        Person p = new Person("monis",66.5f, 1.7f);
        p.hello();
        p.weight = 66.5f;
        p.height = 1.7f;
        System.out.println(p.bmi());

        int score = 88;
        System.out.println(score >= 60 && score < 90);
        System.out.println(score < 80 || score > 90);
        char c = 'A';
        System.out.println(c > 60);
        System.out.println(c > 'a');

        String s = "abcde";
        System.out.println(s.charAt(3));
        System.out.println(s.length());
        System.out.println(s.substring(3));
        System.out.println(s.substring(1,4));

        String s1 = null;

       /* int age = 19;
        Integer age2 = 19;
        age2.toString();
        char c = '我';
        Character c2 = 'A';
        byte b = 120;
        float weight = 66.5f;
        double height = 1.7;
        boolean adult = true;
        String name = "monis";*/

    }
}
