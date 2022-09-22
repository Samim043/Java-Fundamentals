package com.sam.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Read {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\Public\\Documents\\file.txt");
        BufferedReader reader = Files.newBufferedReader(path);
        String s = reader.readLine();

        while(s!=null)
        {
            System.out.println(s);
            s= reader.readLine();

        }

        BufferedWriter writter = Files.newBufferedWriter(path);
        String s1 = "Nahid";
        writter.append(s1);

    }
}
