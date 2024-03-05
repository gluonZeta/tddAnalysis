package gluon.projects.controllers;

import gluon.projects.service.servicemetiers.EtudiantService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/etudiant")
public class EtudiantController {

    private EtudiantService etudiantService;

    public EtudiantController(EtudiantService etudiantService){
        this.etudiantService = etudiantService;
    }

    @GetMapping("/mean")
    public Map<String, Float> getEtudiantsMeans(){
        return this.etudiantService.getEveryOneMean();
    }

}
