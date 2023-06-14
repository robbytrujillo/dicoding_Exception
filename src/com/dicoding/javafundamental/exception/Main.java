package com.dicoding.javafundamental.exception;

import java.io.File;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        // try {

            // Mencoba membaca berkas latihan.txt
//        String location = "D://uji-coba-java-dicoding/coba.txt";
//        File file = new File(location);


//        File file = new File("D://uji-coba-java-dicoding/coba.txt");
//        FileReader fr = new FileReader(file);
//            // Jika berhasil maka tampilkan pesan
//            System.out.println("Read file berhasil");
//        } catch (Exception e) {
//            // Jika terjadi kesalahan maka tampilkan pesan
//            System.out.println(e.getMessage());
//        }

            // Example Multiple catch
//        try {
//
//        } catch (ExceptionType name) {
//
//        } catch (ExceptionType name) {
//
//        }

            // Dan setelah Java 7 kita bisa menggunakan 1 baris kode untuk meng-handle multi catch. Seperti ini contohnya.
//        catch (IOException|SQLException ex) {
//            logger.log(ex);
//            throw ex;
//        }

            // Block finally

            int[] a = new int[5];
            try {
                System.out.println("Akses Elemen ke 5 : " + a[5]);
            }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception throm : " + e);
            } finally {
                a[4] = 10;
                System.out.println("Nilai elemen terakhir: " + a[4]);
            }
        }
}
