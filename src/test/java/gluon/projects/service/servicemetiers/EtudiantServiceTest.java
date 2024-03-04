package gluon.projects.service.servicemetiers;

import gluon.projects.data.entity.Etudier;
import gluon.projects.repository.EtudierRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class EtudiantServiceTest {

    @InjectMocks
    EtudiantServiceImpl etudiantServiceImpl;

    @Mock
    EtudierRepository etudierRepository;

    @Test
    void givenEtudiant_whenGetMean_returnMeanOfTheEtudiant(){
        List<Etudier> listEtudier = new ArrayList<>();
        Random random = new Random();
        float expectedMean = 14.5F;
        for(int i = 1; i <= 10; i++) {
            listEtudier.add(Etudier.builder().note(expectedMean).build());
        }
        when(etudierRepository.findByEtudiantLastName(anyString())).thenReturn(listEtudier);
        float etudiantMean = etudiantServiceImpl.getMean("Dirac");
        assertEquals(expectedMean,etudiantMean);
    }

}