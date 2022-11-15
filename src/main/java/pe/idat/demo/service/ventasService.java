package pe.idat.demo.service;

import java.util.List;
import java.util.Optional;
import pe.idat.demo.entity.ventas;


public interface ventasService {
    
    public List<ventas> findAll();
    
    public List<ventas> findAllCustom();
    
    public Optional<ventas> findById(long id);
    
    public ventas add(ventas v);
    
    public ventas update(ventas v);
    
    public ventas delete(ventas v);
    
}
