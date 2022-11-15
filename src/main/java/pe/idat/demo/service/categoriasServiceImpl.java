/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.idat.demo.service;

/**
 *
 * @author Harold Mallma
 */

@Service
public class categoriasServiceImpl {
    
    @Autowired
        private categoriaaRepository repositorio;
    
    @Override
    public List<Categoriaa> findAll() {
        return repositorio.findAll();
}
