package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args)  throws FileNotFoundException {

        var file = new File("test.próba");
        var fileReader = new FileReader(file);
        var bufferedReader = new BufferedReader(fileReader);

        int x = Test.longMethodName();
        x = 5;
    }
}
