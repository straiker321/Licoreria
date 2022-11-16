
package pe.idat.demo.service;

import java.util.List;
import java.util.Optional;
import pe.idat.demo.entity.factura;


public interface facturaService {
    
    public List<factura> findAll();
        
    public List<factura> findAllCustom();
    
    public Optional<factura> findById(long id_factura);
    
    public factura add(factura f);
    
    public factura update(factura f);
    
    public factura delete(factura f);
    
    
}
