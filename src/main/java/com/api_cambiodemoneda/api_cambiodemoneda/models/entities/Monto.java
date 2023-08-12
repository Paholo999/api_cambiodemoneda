package com.api_cambiodemoneda.api_cambiodemoneda.models.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import javax.persistence.*;


@NoArgsConstructor
@AllArgsConstructor

@Data
@Table(name = "monto")
@Entity
public class Monto implements Serializable {
    @OneToMany(mappedBy = "monto", fetch = FetchType.EAGER)


    @Id
    private String id;
    @Column(name ="monto")
    private double monto;
    @Column(name ="montodeorigen")
    private String monedadeorigen;
    @Column(name ="montodedestino")
    private String modenadedestino;
    @Column(name ="montotipodecambio")
    private double montotipodecambio;
    @Column(name ="tipodecambio")
    private double tipodecambio;
}
