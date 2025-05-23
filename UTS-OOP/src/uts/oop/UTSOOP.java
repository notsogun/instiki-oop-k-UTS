/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts.oop;

import java.util.Scanner;

/**
 *
 * @author Gunawiartha
 * TGL 10 Mei 2025
 */
public class UTSOOP {

    static Peminjaman[] daftarPinjam = new Peminjaman[100];
    static int jumlahData = 0;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== APLIKASI PEMINJAMAN BUKU PERPUSTAKAAN ===");
            System.out.println("1. Tambah Data Peminjaman");
            System.out.println("2. Lihat Semua Peminjaman");
            System.out.println("3. Ubah Data Peminjaman");
            System.out.println("4. Hapus Data Peminjaman");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt(); input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Mahasiswa: ");
                    String nama = input.nextLine();
                    System.out.print("Judul Buku: ");
                    String buku = input.nextLine();
                    System.out.print("Tanggal Pinjam (dd/mm/yyyy): ");
                    String tgl = input.nextLine();
                    daftarPinjam[jumlahData++] = new Peminjaman(nama, buku, tgl);
                    break;
                case 2:
                    tampilkanSemua();
                    break;
                case 3:
                    tampilkanSemua();
                    System.out.print("Pilih nomor data yang akan diubah: ");
                    int ubah = input.nextInt(); input.nextLine();
                    if (ubah > 0 && ubah <= jumlahData) {
                        System.out.print("Judul Buku baru: ");
                        String newBuku = input.nextLine();
                        System.out.print("Tanggal Pinjam baru: ");
                        String newTgl = input.nextLine();
                        daftarPinjam[ubah - 1].setJudulBuku(newBuku);
                        daftarPinjam[ubah - 1].setTanggalPinjam(newTgl);
                    } else {
                        System.out.println("Nomor tidak valid!");
                    }
                    break;
                case 4:
                    tampilkanSemua();
                    System.out.print("Pilih nomor data yang akan dihapus: ");
                    int hapus = input.nextInt(); input.nextLine();
                    if (hapus > 0 && hapus <= jumlahData) {
                        for (int i = hapus - 1; i < jumlahData - 1; i++) {
                            daftarPinjam[i] = daftarPinjam[i + 1];
                        }
                        daftarPinjam[--jumlahData] = null;
                        System.out.println("Data berhasil dihapus.");
                    } else {
                        System.out.println("Nomor tidak valid!");
                    }
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan aplikasi.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }

    public static void tampilkanSemua() {
        if (jumlahData == 0) {
            System.out.println("Belum ada data peminjaman.");
        } else {
            for (int i = 0; i < jumlahData; i++) {
                System.out.println((i + 1) + ". " + daftarPinjam[i]);
            }
        }
    }
}
