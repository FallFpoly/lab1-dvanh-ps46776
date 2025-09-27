/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

/**
 *
 * @author ICT
 */
import java.util.Scanner;
public class bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho va ten:");
        String Hoten = sc.nextLine();
        System.out.print("Diem trung binh:");
        double diem = sc.nextDouble();
        System.out.print(Hoten + " " + diem + " ");
    }
}
