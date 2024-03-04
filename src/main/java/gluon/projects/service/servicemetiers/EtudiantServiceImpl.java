package gluon.projects.service.servicemetiers;

import gluon.projects.data.entity.Etudier;
import gluon.projects.repository.EtudierRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EtudiantServiceImpl implements EtudiantService {

    EtudierRepository etudierRepository;
    @Autowired
    public EtudiantServiceImpl(EtudierRepository etudierRepository){
        this.etudierRepository = etudierRepository;
    }

    @Override
    public float getMean(String lastname) {
        List<Etudier> listEtudier = etudierRepository.findByEtudiantLastName(lastname);
        float sum = listEtudier.stream().map(x -> x.getNote()).reduce((x,y) -> x+y).get();
        return sum/listEtudier.size();
    }
}
