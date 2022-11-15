/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.idat.demo.service;

import java.util.List;
import java.util.Optional;
import pe.idat.demo.entity.categoriaa;

/**
 *
 * @author Harold Mallma
 */
public interface categoriaaService {
    
     public List<categoriaa> findAll();
    
    public List<categoriaa> findAllCustom();
    
    public Optional<categoriaa> findById(long id);
    
    public categoriaa add(categoriaa c);
    
    public categoriaa update(categoriaa c);
    
    public categoriaa delete(categoriaa c);
    
}
