/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 David Erthal
 */

package ex42;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ParsingData {
    public static void main(String[] args) throws IOException {
        String[] parsedArray; // An array of names, to be parsed using the comma as the delimeter.
        FileReader inputFile = new FileReader("src\\ex42\\salaryList.csv"); // File to read from
        BufferedReader br = new BufferedReader(inputFile); // File to modify

        // Print the parsed data correctly
        System.out.println("First      Last     Salary\n" + "--------------------------");
        for (String line = br.readLine(); line != null; line = br.readLine()) {
            parsedArray = line.split(",");
            System.out.printf("%-11s", parsedArray[0]); // Prints first name
            System.out.printf("%-10s", parsedArray[1]); // Prints last name
            System.out.printf("%-10s", parsedArray[2]); // Prints salary
            System.out.println(); // Creates a new line.
        }
        // Close files we are not using anymore.
        br.close();
        inputFile.close();
    }
}
