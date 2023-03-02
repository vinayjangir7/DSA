package com.dsa.recursion.io;


import java.io.File;
import java.util.Objects;

public class CalculateDirectorySize {
    public static long getFilesSize(File directory) {
        long fileSize = 0;
        if (directory.isFile())
            return directory.length();
        else {
            for (File file : Objects.requireNonNull(directory.listFiles())) {
                if (file.isFile())
                    fileSize += file.length();
                else
                    return fileSize + getFilesSize(file);
            }
            return fileSize;
        }
    }

    public static void main(String[] args) {
        String path = "C:\\Users\\username\\Downloads";
        File directory = new File(path);
        System.out.println(getFilesSize(directory) / 1024);
    }

}
