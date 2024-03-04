package gluon.projects.service.servicemetiers;

import gluon.projects.data.entity.Etudiant;
import gluon.projects.data.entity.Etudier;
import gluon.projects.repository.EtudiantRepository;
import gluon.projects.repository.EtudierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EtudiantServiceImpl implements EtudiantService {

    EtudiantRepository etudiantRepository;

    EtudierRepository etudierRepository;
    @Autowired
    public EtudiantServiceImpl(EtudierRepository etudierRepository, EtudiantRepository etudiantRepository){
        this.etudierRepository = etudierRepository;
        this.etudiantRepository = etudiantRepository;
    }

    @Override
    public float getMean(String lastname) {
        List<Etudier> listEtudier = etudierRepository.findByEtudiantLastName(lastname);
        float sum = listEtudier.stream().map(x -> x.getNote()).reduce((x,y) -> x+y).get();
        return sum/listEtudier.size();
    }

    @Override
    public Map<String, Float> getEveryOneMean() {
        List<Etudiant> etudiants = etudiantRepository.findAll();
        Map<String, Float> etudiantsMeans = new HashMap<>();
        Float mean = 0F;
        for(Etudiant etudiant: etudiants){
            mean = (etudiant.getMyEtudes().stream().map(x -> x.getNote()).reduce((x,y) -> x+y).get())/etudiant.getMyEtudes().size();
            etudiantsMeans.put(etudiant.getLastName(), mean);
        }
        return etudiantsMeans;
    }
}
