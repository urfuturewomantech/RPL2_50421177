/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.anisa.controller;

import me.anisa.model.ModelMahasiswa;
import me.anisa.repository.MahasiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Scanner;

@Controller
public class MahasiswaController {

    @Autowired
    private MahasiswaRepository mahasiswaRepository;

    public void tampilkanMenu() {
        Scanner scanner = new Scanner(System.in);
        int opsi;

        do {
            System.out.println("\nMenu: ");
            System.out.println("1. Tampilkan semua mahasiswa");
            System.out.println("2. Tambah mahasiswa baru");
            System.out.println("3. Cek koneksi database");
            System.out.println("4. Keluar");
            System.out.print("Pilih Opsi: ");
            opsi = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (opsi) {
                case 1:
                    tampilkanSemuaMahasiswa();
                    break;
                case 2:
                    tambahMahasiswa(scanner);
                    break;
                case 3:
                    cekKoneksi();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Opsi tidak valid, coba lagi.");
                    break;
            }
        } while (opsi != 4);
    }

    private void tampilkanSemuaMahasiswa() {
        List<ModelMahasiswa> mahasiswaList = mahasiswaRepository.findAll();
        if (mahasiswaList.isEmpty()) {
            System.out.println("Tidak ada mahasiswa yang terdaftar.");
        } else {
            mahaasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa));
                System.out.println(mahasiswa);
            }
        }
    }

    public void tambahMahasiswa(Scanner scanner) {
        System.out.println("Masukkan npm: ");
        String npm = scanner.nextLine();
        System.out.println("Masukkan Nama: ");
        String nama = scanner.nextLine();
        int semester = scanner.nextInt();
        System.out.println("Masukkan ipk: ");
        float ipk = scanner.nextFloat();


        ModelMahasiswa mahasiswa = new ModelMahasiswa(0, npm, nama, semester, ipk);
        mahasiswaRepository.save(mahasiswa);
        System.out.println("Mahasiswa berhasil ditambahkan!");
    }

    private void cekKoneksi() {
        try {
            // Cek koneksi ke database (contoh dengan mencoba query sederhana)
            mahasiswaRepository.findAll();
            System.out.println("Koneksi ke database berhasil");
        } catch (Exception e) {
            System.out.println("Gfagal terhubung ke database.");
        }
    }
}
