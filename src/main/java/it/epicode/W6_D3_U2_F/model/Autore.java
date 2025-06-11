package it.epicode.W6_D3_U2_F.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "autori")
@Data
public class Autore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String cognome;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private LocalDate dataDiNascita;

    @OneToOne
    @JoinColumn(name = "blog_id", unique = true, nullable = false)
    private Blog blog;

}
