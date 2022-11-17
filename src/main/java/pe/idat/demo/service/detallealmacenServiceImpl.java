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
import pe.idat.demo.entity.detallealmacen;
import pe.idat.demo.repository.detallealmacenRepository;

/**
 *
 * @author Harold Mallma
 */
@Service
public class detallealmacenServiceImpl  implements detallealmacenService{
    
    @Autowired
        private detallealmacenRepository repositorio;
    
    @Override
    public List<detallealmacen> findAll() {
          return repositorio.findAll();
    }

    @Override
    public List<detallealmacen> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public Optional<detallealmacen> findById(Long iddetallealmacen) {
         return repositorio.findById(iddetallealmacen);
    }

    @Override
    public detallealmacen add(detallealmacen da) {
        return repositorio.save(da);
    }

    @Override
    public detallealmacen update(detallealmacen da) {
        detallealmacen objdetallealmacen= repositorio.getById(da.getCodigo());
        BeanUtils.copyProperties(da, objdetallealmacen);
        return repositorio.save(objdetallealmacen);
    }

    @Override
    public detallealmacen delete(detallealmacen da) {
        detallealmacen objdetallealmacen= repositorio.getById(da.getCodigo());
        objdetallealmacen.setEstado(false);
        return repositorio.save(objdetallealmacen);
    }
    
}
