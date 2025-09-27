/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

/**
 *
 * @author ICT
 */
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double canh, theTich;

        System.out.print("nhap canh khoi lap phuong: ");
        canh = sc.nextDouble();

        theTich = canh * canh * canh;
    
        System.out.println("the tich khoi lap phuong: " + theTich);
    }
}
