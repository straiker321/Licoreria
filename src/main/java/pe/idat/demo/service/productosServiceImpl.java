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
import pe.idat.demo.entity.productos;
import pe.idat.demo.repository.productosRepository;

/**
 *
 * @author Harold Mallma
 */
@Service
public class productosServiceImpl implements productosService  {
    
    @Autowired
        private productosRepository repositorio;
     
    @Override
    public List<productos> findAll() {
        return repositorio.findAll();
        
    }

    @Override
    public List<productos> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public Optional<productos> findById(Long id) {
        return repositorio.findById(id);
    }

    @Override
    public productos add(productos p) {
         return repositorio.save(p);
    }

    @Override
    public productos update(productos p) {
        productos objproductos=repositorio.getById(p.getCodigo());
        BeanUtils.copyProperties(p, objproductos);
        return repositorio.save(objproductos);
    }

    @Override
    public productos delete(productos p) {
        productos objproductos=repositorio.getById(p.getCodigo());
        objproductos.setEstado(false);
        return repositorio.save(objproductos);
    }

    
    
}
