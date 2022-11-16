
package pe.idat.demo.service;

import java.util.List;
import java.util.Optional;

import pe.idat.demo.entity.categorias;


public interface categoriasService {

    public List<categorias> findAll();
    
    public List<categorias> findAllCustom();
    
    public Optional<categorias> findById(long id);
    
    public categorias add(categorias c);
    
    public categorias update(categorias c);
    
    public categorias delete(categorias c);
    
}
