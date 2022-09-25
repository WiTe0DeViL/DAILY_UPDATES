package fileHandling;

import java.io.*;
import java.util.*;

public class FileHandling {
    public static void main(String[] args) {
        int lineCount = 0, wordCount = 0;
        try {
            File javaFile = new File("C:\\Users\\V1CT0R\\Desktop\\Intelij\\src\\FileHandling.java");
            File NewFile = new File("C:\\Users\\V1CT0R\\Desktop\\Intelij\\src\\FileHandling.java");
            if (NewFile.exists()) {
                NewFile.createNewFile();
                System.out.println("created!");
            } else System.out.println("Already Exists");
            FileWriter newFile = new FileWriter("C:\\Users\\V1CT0R\\Desktop\\Intelij\\src\\FileHandling.txt");
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