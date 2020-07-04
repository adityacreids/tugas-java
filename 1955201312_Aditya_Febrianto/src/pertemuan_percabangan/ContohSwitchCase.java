/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_percabangan;

import javax.swing.JOptionPane;

/**
 *
 * @author aditbba
 */
public class ContohSwitchCase {
    public static void main(String[] args) {
        String noBulan = JOptionPane.showInputDialog("Masukkan no bulan (integer)","");
        int nilai = Integer.parseInt(noBulan);
        
        String namaBulan;
        switch (noBulan) {
            case "1":
                namaBulan = "Januari";
                break;
            case "2":
                namaBulan = "Februari";
                break;
            case "3":
                namaBulan = "Maret";
                break;
            case "4":
                namaBulan = "April";
                break;
            case "5":
                namaBulan = "Mei";
                break;
            case "6":
                namaBulan = "Juni";
                break;
            case "7":
                namaBulan = "Juli";
                break;
            case "8":
                namaBulan = "Agustus";
                break;
            case "9":
                namaBulan = "September";
                break;
            case "10":
                namaBulan = "Oktober";
                break;
            case "11":
                namaBulan = "November";
                break;
            case "12":
                namaBulan = "Desember";
                break;
            default: 
                namaBulan = "belum di buat";
                break;
        }
        
        JOptionPane.showMessageDialog(null,"Bulan " + namaBulan );
    }
}
