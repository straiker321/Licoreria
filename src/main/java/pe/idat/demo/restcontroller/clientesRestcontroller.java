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
import pe.idat.demo.entity.clientes;
import pe.idat.demo.service.clientesService;

@RestController
@RequestMapping("/clientes")
public class clientesRestcontroller {
    @Autowired
    private clientesService service;
    
    @GetMapping
    public List<clientes> findAll(){
        return service.findAll();
    }
    
    @GetMapping("/{id}")
    public Optional<clientes> findById(@PathVariable Long id){
        return service.findById(id);
    }
    
    @GetMapping("/custom") 
    public List<clientes> findAllCustom(){
        return service.findAllCustom(); 
    } 
    
    @PostMapping
    public clientes add(@RequestBody clientes c){ 
    return service.add(c); 
    }
    
    @PutMapping("/{id}")
    public clientes update(@PathVariable long id, @RequestBody clientes c) {
    	c.setCodigo(id);
    	return service.update(c);
    }
    @DeleteMapping("/{id}")
    public clientes delete(@PathVariable long id) {
    	clientes objcli = new clientes();
    	objcli.setEstado(false);
        return service.delete(clientes.builder().codigo(id).build());
    	
    }
}
