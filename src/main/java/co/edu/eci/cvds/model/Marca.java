package co.edu.eci.cvds.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MARCAS")
public class Marca {
    @Id
    @Column(name = "MARCA")
    private String marca;

    @Column(name = "PAIS")
    private String pais;

    /*@OneToMany(mappedBy = "marca")
    @Column(name = "AUTOS")
    private List<Auto> autos;*/

    @Column(name = "AUTOS")
    private String autos;

    /*@OneToMany(mappedBy = "marca")
    @Column(name = "SERVICIOS")
    private List<Servicio> servicios;*/

    @Column(name = "SERVICIOS")
    private String servicios;

    public Marca(){
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}