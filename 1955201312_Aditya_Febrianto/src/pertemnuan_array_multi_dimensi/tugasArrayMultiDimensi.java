/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemnuan_array_multi_dimensi;

/**
 *
 * @author aditbba
 */
public class tugasArrayMultiDimensi {
    public static void main(String[] args) {
        int matrikA[][] = {{7,9,5},{1,5,0},{4,1,2}};
        int matrikB[][] = {{5,7,3},{0,4,6},{3,4,5}};
        
        System.out.println("Matrik A");
        formatMatrik(matrikA);
        
        System.out.println("");
        
        System.out.println("Matrik B");
        formatMatrik(matrikB);
        
        System.out.println("");
        
        System.out.println("Hasil pengurangan matrik A dan B");
        perhitunganMatrik(matrikA, matrikB, "Pengurangan");
        
        
        System.out.println("");
        
        System.out.println("Hasil penjumlahan matrik A dan B");
        perhitunganMatrik(matrikA, matrikB, "Penjumlahan");
        
    }
    
    static void formatMatrik(int[][] matrik) {
        for(int i=0; i < matrik.length; i++) {
            for(int j=0; j < matrik[i].length; j++) {
                System.out.print(matrik[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    static void perhitunganMatrik(int[][] matrikA, int[][] matrikB, String type) {
        int matrikC[][] = new int [matrikA.length][matrikB.length];
        for(int i=0; i < matrikC.length; i++) {
            for(int j=0; j < matrikC[i].length; j++) {
                if("Penjumlahan".equals(type)){
                    matrikC[i][j] = matrikA[i][j] + matrikB[i][j];
                } else {
                    matrikC[i][j] = matrikA[i][j] - matrikB[i][j];
                }
                System.out.print(matrikC[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
}


