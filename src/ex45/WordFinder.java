/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 David Erthal
 */

package ex45;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordFinder {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        File file = new File("src\\ex45\\word.txt");
        File newFile = new File("src\\ex45\\newWord.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        BufferedWriter writer = new BufferedWriter(new FileWriter(newFile));
        String line = "";

        System.out.println("What word do you want to replace with 'use'?");
        String inputWord = scan.nextLine();

        while ((line = reader.readLine()) != null){
            String[] array = line.split("\"|\\ ");

            for (String word : array){
                if (word.equals(inputWord)) {
                    word = "use";
                }

                if (word.equals(".") || word.equals("\"")) {
                    writer.write(word); // Writes word to new file
                } else {
                    writer.write(word + " ");
                }
            }
            writer.close();
        }
    }
}
