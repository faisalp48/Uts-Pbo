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
public class Lat4Bobot {
    public static void main(String[] args) {
        String huruf ;
        Scanner hur = new Scanner(System.in);
        System.out.print("Masukan Huruf = ");
        huruf = hur.nextLine();
        
        switch(huruf){
            case "A":
            System.out.println("Huruf " + huruf + " Menjadi 4");
            break;
            case "B":
            System.out.println("Huruf " + huruf + " Menjadi 3");
            break;
            case "C":
            System.out.println("Huruf " + huruf + " Menjadi 2");
            break;
            case "D":
            System.out.println("Huruf " + huruf + " Menjadi 1");
            break;
            case "E":
            System.out.println("Huruf " + huruf + " Menjadi 0");
            break;
            default:
            System.out.println("Huruf Tidak Tersedia ");
            break;
       }
    }
}