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
        int num1 , num2, sum;
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
    
        int checkNumber;
        
        System.out.print("Enter number: ");
        
        checkNumber = sc.nextInt();
        
        if (checkNumber % 2 == 0){
            System.out.printf("Number %d is even", checkNumber);
        }
        else{
            System.out.printf("Number %d is odd", checkNumber);
        }

        
    }
    
}
