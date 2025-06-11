package it.epicode.W6_D3_U2_F.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class AutoreDto {
    private Long id;
    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataDiNascita;
}
