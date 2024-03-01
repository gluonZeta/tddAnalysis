package gluon.projects.tddAnalysis.repository;

import gluon.projects.tddAnalysis.data.entity.Etudiant;
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
    public void givenEtudiant_whenUpdateEtudiant_returnNewEtudiantValue(){
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
    public void givenEtudiant_whenSaveEtudiant_returnEtudiantWithId(){
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
    public void givenClasseName_whenFindEdutiant_returnEtudiantInTheClasse(){
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
    public void givenSexe_whenFindBySexe_thenReturnListEtudiant(){
        Optional<List<Etudiant>> optionalEtudiants = etudiantRepository.findBySexe(true);
        assertTrue(!optionalEtudiants.isEmpty());
        List<Etudiant> etudiants = optionalEtudiants.get();
        assertEquals(25, etudiants.size());
    }

}