package pe.idat.demo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.demo.entity.ventas;
import pe.idat.demo.repository.VentasRepository;

@Service
public class ventasServicelmpl implements ventasService {

    
    @Autowired
        private VentasRepository repositorio;
    
    @Override
    public List<ventas> findAll() {
        return repositorio.findAll();
        
    }

    @Override
    public List<ventas> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public Optional<ventas> findById(long id_ventas) {
        return repositorio.findById(id_ventas);
    }

    @Override
    public ventas add(ventas v) {
         return repositorio.save(v);
    }

   @Override
    public ventas update(ventas v) {
        ventas objventas=repositorio.getById(v.getId_ventas());
        BeanUtils.copyProperties(v, objventas);
        return repositorio.save(objventas);
    }

    @Override
    public ventas delete(ventas v) {
        ventas objventas=repositorio.getById(v.getId_ventas());
        objventas.setEstado(false);
        return repositorio.save(objventas);
    }
    
}
