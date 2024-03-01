package gluon.projects.tddAnalysis.data.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@Table(name = "etudiant")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nom")
    private String lastName;

    @Column(name = "prenom")
    private String firstName;

    @Column(name = "sexe")
    private boolean sexe;

    @ManyToOne
    @JoinColumn(name = "id_classe")
    private Classe classe;
    public Etudiant(){}

    public Etudiant(long id, String lastName, String firstName, boolean sexe, Classe classe) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.sexe = sexe;
        this.classe = classe;
    }
}


