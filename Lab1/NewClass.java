/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

/**
 *
 * @author AN515-57
 */
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) throws Exception {
         File inputFile = new File("src/main/resources/Data.txt");
                Scanner fileScanner = new Scanner(inputFile);
                String sFile = fileScanner.nextLine();
                sFile = sFile.replaceAll("\\{file}", "tap tin");
                try (PrintWriter f = new PrintWriter(inputFile)) {
                    f.println(sFile);
                }
    }
}

