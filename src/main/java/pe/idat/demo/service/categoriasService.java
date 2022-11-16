/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.idat.demo.service;

import java.util.List;
import java.util.Optional;
import pe.idat.demo.entity.categorias;

/**
 *
 * @author Harold Mallma
 */
public interface categoriasService {
     public List<categorias> findAll();
    
    public List<categorias> findAllCustom();
    
    public Optional<categorias> findById(long id);
    
    public categorias add(categorias c);
    
    public categorias update(categorias c);
    
    public categorias delete(categorias c);
    
}
