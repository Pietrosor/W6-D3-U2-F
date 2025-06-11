package it.epicode.W6_D3_U2_F.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "blogs")
@Data
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String categoria;

    @Column
    private String titolo;

    @Column
    private String cover;

    @Column
    private String contenuto;

    @Column
    private int tempoDiLettura;

    @OneToOne(mappedBy = "blog")
    private Autore autore;

}
