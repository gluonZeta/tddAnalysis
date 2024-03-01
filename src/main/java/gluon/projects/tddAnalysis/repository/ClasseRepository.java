package gluon.projects.tddAnalysis.repository;

import gluon.projects.tddAnalysis.data.entity.Classe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClasseRepository extends JpaRepository<Classe, Long> {

    Optional<Classe> findById(Long id);

}
