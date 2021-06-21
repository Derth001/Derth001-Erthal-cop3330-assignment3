/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 David Erthal
 */

package ex43;

import java.util.Scanner;

public class WebsiteGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String siteName;
        String author;
        String input;

        System.out.print("Site name: ");
        siteName = scan.nextLine();

        System.out.print("\nAuthor: ");
        author = scan.nextLine();

        System.out.print("Do you want a folder for JavaScript? ");
        input = scan.nextLine();

        while (true) {
            if (input.equalsIgnoreCase("y")) {
                System.out.println("Created ./" + siteName);
                System.out.println("Created ./" + siteName + "/index.html");
                System.out.println("Created ./" + siteName + "/js/");
                break;
            } else if (input.equalsIgnoreCase("n")) {
                break;
            } else {
                System.out.println("Invalid entry. Please enter 'y' or 'n'");
            }
            input = scan.nextLine();
        }

        System.out.print("Do you want a folder for CSS? ");
        input = scan.nextLine();

        while (true) {
            if (input.equalsIgnoreCase("y")) {
                System.out.println("Created ./" + siteName + "/css/");
                break;
            } else if (input.equalsIgnoreCase("n")) {
                break;
            } else {
                System.out.println("Invalid entry. Please enter 'y' or 'n'");
            }
            input = scan.nextLine();
        }
        scan.close();
    }
}
