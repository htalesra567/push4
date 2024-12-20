package com.cdac.placement;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String filePath = "file.txt";
        
        // 1. Create and write 10 lines of code into the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("# This is line 1 of code\n");
            writer.write("print('Hello, World!')  # This is line 2\n");
            writer.write("x = 5  # This is line 3\n");
            writer.write("y = 10  # This is line 4\n");
            writer.write("sum = x + y  # This is line 5\n");
            writer.write("print(sum)  # This is line 6\n");
            writer.write("for i in range(5):  # This is line 7\n");
            writer.write("    print(i)  # This is line 8\n");
            writer.write("def greet():  # This is line 9\n");
            writer.write("    return 'Greetings!'  # This is line 10\n");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // 2. Read the file and print the 10th line
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 0;
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                if (lineNumber == 10) {
                    System.out.println("The 10th line is: " + line);
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
		
	}

}
