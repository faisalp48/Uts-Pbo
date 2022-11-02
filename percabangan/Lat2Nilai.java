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
public class Lat2Nilai {
     public static void main(String[] args) {
     int nilai ;
     Scanner nil = new Scanner(System.in);
     System.out.print("Masukan Nilai = ");
     nilai = nil.nextInt();
     
     if (nilai <= 55) {
    System.out.println("E"); }
    
     else {
     if ((nilai >= 56) && (nilai <= 65)) {
    System.out.println("D"); }
     }
    
      if ((nilai >= 66) && (nilai <= 75)) {
    System.out.println("C"); }
    
      if ((nilai >= 76) && (nilai <= 85)) {
    System.out.println("B"); }
    
      if ((nilai >= 86) && (nilai <= 100)) {
    System.out.println("A"); }
      
      else if ((nilai > 100) || (nilai <= 0    )) {
    System.out.println("error"); }
     
     }
 }