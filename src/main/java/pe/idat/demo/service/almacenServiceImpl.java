/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.idat.demo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.demo.entity.almacen;
import pe.idat.demo.repository.almacenRepository;

/**
 *
 * @author Harold Mallma
 */
@Service
public class almacenServiceImpl implements almacenService {
    
    @Autowired
    private almacenRepository repositorio;
     
    @Override
    public List<almacen> findAll() {
        return repositorio.findAll();
        
    }

    @Override
    public List<almacen> findAllCustom() {
        return repositorio.findAllCustom();
    }
    
    @Override
    public Optional<almacen> findById(Long id) {
        return repositorio.findById(id);
    }
    
    

    @Override
    public almacen add(almacen a) {
         return repositorio.save(a);
    }

    @Override
    public almacen update(almacen a) {
        almacen objcalmacen=repositorio.getById(a.getCodigo());
        BeanUtils.copyProperties(a, objcalmacen);
        return repositorio.save(objcalmacen);
    }

    @Override
    public almacen delete(almacen a) {
        almacen objcalmacen=repositorio.getById(a.getCodigo());
        objcalmacen.setEstado(false);
        return repositorio.save(objcalmacen);
    }

   
    
    
}
