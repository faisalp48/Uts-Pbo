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
public class Lat3Kelulusan {
    public static void main(String[] args) {
        String jeniskelamin;
        int Tinggi;
        System.out.print("Kelamin(Laki-Laki/Perempuan):");
        Scanner kel = new Scanner(System.in);
        jeniskelamin = kel.nextLine();
        System.out.print("Tinggi Badan:");
        Tinggi = kel.nextInt();
        if("Laki-Laki".equals(jeniskelamin)){
            if(Tinggi<=170){
        System.out.println("Anda Gagal"); }
             else if((Tinggi>=170) && (Tinggi<=230))
                System.out.println("Anda Lulus");}    
        if("Perempuan".equals(jeniskelamin)){
            if(Tinggi<=160){
        System.out.println("Anda Gagal");}
            else if((Tinggi>=160) && (Tinggi<=210))
                System.out.println("Anda Lulus");}
        }
    }
