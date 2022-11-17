/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.idat.demo.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Harold Mallma
 */

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="detalle_almacen")
@Table(name="detalle_almacen")
public class detallealmacen implements Serializable{
    
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="iddetallealmacen")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
   
    @Column(name="fecha_entrada_producto")
    private String fechaentrada;
    
    @Column(name="fecha_salida_producto")
    private String fechasalida;
    
    @Column(name="estda")
    private boolean estado; 
    
    @ManyToOne
    @JoinColumn(name="id_almacen", nullable =false)
    private almacen almacen;
   
}
