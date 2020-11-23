package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Tasa_de_intereses")

public class TasaDeInteres
{
    @Id
    private Long id; //---id de la tabla

    @Column(name="interes_code")
    private String interesCode;

    @Column(name="interes_monto")
    private int interesMonto;

    public TasaDeInteres() {
    }

    public TasaDeInteres(Long id, String interesCode, int interesMonto) {
        this.id = id;
        this.interesCode = interesCode;
        this.interesMonto = interesMonto;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getInteresCode() {
        return interesCode;
    }
    public void setInteresCode(String interesCode) {
        this.interesCode = interesCode;
    }

    public int getInteresMonto() {
        return interesMonto;
    }
    public void setInteresMonto(int interesMonto) {
        this.interesMonto = interesMonto;
    }
}
