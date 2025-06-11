package it.epicode.W6_D3_U2_F.service;

import it.epicode.W6_D3_U2_F.dto.AutoreDto;
import it.epicode.W6_D3_U2_F.exception.AutoreNotFounException;

import it.epicode.W6_D3_U2_F.model.Autore;
import it.epicode.W6_D3_U2_F.repository.AutoreRepository;
import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class AutoreService {
    @Autowired
    private AutoreRepository autoreRepository;
    

    private final List<Autore> autori = new ArrayList<>();
    private final Random rnd = new Random();


    public Autore saveAutore(Autore autore) {
        autore.setId(rnd.nextInt(1, 300));
        autori.add(autore);
        return autore;
    }

    public List<Autore> getAllAutori() {
        return new ArrayList<>(autori);
    }


    public Autore getAutoreById(int id) throws AutoreNotFounException {
        return autori.stream()
                .filter(autore -> autore.getId() == id)
                .findFirst()
                .orElseThrow(() -> new AutoreNotFounException("Autore non trovato con id: " + id));
    }


    public Autore updateAutore(int id, Autore autore) throws AutoreNotFounException{
        Autore autoreEsistente = getAutoreById(id);
        autoreEsistente.setNome(autore.getNome());
        autoreEsistente.setCognome(autore.getCognome());
        autoreEsistente.setEmail(autore.getEmail());
        autoreEsistente.setDataDiNascita(autore.getDataDiNascita());
        return autoreEsistente;
    }

    public void deleteAutore(int id) throws AutoreNotFounException{
        Autore autoreDaRimuovere = getAutoreById(id);
        autori.remove(autoreDaRimuovere);
    }
}
