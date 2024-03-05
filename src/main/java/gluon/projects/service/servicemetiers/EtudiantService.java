package gluon.projects.service.servicemetiers;

import java.util.Map;

public interface EtudiantService {

    public float getMean(String lastname);

    public float getEtudiantNoteByMatiere(String lastname, String matiere);

    public Map<String, Float> getEveryOneMean();

}
