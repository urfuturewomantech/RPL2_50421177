/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.annissa.service;
import me.model.ModelMahasiswa;
import me.annissa.repository.MahasiswaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author ASUS
 */
@Service

public class MahasiswaService {
    @Autowired
    private MahasiswaRepository repository;
    
    public void addMhs(ModelMahasiswa mhs) {
        repository.save(mhs);
    }
    public void ModelMahasiswa getMhs(Int id){
        return repository.findById(id).orElse(null);
    }
    
    public void updateMhs(ModelMahasiswa mhs){
        repository.save(mhs);
    }
    public void deleteteMhs(int id){
        repository.deleteById(id);
    }
    public List<ModelMahasiswa> getAllMahasiswa(){
        return repository.findAll();
    }
}