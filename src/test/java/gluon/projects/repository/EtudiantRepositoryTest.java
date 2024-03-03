package gluon.projects.repository;

import gluon.projects.data.entity.Etudiant;
import gluon.projects.data.entity.Etudier;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class EtudiantRepositoryTest {

    @Autowired
    EtudiantRepository etudiantRepository;

    @Test
    void givenAnEtudiant_whenGetEtudes_thenReturnEtudesList() {
        Optional<Etudiant> optionalEtudiant = this.etudiantRepository.findByLastName("Hernandez");
        assertTrue(!optionalEtudiant.isEmpty());
        Etudiant etudiant = optionalEtudiant.get();
        List<Etudier> etudiantEtude = etudiant.getMyEtudes();
        assertEquals(10,etudiantEtude.size());
        etudiantEtude.stream()
                .map( x -> x.getMatiere().getName() + " note: " + x.getNote())
                .forEach(System.out::println);
    }


    @Test
    void givenEtudiant_whenUpdateEtudiant_returnNewEtudiantValue(){
        List<Etudiant> optionalEtudiants = etudiantRepository.findAll();
        assertEquals(49, optionalEtudiants.size());
        Optional<Etudiant> optionalEtudiant = etudiantRepository.findById((long) 3);
        Etudiant etudiant = optionalEtudiant.get();
        assertEquals("Williams", etudiant.getLastName());
        etudiant.setLastName("Grigory");
        etudiantRepository.save(etudiant);
        optionalEtudiant = etudiantRepository.findById((long) 3);
        etudiant = optionalEtudiant.get();
        assertEquals("Grigory", etudiant.getLastName());
        optionalEtudiants = etudiantRepository.findAll();
        assertEquals(49, optionalEtudiants.size());
    }

    @Test
    void givenEtudiant_whenSaveEtudiant_returnEtudiantWithId(){
        Etudiant etudiant = Etudiant
                .builder()
                .lastName("Dirac")
                .firstName("Paul")
                .sexe(true)
                .build();

        etudiant = etudiantRepository.save(etudiant);
        assertNotNull(etudiant.getId());
    }

    @Test
    void givenClasseName_whenFindEdutiant_returnEtudiantInTheClasse(){
        Optional<List<Etudiant>> optionalEtudiants = etudiantRepository.findEdutiant("Seconde");
        assertTrue(!optionalEtudiants.isEmpty());
        List<Etudiant> etudiants = optionalEtudiants.get();
        assertEquals(11, etudiants.size());

        optionalEtudiants = etudiantRepository.findEdutiant("Quatrième");
        assertTrue(!optionalEtudiants.isEmpty());
        etudiants = optionalEtudiants.get();
        assertEquals(6, etudiants.size());

        optionalEtudiants = etudiantRepository.findEdutiant("Sixième");
        etudiants = optionalEtudiants.get();
        assertTrue(etudiants.isEmpty());
    }

    @Test
    void givenSexe_whenFindBySexe_thenReturnListEtudiant(){
        Optional<List<Etudiant>> optionalEtudiants = etudiantRepository.findBySexe(true);
        assertTrue(!optionalEtudiants.isEmpty());
        List<Etudiant> etudiants = optionalEtudiants.get();
        assertEquals(25, etudiants.size());
    }

}