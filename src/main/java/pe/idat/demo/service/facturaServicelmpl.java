
package pe.idat.demo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.demo.entity.factura;
import pe.idat.demo.repository.FacturaRepository;

@Service
public class facturaServicelmpl implements facturaService {
    
     @Autowired
        private FacturaRepository repositorio;
    
    @Override
    public List<factura> findAll() {
        return repositorio.findAll();
        
    }

    @Override
    public List<factura> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public Optional<factura> findById(long id_factura) {
        return repositorio.findById(id_factura);
    }

    @Override
    public factura add(factura f) {
         return repositorio.save(f);
    }

   @Override
    public factura update(factura f) {
        factura objfactura=repositorio.getById(f.getId_factura());
        BeanUtils.copyProperties(f, objfactura);
        return repositorio.save(objfactura);
    }

    @Override
    public factura delete(factura f) {
        factura objfactura=repositorio.getById(f.getId_factura());
        objfactura.setEstado(false);
        return repositorio.save(objfactura);
    }
    
}
