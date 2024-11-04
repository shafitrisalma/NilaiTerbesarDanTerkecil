/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_23176029latihan23nilaiterbesardanterkecil;

/**
 *
 * @author shafi
 * Nama  : Shafitri Salma Ramadanti
 * NIM   : 23176029
 * Kelas : PBO1
 * Prodi : Sistem Informasi
 * Deskripsi Program : Program ini berisi program untuk menampilkan nilai terbesar dan terkecil
 */

import java.util.Scanner;
public class SI_RegPagi_23176029Latihan23NilaiTerbesarDanTerkecil {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        
        // Meminta nama petugas
        System.out.print("Masukkan Nama Petugas: ");
        String petugas = input.nextLine();
        
        // Meminta jumlah mahasiswa
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        
        // Inisialisasi array untuk menyimpan nilai mahasiswa
        int[] nilaiMahasiswa = new int[jumlahMahasiswa];
        
        // Memasukkan setiap nilai mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + " = ");
            nilaiMahasiswa[i] = input.nextInt();
        }
        
        // Menampilkan semua nilai mahasiswa
        System.out.println("\n=====Hasil Nilai Mahasiswa=====");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Nilai Mahasiswa Ke-" + (i + 1) + " = " + nilaiMahasiswa[i]);
        }
        
        // Menentukan nilai terbesar dan terkecil
        int nilaiTerbesar = nilaiMahasiswa[0];
        int nilaiTerkecil = nilaiMahasiswa[0];
        
        for (int i = 1; i < jumlahMahasiswa; i++) {
            if (nilaiMahasiswa[i] > nilaiTerbesar) {
                nilaiTerbesar = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < nilaiTerkecil) {
                nilaiTerkecil = nilaiMahasiswa[i];
            }
        }
        
        // Menampilkan nilai terbesar dan terkecil
        System.out.println("\nNilai Terbesar adalah " + nilaiTerbesar);
        System.out.println("Nilai Terkecil adalah " + nilaiTerkecil);
        
        // Menampilkan nama petugas
        System.out.println("\nPetugas: " + petugas);
    }
}
