package com.dicoding.javafundamental.exception;

import java.io.File;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        try {
        // Mencoba membaca berkas latihan.txt
//        String location = "D://uji-coba-java-dicoding/coba.txt";
//        File file = new File(location);
        File file = new File("D://uji-coba-java-dicoding/coba.txt");
        FileReader fr = new FileReader(file);
            // Jika berhasil maka tampilkan pesan
            System.out.println("Read file berhasil");
        } catch (Exception e) {
            // Jika terjadi kesalahan maka tampilkan pesan
            System.out.println(e.getMessage());
        }
    }
}
