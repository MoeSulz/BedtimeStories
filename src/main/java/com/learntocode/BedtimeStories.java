package com.learntocode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        try {
           FileInputStream file = new FileInputStream("Goldilocks.txt");
            Scanner scanner = new Scanner(file);

            String input;
            int lines = 1;

            while(scanner.hasNextLine()){
                input = scanner.nextLine();
                System.out.println(lines + ". " + input);
                lines++;

            }

            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
