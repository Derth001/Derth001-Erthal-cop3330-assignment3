/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 David Erthal
 */

package ex46;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FrequencyFinder {

    public static void main(String[] args) throws IOException {
        File file = new File("src\\ex46\\words.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        Map<String, Integer> wordMap = new HashMap<String, Integer>();
        Map<String, Integer> newWordMap = new HashMap<String, Integer>();
        List<Map.Entry<String, Integer> > list = new LinkedList<Map.Entry<String, Integer> >();

        String line;
        String[] words;

        // Go through file once to add values into a HashMap
        while ((line = reader.readLine()) != null) {
            words = line.split(" ");

            for (String word : words) {
                if (wordMap.containsKey(word)) {
                    //System.out.println("Key already inside HashMap. Adding one more to value");
                    wordMap.put(word, wordMap.get(word) + 1); // Updates value
                } else {
                    //System.out.println("Adding key");
                    wordMap.put(word, 1);
                }
            }
        }

        // Print pairs:
        for (String key : wordMap.keySet()) {
            System.out.printf("%-10s", key + ":");
            for (int val = 0; val <= wordMap.get(key); val++) {
                System.out.print("*"); // Prints the amount of necessary '*'.
            }
            System.out.println();
        }
    }
}
