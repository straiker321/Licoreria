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
import pe.idat.demo.entity.categoriaa;
import pe.idat.demo.service.categoriaaService;

/**
 *
 * @author Harold Mallma
 */
@RestController
@RequestMapping("/categoriaa")
public class categoriaaRestController {
    
    @Autowired
    private categoriaaService servicio;
    
    @GetMapping
    public List<categoriaa> findAll() {
        return servicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<categoriaa> findAllCustom() {
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<categoriaa> findById(@PathVariable Long id) {
        return servicio.findById(id);
    }
    
    @PostMapping
    public categoriaa add (@RequestBody categoriaa c) {
        return servicio.add(c);
    }
    
    @PutMapping("/{id}")
    public categoriaa update (@PathVariable long id, @RequestBody categoriaa c) {
        c.setCodigo(id);
        return servicio.update(c);
    }
    
    @DeleteMapping("/{id}")
    public categoriaa delete (@PathVariable long id) {
        categoriaa objcategoriaa = new categoriaa();
        return servicio.delete(categoriaa.builder().codigo(id).build());
    }
}

