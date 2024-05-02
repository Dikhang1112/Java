/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

/**
 *
 * @author AN515-57
 */
import java.util.Scanner;
public class Bt1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double randomNum = Math.random();
       int songaunhien = (int) (randomNum *10 )+1;
       int n;
        do {
            System.out.print("Nhap vao so ma ban muon:");
      n =sc.nextInt();
            if(n < songaunhien)
            System.out.println("Ban da nhap so be hon!!");
     else if(n == songaunhien)
            System.out.println("Ban da nhap dung!!");
     else
            System.out.println("Ban da nhap so lon hon!!");
        } while ( n != songaunhien);
     
    }
    
}
