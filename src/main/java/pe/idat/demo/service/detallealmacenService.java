/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.idat.demo.service;

import java.util.List;
import java.util.Optional;
import pe.idat.demo.entity.detallealmacen;

/**
 *
 * @author erick
 */
public interface detallealmacenService {
    public List<detallealmacen> findAll();
    
    public List<detallealmacen> findAllCustom();
    
    public Optional<detallealmacen> findById(long id);
    
    public detallealmacen add(detallealmacen da);
    
    public detallealmacen update(detallealmacen da);
    
    public detallealmacen delete(detallealmacen da);
}
