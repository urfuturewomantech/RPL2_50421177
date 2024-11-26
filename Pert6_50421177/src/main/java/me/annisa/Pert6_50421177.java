/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.annisa;

import me.annissa.controller;
import me.annissa.service.MahasiswaService;
import me.annissa.view.MahasiswaView;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringApplication;
import org.sprintframework.beans.factory.annotation.Autowired;
import org.sprintframework.context.ApplicationContext;

/**
 *
 * @author ASUS
 */
@SpringBootApplication
public class Pert6_50421177 implements ApplicationRunner{
@Autowired
private MahasiswaService mahasiswaService;


    public static void main(String[] args) {
        System.setProperty("java.awt.headless", "false");
        
        ApplicationContext context = SpringApplication.run(Pert6_50421177, class, args);
        
        MahasiswaController controller = context.getBean(MahasiswaController.class);
         MahasiswaView mahasiswaView = new  MahasiswaView(controller);
         mahasiswaView.setVisible(true);
    }
    
    @Override
    public void run(ApplicationArguments args) throws Exception {
}
