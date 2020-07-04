/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_perulangan;

import javax.swing.JOptionPane;

/**
 *
 * @author aditbba
 */
public class ContohIfElse {
    public static void main(String[] args) {
        String inputNilai = JOptionPane.showInputDialog("Masukkan Nilai Anda","");
        int nilai = Integer.parseInt(inputNilai);
        
        String hasil;
        if(nilai >= 70) {
            hasil = "telah lulus";
        } else {
            hasil = "tidak Lulus! silahkan ulangi";
        }
        
        JOptionPane.showMessageDialog(null,"Nilai anda adalah " + nilai + " dan Anda " + hasil);
    }
}
