/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_java;

import java.util.Scanner;

/**
 *
 * @author aditbba
 */
public class Tugas_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama, alamat, kuliah;
        int umur, semester;
        double setngahUmur;
        // object scanner
        Scanner inputData = new Scanner(System.in);
        
        // pertanyaan
        System.out.println("Siapa nama Anda?");
        nama = inputData.nextLine();
        
        System.out.println("Berapa Umur Anda?");
        umur = Integer.parseInt(inputData.nextLine());
        setngahUmur = (umur / 2);
        
        System.out.println("Anda tinggal diamana?");
        alamat = inputData.nextLine();
        
        System.out.println("Anda sedang kuliah dimana?");
        kuliah = inputData.nextLine();
        
        System.out.println("Semester berapa sekarang?");
        semester = Integer.parseInt(inputData.nextLine());
        
        // aoutput
        System.out.println("Data Anda sebagai berikut:");
        System.out.println("Nama " + nama);
        System.out.println("Umur " + umur + " dan setengah umurnya adalah " + setngahUmur);
        System.out.println("Tinggal di " + alamat);
        System.out.println("Kuliah di " + kuliah);
        System.out.println("Sudah semester " + semester);
    }
    
}
