/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 David Erthal
 */

package ex41;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NameSorter {

    public static void main(String[] args) throws IOException {
        int wordCount = 0; // Keep track of number of names.
        String inputLine;
        String inputFile = "src\\ex41\\names.txt";
        String outputFile = "src\\ex41\\names_sorted.txt";
        List<String> lineList = new ArrayList<String>();

        FileReader file = new FileReader(inputFile); // Creating an object "file" to read from our original text file.
        BufferedReader br = new BufferedReader(file);

        while ((inputLine = br.readLine()) != null){
            lineList.add(inputLine);
            wordCount++;
        }
        file.close();

        Collections.sort(lineList); // Alphabetizes the file.

        FileWriter fileWriter = new FileWriter(outputFile);
        PrintWriter out = new PrintWriter(fileWriter); // Our PrinterWriter object "out" will be writing to new file.

        // Print contents to new file.
        out.println("Total of " + wordCount + " names\n" + "-----------------"); // Header for new text file.
        for (String outputLine : lineList) {
            out.println(outputLine);
        }
        out.flush();
        out.close();
        fileWriter.close();
    }
}
