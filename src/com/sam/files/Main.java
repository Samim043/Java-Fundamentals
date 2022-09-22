package com.sam.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\BS973\\Documents");

        boolean isExists = Files.exists(path);
        System.out.println(isExists);
        boolean isSame = Files.isSameFile(path, Path.of("C:\\Users"));
        System.out.println(isSame);
    }
}
