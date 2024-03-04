package gluon.projects.service.servicemetiers;

import java.util.Map;

public interface EtudiantService {

    public float getMean(String lastname);

    public Map<String, Float> getEveryOneMean();

}
