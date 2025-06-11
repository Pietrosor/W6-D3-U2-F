package it.epicode.W6_D3_U2_F.repository;

import it.epicode.W6_D3_U2_F.model.Autore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AutoreRepository extends JpaRepository<Autore, Long> {
    Page<Autore> findAll(Pageable pageable);
}
