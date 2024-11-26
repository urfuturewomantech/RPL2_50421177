/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.annisa;

import me.anisa.controller.MahasiswaController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pertemuan5_51421449 implements CommandLineRunner {

    @Autowired
    private MahasiswaController mhsController;

    public static void main(String[] args) {
        // Menjalankan aplikasi Spring Boot
        SpringApplication.run(Pertemuan5_51421449.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Memanggil metode tampilkanMenu() dari MahasiswaController
        mhsController.tampilkanMenu();
    }
}
