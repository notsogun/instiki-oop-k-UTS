/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.oop;

/**
 *
 * @author Gunawiartha
 * TGL 10 Mei 2025
 */
public class Peminjaman {
    private String namaMahasiswa;
    private String judulBuku;
    private String tanggalPinjam;

    public Peminjaman(String namaMahasiswa, String judulBuku, String tanggalPinjam) {
        this.namaMahasiswa = namaMahasiswa;
        this.judulBuku = judulBuku;
        this.tanggalPinjam = tanggalPinjam;
    }

    public String getNamaMahasiswa() {
        return namaMahasiswa;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(String tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    @Override
    public String toString() {
        return "Nama: " + namaMahasiswa + ", Buku: " + judulBuku + ", Tgl Pinjam: " + tanggalPinjam;
    }
}
