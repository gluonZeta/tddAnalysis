package gluon.projects.data.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@Table(name = "matiere")
public class Matiere {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom")
    private String name;

    @Column(name = "niveau")
    private String niveau;

    public Matiere(){}

    public Matiere(Long id, String name, String niveau) {
        this.id = id;
        this.name = name;
        this.niveau = niveau;
    }
}
