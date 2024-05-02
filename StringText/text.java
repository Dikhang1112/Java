///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
package com.mycompany.stringjava;

/**
 *
 * @author AN515-57
 */
import java.io.*;
import java.io.PrintWriter;
import java.util.Scanner;
public class text {
    public static void main(String[] args) throws Exception{
File input = new File("src/main/Resources/Data.txt");
File output = new File("src/main/Resources/Output.txt");
try (PrintWriter w = new PrintWriter(output);
       BufferedReader writer = new BufferedReader(new FileReader(input)))
{
String line;
while((line = writer.readLine()) != null)
{    
String s  = line.replaceAll("Con","Bin");
w.println(s);
}
    }
try(Scanner sc = new Scanner(input))
{
    while(sc.hasNextLine())
    {
        String line = sc.nextLine();
        System.out.println(line);
    }
    sc.close(); 
}

    }
}
