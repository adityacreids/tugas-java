/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author aditbba
 */
public class ExampleBufferedReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // variable name untuk di inputkan
        String nama, alamat, kuliah;
        int umur, semester;
        double ipk;
        
        // object inputStream
        InputStreamReader isr = new InputStreamReader(System.in);
        
        //object bufferedReader
        BufferedReader br = new BufferedReader(isr);
        
        // pertanyaan
        System.out.println("Siapa nama Anda?");
        nama = br.readLine();
        
        System.out.println("Berapa Umur Anda?");
        umur = Integer.parseInt(br.readLine());
        
        System.out.println("Anda tinggal diamana?");
        alamat = br.readLine();
        
        System.out.println("Anda sedang kuliah dimana?");
        kuliah = br.readLine();
        
        System.out.println("Semester berapa sekarang?");
        semester = Integer.parseInt(br.readLine());
        
        System.out.println("Berapa IPK Anda? ");
        ipk = Double.parseDouble(br.readLine());
        
        // aoutput
        System.out.println("Data Anda sebagai berikut:");
        System.out.println("Nama " + nama);
        System.out.println("Umur " + umur);
        System.out.println("Tinggal di " + alamat);
        System.out.println("Kuliah di " + kuliah);
        System.out.println("Sudah semester " + semester);
    }
    
}
