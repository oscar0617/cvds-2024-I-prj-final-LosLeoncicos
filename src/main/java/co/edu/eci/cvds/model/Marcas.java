package co.edu.eci.cvds.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "MARCAS")
public class Marcas {
    @Id
    @Column(name = "MARCA")
    private String marca;

    @OneToMany(mappedBy = "marca")
    private List<Autos> autos;

    @OneToMany(mappedBy = "marca")
    private List<Servicios> servicios;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}