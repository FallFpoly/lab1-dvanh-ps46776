/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

/**
 *
 * @author ICT
 */
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, delta, canDelta;

        System.out.print("nhap a: ");
        a = sc.nextDouble();
        System.out.print("nhap b: ");
        b = sc.nextDouble();
        System.out.print("nhap c: ");
        c = sc.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;      
        canDelta = Math.sqrt(delta);            

        System.out.println("delta = " + delta);
        System.out.println("can delta = " + canDelta);
    }
}
