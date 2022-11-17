
package pe.idat.demo.entity;

import java.io.Serializable;
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

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "ventas")
@Table(name = "ventas")
public class ventas  implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @Column(name = "id_ventas")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    
    @ManyToOne
    @JoinColumn(name="id_factura", nullable =false)
    private factura factura;
    
    @ManyToOne
    @JoinColumn(name="id_producto", nullable =false)
    private productos productos;
    
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "estven")
    private boolean estado;

    
}
