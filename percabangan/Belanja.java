/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percabangan;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Belanja {
    public static void main(String[] args) {
     int belanja ;
     double hasil_akhir;
     Scanner bel = new Scanner(System.in);
     System.out.print("Masukan Jumlah = ");
     belanja = bel.nextInt();
     
     if (belanja < 100000) {
      System.out.println("Tidak Mendapatkan Diskon"); }
     if ((belanja >= 100000) && (belanja <= 500000)) {
      hasil_akhir = belanja - (0.1*belanja);
      System.out.println("Selamat, anda mendapatkan diskon 10% menjadi "+ hasil_akhir + " Rupiah"); }
     if ((belanja > 500000) && (belanja <= 1000000)) {
      hasil_akhir = belanja - (0.2*belanja);
      System.out.println("Selamat, anda mendapatkan diskon 20% menjadi "+ hasil_akhir + " Rupiah"); }
     if (belanja > 1000000) {
      hasil_akhir = belanja - (0.3*belanja);
      System.out.println("Selamat, anda mendapatkan diskon 30% menjadi "+ hasil_akhir + " Rupiah"); }
    }     
    }
    

