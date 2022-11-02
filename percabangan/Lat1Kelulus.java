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
public class Lat1Kelulus {
    public static void main(String[] args) {
// Buat Scanner
    Scanner inp = new Scanner(System.in);
// Ambil Nama 
    System.out.print("Masukkan Nama : "); 
    String Nama = inp.nextLine();
// Ambil NIM 
    System.out.print("Masukkan NIM : ");
    String nim = inp.next();
// Ambil Nilai 
    System.out.print("Masukkan Nilai Anda : ");
int nilai = inp.nextInt();
// Print
    if (nilai >= 80){
    System.out.println("Selamat anda lulus"); 
}
    else { 
    System.out.println("Anda tidak lulus");
}
}
}
