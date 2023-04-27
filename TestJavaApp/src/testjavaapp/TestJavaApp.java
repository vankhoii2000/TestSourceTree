/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjavaapp;

import java.util.Scanner;

/**
 *
 * @author huynh
 */
public class TestJavaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter num 1: ");
//        num1 = sc.nextInt();
//        
//        System.out.print("Enter num 2: ");
//        num2 = sc.nextInt();
//        
//        sc.close();
//        
//        sum = num1 + num2;
//        
//        System.out.println("Sum num 1 & num 2 = " + sum);
//        int checkNumber;
//        
//        System.out.print("Enter number: ");
//        
//        checkNumber = sc.nextInt();
//        sc.close();
//
//        if (checkNumber % 2 == 0){
//            System.out.printf("Number %d is even", checkNumber);
//        }
//        else{
//            System.out.printf("Number %d is odd", checkNumber);
//        }
//        int year;
//        boolean isLeap = false;
//
//        System.out.print("Enter year: ");
//        year = sc.nextInt();
//
//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    isLeap = true;
//                } else {
//                    isLeap = false;
//                }
//            } else {
//                isLeap = true;
//            }
//        } else {
//            isLeap = false;
//        }
//
//        if (isLeap == true) {
//            System.out.printf("%d is Leap year", year);
//        } else {
//            System.out.printf("%d is not Leap year", year);
//        }
          boolean laNguyenam = false;
          
          System.out.print("Nhap ky tu kiem tra: ");
          
          char ch = sc.next().charAt(0);
          
          sc.close();
          
          switch(ch)
          {
              case 'a':
              case 'e':
              case 'i':
              case 'o': 
              case 'u':
              case 'A':
              case 'E':
              case 'I':
              case 'O':
              case 'U': laNguyenam = true;
          }
          
          if(laNguyenam == true){
              System.out.printf(" %c la nguyen am", ch);
              System.out.println("");
          }
          else{
              if ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
                  System.out.printf("%c la nguyen am", ch);
                  System.out.println("");
              }
              else{
                  System.out.printf("%c khong thuoc bang chu cai", ch);
                  System.out.println("");
              }
          }
          
        
        
    }

}
