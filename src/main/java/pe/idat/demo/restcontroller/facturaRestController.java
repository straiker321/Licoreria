
package pe.idat.demo.restcontroller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.idat.demo.entity.factura;
import pe.idat.demo.service.facturaService;

@RestController
@RequestMapping("/factura")
public class facturaRestController {
    
     @Autowired
    private facturaService servicio;
    
    @GetMapping
    public List<factura> findAll() {
        return servicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<factura> findAllCustom() {
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<factura> findById(@PathVariable Long id) {
        return servicio.findById(id);
    }
    
    @PostMapping
    public factura add (@RequestBody factura f) {
        return servicio.add(f);
    }
    
    @PutMapping("/{id}")
    public factura update (@PathVariable long id, @RequestBody factura f) {
        f.setId_factura(id);
        return servicio.update(f);
    }
    
    @DeleteMapping("/{id}")
    public factura delete (@PathVariable long id) {
        factura objfactura = new factura();
        return servicio.delete(factura.builder().id_factura(id).build());
    }
    
}
