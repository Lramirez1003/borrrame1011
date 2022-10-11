package pucmm.edu.eitc.practica2mocky.encapsulaciones;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Rol implements Serializable{

    @Id
    String rol;

}
