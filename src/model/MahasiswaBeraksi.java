package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) {

        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19630571";
        mahasiswa.nama = "Muhammad Zidan Ramadhani";
        try {
            mahasiswa.tanggalLahir = simpleDateFormat.parse("01-12-2001");
            mahasiswa.tampilkanAtribut();
            mahasiswa.menyapa();
            System.out.println("Usiaku : " + mahasiswa.hitungUsia() + " tahun");
        } catch (ParseException e) {
            System.err.println("Format Tanggal Tidak Sesuai");
        }

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.npm = "19630500";
        mahasiswa2.nama = "Daffa";
        try {
            mahasiswa2.tanggalLahir = simpleDateFormat.parse("01-01-2000");
            System.out.println("Nama \t\t\t : " + mahasiswa2.nama);
            System.out.println("NPM \t\t\t : " + mahasiswa2.npm);
            System.out.println("Tanggal Lahir \t : " + simpleDateFormat.format(mahasiswa2.tanggalLahir));

            mahasiswa2.menyapa();
            System.out.println("Usiaku : " + mahasiswa2.hitungUsia() + " tahun");
        } catch (ParseException e) {
            System.err.println("Format Tanggal Tidak Sesuai");
        }

    }
}
