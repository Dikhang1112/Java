/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stringjava;

/**
 *
 * @author AN515-57
 */
public class Theory {

    public static void main(String[] args) {
 
        StringBuilder chuoi = new StringBuilder();
        // 1. Them vao cuoi chuoi
        chuoi.append("Xin chao,");
        chuoi.append("minh ten la Khang");
        System.out.println(chuoi);
        // 2. insert(index,chuoi can chen)
        chuoi.insert(4, "concac ");
        System.out.println(chuoi);
        // 3. delete(start,end-1)
        // 4. chuoi.length(): do dai cua chuoi ca space
// 5. indexOf tra ve vi tri xuat hien dau tien cua chuoi, ko thay thi tra ve -1
// 6. lastIndexOf tra ve vi tri cuoi cung 
// 7. contains: Kiem tra chuoi con
String s1 = ".mp3";
String s2 = "khang.mp3";
boolean check = s2.contains(s1);
if(check)
            System.out.println("Co mp3 trong chuoi");
else
            System.out.println("Khong co mp3");
// 8. substring(begin,end): lay chuoi con
String s3 = "duykhang@gmail.com";
String s4 = s3.substring(8);
        System.out.println(s4);
        // 9.replace && replaceFirst(strOld,strNew)
        String s5 = "Khang chinh la Khang";
        String s6 = s5.replace("Khang","thao");
        System.out.println(s6);
        String s7 = s5.replaceFirst("Khang", "Thao");
        System.out.println(s7);
        // 9. Xoa toan bo khoang trang dau va cuoi
      String s8 = "    Khang cute   ";
      String s9 = s8.trim();
        System.out.println(s9);
// 9.1 Xoa khoang trang cuoi chuoi
String s10 = s8.replaceAll("\\s+$","");
        System.out.println(s10);
        // 9.2 Xoa khoang trang o dau chuoi
        String s11 = s8.replaceFirst("^\\s+","");
        System.out.println(s11);
        
}
}
