package gluon.projects.repository;

import gluon.projects.data.entity.Etudier;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class EtudierRepositoryTest {

    @Autowired
    EtudierRepository etudierRepository;

    @Test
    void givenLastName_whenFindByLastName_thenReturnListEtudier(){
        String lastname = "Lopez";
        List<Etudier> etudiers = etudierRepository.findByEtudiantLastName(lastname);
        assertNotNull(etudiers);
        assertEquals(10,etudiers.size());
    }

}