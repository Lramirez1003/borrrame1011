package pucmm.edu.eitc.practica2mocky.encapsulaciones;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Proyecto implements Serializable {

    @Id
    @Column(name = "id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String usuario;
    int endpoints;

}
