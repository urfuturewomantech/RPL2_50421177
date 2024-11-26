/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.annissa.controller;
import org.sprintframework.beans.factory.annotation.Autowired;
import org.sprintframework.web.bind.annotation.*;
import me.model.ModelMahasiswa;
import me.model.service.MahasiswaService;

import java.util.List;
import org.springframework.stereotype.Controller;

/**
 *
 * @author ASUS
 */
@Controller
public class MahasiswaController {
    @Autowired
    private MahasiswaService mahasiswaService;
    
    public String addMahasiswa(@RequestBody ModelMahasiswa mhs){
        mahasiswaService.addMhs(mhs);
        return "Mahasiswa added successfully";
    }
    
     public ModelMahasiswa getMahasiswa(@PathVariable int id){
         return mahasiswaService.getMhs(id);
         
     }
     
     public String updateMahasiswa(@RequestBody ModelMahasiswa mhs){
        mahasiswaService.updateMhs(mhs);
        return "Mahasiswa update successfully";
    }
     
     public String deleteMahasiswa(@PathVariable int id){
          mahasiswaService.deleteMhs(id);
        return "Mahasiswa delete successfully";
    }
     
     public List<ModelMahasiswa> getAllMahasiswa(){
        return mahasiswaService.getAllMahasiswa();
    }
}

