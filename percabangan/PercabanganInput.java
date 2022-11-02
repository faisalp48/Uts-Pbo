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
public class PercabanganInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nilai1, nilai2, nilai3;
        
        System.out.print("nilai1 = ");
        nilai1=scan.nextInt();
        
        System.out.print("nilai2 = ");
        nilai2=scan.nextInt();
        
        System.out.print("nilai3 = ");
        nilai3=scan.nextInt();
        
        System.out.print("kesimpulan : ");
        
        if ((nilai1 > nilai2) && (nilai1 > nilai3)) {
            System.out.println("Nilai 1 terbesar");}
        if ((nilai2 > nilai1) && (nilai2 > nilai3)) {
            System.out.println("Nilai 2 terbesar");}
        if ((nilai3 > nilai1) && (nilai3 > nilai2)) {
            System.out.println("Nilai 3 terbesar");}
        else{
            System.out.println("Nilai sama");}
        }
    }
    
