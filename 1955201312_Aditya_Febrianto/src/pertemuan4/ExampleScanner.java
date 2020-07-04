/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author aditbba
 */
public class ExampleScanner {
    public static void main(String[] args) {
        String nama, alamat, kuliah;
        int umur, semester;
        double ipk;
        // object scanner
        Scanner inputData = new Scanner(System.in);
        
        // pertanyaan
        System.out.println("Siapa nama Anda?");
        nama = inputData.nextLine();
        
        System.out.println("Berapa Umur Anda?");
        umur = Integer.parseInt(inputData.nextLine());
        
        System.out.println("Anda tinggal diamana?");
        alamat = inputData.nextLine();
        
        System.out.println("Anda sedang kuliah dimana?");
        kuliah = inputData.nextLine();
        
        System.out.println("Semester berapa sekarang?");
        semester = Integer.parseInt(inputData.nextLine());
        
        System.out.println("Semester ini berapa IPK anda?");
        ipk = inputData.nextDouble();
        
        // aoutput
        System.out.println("Data Anda sebagai berikut:");
        System.out.println("Nama " + nama);
        System.out.println("Umur " + umur);
        System.out.println("Tinggal di " + alamat);
        System.out.println("Kuliah di " + kuliah);
        System.out.println("Sudah semester " + semester);
        System.out.println("IPK anda " + ipk);
    }
}
