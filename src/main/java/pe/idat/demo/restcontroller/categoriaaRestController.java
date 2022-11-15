/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.idat.demo.restcontroller;

/**
 *
 * @author Harold Mallma
 */
@RestController
@RequestMapping("/categoriaa")
public class categoriaaRestController {
    
    @Autowired
    private CategoriaService servicio;
    
    @GetMapping
    public List<categoriaa> findAll() {
        return servicio.findAll();
    }
    
}
