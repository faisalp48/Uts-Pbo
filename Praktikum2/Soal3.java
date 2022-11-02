/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Soal3 {
    public static void main(String[] args) {
        String nama,nim,semester,kelas;
        Scanner inputan = new Scanner(System.in);
        System.out.print("Inputan Nama        : ");
        nama = inputan.nextLine();
        System.out.print("Inputan Nim         : ");
        nim = inputan.nextLine();
        System.out.print("Inputan Semester    : ");
        semester = inputan.nextLine();
        System.out.print("Inputan Kelas       : ");
        kelas = inputan.nextLine();
        
        System.out.println("---Hasil---");
        System.out.println("Nama             : "+nama);
        System.out.println("Nim              : "+nim);
        System.out.println("Semester         : "+semester);
        System.out.println("Kelas            : "+kelas);
    }
    
}
