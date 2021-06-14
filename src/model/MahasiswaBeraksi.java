package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) {

        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNpm("19630571");
        mahasiswa.setNama("Muhammad Zidan Ramadhani");
        try {
            mahasiswa.setTanggalLahir(simpleDateFormat.parse("01-12-2001"));
            mahasiswa.tampilkanAtribut();
            mahasiswa.menyapa();
            System.out.println("Usiaku : " + mahasiswa.hitungUsia() + " tahun");
        } catch (ParseException e) {
            System.err.println("Format Tanggal Tidak Sesuai");
        }

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.setNpm("19630500");
        mahasiswa2.setNama("Daffa");
        try {
            mahasiswa.setTanggalLahir(simpleDateFormat.parse("01-01-2000"));
            mahasiswa2.tampilkanAtribut();
            mahasiswa2.menyapa();
            System.out.println("Usiaku : " + mahasiswa2.hitungUsia() + " tahun");
        } catch (ParseException e) {
            System.err.println("Format Tanggal Tidak Sesuai");
        }

    }
}
