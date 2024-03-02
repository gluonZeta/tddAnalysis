package gluon.projects.tddanalysis.repository;

import gluon.projects.tddanalysis.data.entity.Classe;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
class ClasseRepositoryTest {

    @Autowired
    ClasseRepository classeRepository;

    @Test
    void givenId_whenFindById_thenReturnClasse(){
        long idTest = 2;
        Optional<Classe> optionalClasse = classeRepository.findById(idTest);
        assertTrue(!optionalClasse.isEmpty());
        Classe classe = optionalClasse.get();
        assertEquals("Première",classe.getName());
    }
}