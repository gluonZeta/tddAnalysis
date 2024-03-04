package gluon.projects.repository;

import gluon.projects.data.entity.Etudier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EtudierRepository extends JpaRepository<Etudier, Long> {

    List<Etudier> findByEtudiantLastName(String lastname);

}
