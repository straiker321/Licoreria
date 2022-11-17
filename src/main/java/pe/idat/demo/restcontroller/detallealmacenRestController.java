/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
import pe.idat.demo.entity.detallealmacen;
import pe.idat.demo.service.detallealmacenService;

/**
 *
 * @author Harold Mallma
 */
@RestController
@RequestMapping("/detallealmacen")
public class detallealmacenRestController {
    @Autowired
    private detallealmacenService servicio;
    
    
     @GetMapping
    public List<detallealmacen> findAll() {
        return servicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<detallealmacen> findAllCustom() {
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<detallealmacen> findById(@PathVariable Long iddetallealmacen) {
        return servicio.findById(iddetallealmacen);
    }
    
    @PostMapping
    public detallealmacen add (@RequestBody detallealmacen da) {
        return servicio.add(da);
    }
    
    @PutMapping("/{id}")
    public detallealmacen update (@PathVariable long id, @RequestBody detallealmacen da) {
        da.setCodigo(id);
        return servicio.update(da);
    }
    
    @DeleteMapping("/{id}")
    public detallealmacen delete (@PathVariable long id) {
        detallealmacen objdetallealmacen = new detallealmacen();
        objdetallealmacen.setEstado(false);
        return servicio.delete(detallealmacen.builder().codigo(id).build());
    }
}
