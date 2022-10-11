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
public class Usuario implements Serializable {

    @Id
    String usuario;
    String contrasena;
    boolean activo;
    String nombre;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    Set<Rol> roles;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    List<Mock>mocks = new ArrayList<>();

    public String getRol(){
        ArrayList<Rol>rol = new ArrayList<>(roles);
        return rol.get(0).getRol();
    }
}
