package gluon.projects.repository;

import gluon.projects.data.entity.Classe;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class ClasseRepositoryTest {

    @Autowired
    ClasseRepository classeRepository;

    @Test
    void whenFindAll_thenReturnAllClasse() {
        List<Classe> classes = classeRepository.findAll();
        assertNotEquals(0, classes.size());
    }

    @Test
    void givenId_whenFindById_thenReturnClasse(){
        long idTest = 2;
        Optional<Classe> optionalClasse = classeRepository.findById(idTest);
        assertTrue(!optionalClasse.isEmpty());
        Classe classe = optionalClasse.get();
        assertEquals("Première",classe.getName());
    }
}