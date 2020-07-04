/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import javax.swing.JOptionPane;

/**
 *
 * @author aditbba
 */
public class ExampleJOptionPane {
    public static void main(String[] args) {
        String question1 = "Siapa nama Anda?";
        String nama = JOptionPane.showInputDialog(question1);
        
        
        String question2 = "Berapa Umur Anda?";
        String umur = JOptionPane.showInputDialog(question2);
        
        String question3 = "Anda tinggal diamana?";
        String alamat = JOptionPane.showInputDialog(question3);
        
        String question4 = "Anda sedang kuliah dimana??";
        String kuliah = JOptionPane.showInputDialog(question4);
        
        
        String question5 = "Semester berapa sekarang?";
        String semester = JOptionPane.showInputDialog(question5);
        
        // aoutput
        System.out.println("Data Anda sebagai berikut:");
        System.out.println("Nama " + nama);
        System.out.println("Umur " + umur);
        System.out.println("Tinggal di " + alamat);
        System.out.println("Kuliah di " + kuliah);
        System.out.println("Sudah semester " + semester);
    }
}
