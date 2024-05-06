package co.edu.eci.cvds.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "AUTOS")
public class Autos {
    @Id
    @Column(name = "ID")
    private int id;

    @JoinColumn(name = "MARCA_ID", referencedColumnName = "ID")
    @OneToMany
    private String marca;

    @Column(name = "YEAR")
    private Date year;

    @Column(name = "MODELO")
    private String modelo;

    @Column(name = "CILINDRAJE")
    private int cilindraje;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }


}
