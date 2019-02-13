package com.monis.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTester {
    public static void main(String[] args) {
        try {
            File jkDir = new File("D:\\jk");
            jkDir.mkdir();
            FileWriter fw = new FileWriter("D:\\jk\\output.txt");
            fw.write("abc");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
