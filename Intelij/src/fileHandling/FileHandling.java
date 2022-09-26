package fileHandling;

import java.io.*;
import java.util.*;

public class FileHandling {
    public static void main(String[] args) {
        int lineCount = 0, wordCount = 0;
        try {
            // File javaFile = new File(".").getAbsoluteFile(); this command get my directory location
            // You can give file location also which means java file
            
            // Location of my java file
            File javaFile = new File("Intelij\\src\\fileHandling\\FileHandling.java").getAbsoluteFile();

            // new text File to be created in this location
            File NewFile = new File("Intelij\\src\\fileHandling\\FileHandling.txt").getAbsoluteFile();

            //It will check whether file is present are not
            if (NewFile.createNewFile())
                System.out.println("created!");
            else System.out.println("Already Exists");
            FileWriter newFile = new FileWriter(NewFile.toString());
            Scanner javaReader = new Scanner(javaFile);
            while (javaReader.hasNextLine()) {
                lineCount++;
                String line = javaReader.nextLine();
                wordCount += line.split("\\s").length;
                newFile.write(line + "\n");
            }
            newFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Hi My name is a JavaFile\n");
        System.out.printf("I have %d lines in my file%n", lineCount);
        System.out.printf("and I also have %d words in my file%n", wordCount);
    }
}