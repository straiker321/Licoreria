/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.idat.demo.service;

import java.util.List;
import java.util.Optional;
import pe.idat.demo.entity.almacen;

/**
 *
 * @author Harold Mallma
 */
public interface almacenService {
    public List<almacen> findAll();
    
    public List<almacen> findAllCustom();
    
    public Optional<almacen> findById(long id_almacen);
    
    public almacen add(almacen a);
    
    public almacen update(almacen a);
    
    public almacen delete(almacen a);
    
}
