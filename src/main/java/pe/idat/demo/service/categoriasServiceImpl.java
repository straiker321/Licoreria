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
import pe.idat.demo.entity.categorias;
import pe.idat.demo.repository.categoriasRepository;

/**
 *
 * @author Harold Mallma
 */

@Service
public class categoriasServiceImpl implements categoriasService{
    
    @Autowired

    private categoriasRepository repositorio;

   @Override
    public List<categorias> findAll() {
        return repositorio.findAll();
    }
    
    @Override
    public List<categorias> findAllCustom() {
        return repositorio.findAllCustom();
    }

    
    @Override
    public Optional<categorias> findById(long id_categorias) {
        return repositorio.findById(id_categorias);

    }

    @Override
    public categorias add(categorias c) {
         return repositorio.save(c);
    }

    @Override
    public categorias update(categorias c) {
        categorias objcategorias=repositorio.getById(c.getCodigo());
        BeanUtils.copyProperties(c, objcategorias);
        return repositorio.save(objcategorias);
    }

    @Override
    public categorias delete(categorias c) {
        categorias objcategorias=repositorio.getById(c.getCodigo());
        return repositorio.save(objcategorias);
    }
}
