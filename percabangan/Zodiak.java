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
public class Zodiak {
    public static void main(String[] args) {
        int Zodiak ;
        Scanner ras = new Scanner(System.in);
        System.out.print("Masukan bulan lahir = ");
        Zodiak = ras.nextInt();
        
        switch(Zodiak){
            case 1:
            System.out.println("Bulan ke- " + Zodiak + " adalah Aquarius");
            break;
            case 2:
            System.out.println("Bulan ke- " + Zodiak + " adalah Pisces");
            break;
            case 3:
            System.out.println("Bulan ke- " + Zodiak + " adalah Aries");
            break;
            case 4:
            System.out.println("Bulan ke- " + Zodiak + " adalah Taurus");
            break;
            case 5:
            System.out.println("Bulan ke- " + Zodiak + " adalah Gemini");
            break;
            case 6:
            System.out.println("Bulan ke- " + Zodiak + " adalah Cancer");
            break;
            case 7:
            System.out.println("Bulan ke- " + Zodiak + " adalah Leo");
            break;
            case 8:
            System.out.println("Bulan ke- " + Zodiak + " adalah Virgo");
            break;
            case 9:
            System.out.println("Bulan ke- " + Zodiak + " adalah Libra");
            break;
            case 10:
            System.out.println("Bulan ke- " + Zodiak + " adalah Scorpio");
            break;
            case 11:
            System.out.println("Bulan ke- " + Zodiak + " adalah Sagitarius");
            break;
            case 12:
            System.out.println("Bulan ke- " + Zodiak + " adalah Capricorn");
            break;
            default:
            System.out.println("Tidak ada Bulan");
            break;
       }
    }
}
