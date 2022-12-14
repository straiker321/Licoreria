
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
import pe.idat.demo.entity.ventas;
import pe.idat.demo.service.ventasService;

@RestController
@RequestMapping("/ventas")
public class ventasRestController {
    
    @Autowired
    private ventasService servicio;
    
    @GetMapping
    public List<ventas> findAll() {
        return servicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<ventas> findAllCustom() {
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<ventas> findById(@PathVariable Long id) {
        return servicio.findById(id);
    }
    
    @PostMapping
    public ventas add (@RequestBody ventas v) {
        return servicio.add(v);
    }
    
    @PutMapping("/{id}")
    public ventas update (@PathVariable long id, @RequestBody ventas v) {
        v.setCodigo(id);
        return servicio.update(v);
    }
    
    @DeleteMapping("/{id}")
    public ventas delete (@PathVariable long id) {
        ventas objventas = new ventas();
        objventas.setEstado(false);
        return servicio.delete(ventas.builder().codigo(id).build());
    }
    
}
