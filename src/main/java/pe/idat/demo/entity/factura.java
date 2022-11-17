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

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "factura")
@Table(name = "factura")
public class factura implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id
    @Column(name = "id_factura")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_factura;
    
    @Column(name = "fecha")
    private String fecha;
    
    @Column(name = "estfec")
    private boolean estado;
    
    @ManyToOne
    @JoinColumn(name="id_cliente", nullable =false)
    private clientes clientes;

    
}

