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
import pe.idat.demo.entity.proveedores;
import pe.idat.demo.repository.proveedoresRepository;

@Service
public class proveedoresServiceImpl implements proveedoresService{
    
    @Autowired
    private proveedoresRepository repositorio;
    
    @Override
    public List<proveedores> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<proveedores> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public Optional<proveedores> findById(Long id) {
        return repositorio.findById(id);
    }

    @Override
    public proveedores add(proveedores p) {
         return repositorio.save(p);
    }

    @Override
    public proveedores update(proveedores p) {
        proveedores objprov= repositorio.getById(p.getId_proveedores());
        BeanUtils.copyProperties(p, objprov);
        return repositorio.save(objprov);
    }

    @Override
    public proveedores delete(proveedores p) {
        proveedores objprov= repositorio.getById(p.getId_proveedores());
        objprov.setEstado(false);
        return repositorio.save(objprov);
    }
    
}
