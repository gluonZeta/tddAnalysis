package gluon.projects.data.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@Table(name = "etudier")
@IdClass(Etudier.class)
public class Etudier {

    @Id
    @ManyToOne
    @JoinColumn(name = "id_etudiant")
    private Etudiant etudiant;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_matiere")
    private Matiere matiere;

    @Column(name = "note")
    private float note;

    public Etudier(){}

    public Etudier(Etudiant etudiant, Matiere matiere, float note) {
        this.etudiant = etudiant;
        this.matiere = matiere;
        this.note = note;
    }
}
