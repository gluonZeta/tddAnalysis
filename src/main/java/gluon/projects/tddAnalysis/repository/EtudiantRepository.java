package gluon.projects.tddAnalysis.repository;

import gluon.projects.tddAnalysis.data.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface EtudiantRepository  extends JpaRepository<Etudiant, Long> {

    Optional<List<Etudiant>> findBySexe(boolean sexe);

    @Query("select etudiant from Etudiant etudiant where etudiant.classe.name = ?1")
    Optional<List<Etudiant>> findEdutiant(String classeName);

}
