package model;

import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19630571";
        mahasiswa.nama = "Muhammad Zidan Ramadhani";
        mahasiswa.tanggalLahir = new Date();

        System.out.println("Nama \t\t\t : " + mahasiswa.nama);
        System.out.println("NPM \t\t\t : " + mahasiswa.npm);
        System.out.println("Tanggal Lahir \t : " + mahasiswa.tanggalLahir);

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.npm = "19630500";
        mahasiswa2.nama = "Daffa";
        mahasiswa2.tanggalLahir = new Date();

        System.out.println("Nama \t\t\t : " + mahasiswa2.nama);
        System.out.println("NPM \t\t\t : " + mahasiswa2.npm);
        System.out.println("Tanggal Lahir \t : " + mahasiswa2.tanggalLahir);
    }
}
