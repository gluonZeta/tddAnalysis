package gluon.projects.service.servicemetiers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.AUTO_CONFIGURED)
public class EtudiantServiceImplIT {

    @Autowired
    EtudiantService etudiantService;

    @Test
    void givenLastNameAndMatier_whenGetEtudiantNoteByMatiere_thenReturnNote() {
        String lastname = "Martin";
        String matiere = "Géographie";
        Float note = etudiantService.getEtudiantNoteByMatiere(lastname, matiere);
        assertInstanceOf(Float.class, note);
        assertNotNull(note);
        assertNotEquals(0,note);
    }

    @Test
    void whenRequestMean_thenReturnAllEtudiantMean() {
        Map<String, Float> etudiantMean = etudiantService.getEveryOneMean();
        assertNotNull(etudiantMean);
        assertEquals(49, etudiantMean.size());
        System.out.println("----------------------------------------------------------------");
        for(Map.Entry<String, Float> etudiantMeanValue: etudiantMean.entrySet()){
            System.out.println(etudiantMeanValue.getKey() + " ---- " + etudiantMeanValue.getValue());
        }
        System.out.println("----------------------------------------------------------------");
    }

}
