/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

import java.util.Scanner;

/**
 *
 * @author aditbba
 */
public class tugasUTS {
    public static void main(String[] args) {
        // sistem penggajian
        // terdiri dari 3 inputan, yaiutu total masuk kerja, total sakit, dan total cuti
        // jika masuk gaji seharinya 100.000 kalo sakit gaji nya 70.000, sedangkan cuti hanya dapat 30.000
        // total input minimal 28, maksimal 31
        
        // variabel type integer untuk total semua
        int totalSemuaGaji = 0;
        int totalBulan = 2;
        for(int bulan = 1; bulan <= totalBulan; bulan++) {
            
            int totalMasuk, totalSakit, totalCuti, totalKerja, gajiMasuk, gajiSakit, gajiCuti, totalGaji;

            // konstata gaji
            gajiMasuk   = 100000;
            gajiSakit   = 70000;
            gajiCuti    = 30000;

            // input
            Scanner s = new Scanner(System.in);
            
            System.out.println("Masukkan gaji bulan ke -" + bulan);

            System.out.printf("Masukkan total masuk kerja: ");
            totalMasuk  = s.nextInt();
            System.out.printf("Masukkan total sakit: ");
            totalSakit  = s.nextInt();
            System.out.printf("Masukkan total cuti: ");
            totalCuti   = s.nextInt();

            // hitung total keselurahan
            totalKerja = totalMasuk + totalSakit + totalCuti;

            // pengecekan apakah total kerja minimal 28 atau lebih dari 31
            if(totalKerja < 28) {
                System.out.println("Maaf total kerja kurang dari 28 hari");
            } else if(totalKerja > 31) {
                System.out.println("Maaf total kerja melebihi dari 31 hari");
            } else {
                // perhitungan total masuk dan gaji
                totalGaji = (totalMasuk * gajiMasuk) + (totalCuti * gajiCuti) + (totalSakit * gajiSakit);
                totalSemuaGaji = totalSemuaGaji + totalGaji;
                System.out.println("Gaji yang Anda dapatkan di bulan-" + bulan  + " selama " + totalKerja + " hari adalah:");
                System.out.println("Rp.  " + totalGaji);
            }
            System.out.println("");
            System.out.println("--------------------------------------");
        }
        
        System.out.println("Total gaji selama " + totalBulan + " bulan adalah " + totalSemuaGaji);
    }
}
