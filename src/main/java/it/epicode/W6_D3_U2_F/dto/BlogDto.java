package it.epicode.W6_D3_U2_F.dto;


import lombok.Data;

@Data
public class BlogDto {
    private Long id;
    private String categoria;
    private String titolo;
    private String contenuto;
}

