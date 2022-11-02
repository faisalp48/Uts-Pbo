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
public class Latihan4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Apakah anda mahasiswa ITS mandiri isall?(iya jika setuju)");
        String jawaban = scan.next();
        if ("iya".equals(jawaban)) {
        System.out.print("Selamat berjuang di ITS Mandiri isall"); }
        else {
        System.out.println("Selamat datang di ITS Mandiri isall");
        }
    } 
  }
