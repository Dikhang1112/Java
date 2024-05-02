/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author AN515-57
 */
public class Bt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao bac cua da thuc:");
        int n = sc.nextInt();
        System.out.print("Nhap vao gia tri cua x:");
        int x = sc.nextInt();
        double gt = 0;
        for ( int i = 0; i<= n; i++)
        {
            System.out.printf("a%d = ",i);
            double a = sc.nextDouble();
            gt += a * Math.pow(x, i);
        }
        System.out.println("Gia tri cua da thuc la:" + gt);
    }
    
}
