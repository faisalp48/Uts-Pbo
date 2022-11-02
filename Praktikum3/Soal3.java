/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Soal3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int panjang, lebar, keliling, luas;
        System.out.println("Masukkan metode ");
        System.out.println("1.Menghitung Luas Persegi");
        System.out.println("2.Menghitung Keliling Persegi");
        System.out.print("Pilihan = ");
        int pilihan = scan.nextInt();
        
        switch(pilihan){
            case 1:
            System.out.print("Masukkan panjang sisi persegi = ");
            panjang = scan.nextInt();
            luas = panjang * panjang;
            System.out.println("Luas persegi adalah "+ luas +" cm");
            break;
            case 2:
            System.out.print("Masukkan panjang sisi persegi = ");
            panjang = scan.nextInt();
            keliling = 2 * (panjang + panjang);
            System.out.println("keliling persegi adalah "+ keliling +" cm");
            break;
            default:
            System.out.println("Sistem error");
            break;
       }
}
}