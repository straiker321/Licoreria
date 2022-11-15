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
import pe.idat.demo.entity.categoriaa;
import pe.idat.demo.repository.categoriaaRepository;

/**
 *
 * @author Harold Mallma
 */

@Service
public class categoriaaServiceImpl implements categoriaaService{
    
    @Autowired
        private categoriaaRepository repositorio;
    
    @Override
    public List<categoriaa> findAll() {
        return repositorio.findAll();
    }
    
     @Override
    public List<categoriaa> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public Optional<categoriaa> findById(long id) {
        return repositorio.findById(id);
    }

    @Override
    public categoriaa add(categoriaa c) {
         return repositorio.save(c);
    }

    @Override
    public categoriaa update(categoriaa c) {
        categoriaa objcategoriaa=repositorio.getById(c.getCodigo());
        BeanUtils.copyProperties(c, objcategoriaa);
        return repositorio.save(objcategoriaa);
    }

    @Override
    public categoriaa delete(categoriaa c) {
        categoriaa objcategoriaa=repositorio.getById(c.getCodigo());
        return repositorio.save(objcategoriaa);
    }
}
