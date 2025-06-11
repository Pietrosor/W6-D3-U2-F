package it.epicode.W6_D3_U2_F.controller;

import it.epicode.W6_D3_U2_F.exception.AutoreNotFounException;
import it.epicode.W6_D3_U2_F.exception.BlogNotFoundException;
import it.epicode.W6_D3_U2_F.model.Autore;
import it.epicode.W6_D3_U2_F.service.AutoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autori")
public class AutoreController {

    @Autowired
    private AutoreService autoreService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Autore createAutore(@RequestBody Autore autore){
        return autoreService.saveAutore(autore);
    }

    @GetMapping
    public List<Autore> getAllAutori(){
        return autoreService.getAllAutori();
    }

    @GetMapping("/{id}")
    public Autore getAutoreById(@PathVariable int id) throws AutoreNotFounException {
        return autoreService.getAutoreById(id);
    }

    @PutMapping("/{id}")
    public Autore updateAutore(@PathVariable int id, @RequestBody Autore autore) throws AutoreNotFounException {
        return autoreService.updateAutore(id, autore);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAutore(@PathVariable int id) throws AutoreNotFounException{
        autoreService.deleteAutore(id);
    }



}
