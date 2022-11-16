/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.idat.demo.service;

import java.util.List;
import java.util.Optional;
import pe.idat.demo.entity.productos;

/**
 *
 * @author Harold Mallma
 */
public interface productosService {
    public List<productos> findAll();
    
    public List<productos> findAllCustom();
    
    public Optional<productos> findById(long id);
    
    public productos add(productos p);
    
    public productos update(productos p);
    
    public productos delete(productos p);
    
}
