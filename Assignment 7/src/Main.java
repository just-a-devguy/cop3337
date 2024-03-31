/*
 * Adler G Luders
 * COP 3337
 * Assignment 7
 * 17 March 2024
 */

import java.util.*;
import java.io.*;

public class Main {

  public static void main(String args[]) {
    System.out.println("test");

    File userInput = new File("input.txt");
    File outFile = new File("output.txt");
    try (BufferedReader reader = new BufferedReader(new FileReader(userInput));
        PrintWriter writer = new PrintWriter(outFile)) {

      String line;
      while ((line = reader.readLine()) != null) {
        writer.println(line.toUpperCase());
      }

      reader.close();
    } catch (IOException e) {
      // TODO: handle exception
      System.err.println("Error: " + e.getMessage());
    }

  }
}