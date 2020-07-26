/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_array;

import javax.swing.JOptionPane;

/**
 *
 * @author aditbba
 */
public class tugasArray {
    public static void main(String[] args) {
        int nilai[] = new int[3];
        int totalNilai = 0;
        int no, nilaiRataRata;
        for(int x=0; x<nilai.length; x++ ) {
            no = x+1;
            nilai[x] = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan nilai ke-" + no));
            totalNilai = totalNilai + nilai[x];
            System.out.println("Nilai ke-" + no + " Adalah: " + nilai[x]);
        }
        nilaiRataRata = totalNilai / nilai.length;
        System.out.println("------------------------------------------");
        System.out.println("Total keselurahan nilai adalah: " + totalNilai);
        System.out.println("Nilai Rata-rata adalah: " + nilaiRataRata);
    }
}
