/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan21_ratarata;

import java.util.Scanner;

/**
 *
 * @author Geo Syah Alkautsar
 * NIM : 10117081
 * Kelas : OF2/PBO2
 * Deskripsi Program : Menampilkan hasil rata-rata nilai mahasiswa
 */
public class PBO2_10117081_Latihan21_RataRata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int jumlahMahasiswa;
        int i = 1;
        double rataNilai;
        double jumlahNilai = 0;
        double nilaiMahasiswa;
        
        Scanner nilai = new Scanner(System.in);
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        jumlahMahasiswa = (int) nilai.nextDouble();
        
        while (i <= jumlahMahasiswa) {
            System.out.print("Nilai Mahasiswa Ke-" + i + " : ");
            nilaiMahasiswa = nilai.nextDouble();
            jumlahNilai = jumlahNilai + nilaiMahasiswa;
            i++;
        }
        
        System.out.println("");
        
        //rata-rata
        rataNilai = jumlahNilai / jumlahMahasiswa;
        System.out.println("Maka Rata-rata Nilainya adalah " + rataNilai);
        
    }
    
}
