/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

/**
 *
 * @author ICT
 */
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dai, rong, chuVi, dienTich, canhNho;

        System.out.print("Nhap chieu dai: ");
        dai = sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        rong = sc.nextDouble();

        chuVi = (dai + rong) * 2;
        dienTich = dai * rong;
        canhNho = Math.min(dai, rong);

        System.out.println("chu vi: " + chuVi);
        System.out.println("dien tich: " + dienTich);
        System.out.println("canh nho nhat: " + canhNho);
    }
}

