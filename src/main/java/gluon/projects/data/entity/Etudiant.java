package gluon.projects.data.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Builder
@Table(name = "etudiant")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom")
    private String lastName;

    @Column(name = "prenom")
    private String firstName;

    @Column(name = "sexe")
    private boolean sexe;

    @ManyToOne
    @JoinColumn(name = "id_classe")
    private Classe classe;

    @OneToMany(mappedBy = "etudiant", fetch = FetchType.EAGER)
    private List<Etudier> myEtudes;

    public Etudiant(){}

    public Etudiant(Long id, String lastName, String firstName, boolean sexe, Classe classe, List<Etudier> myEtudes) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.sexe = sexe;
        this.classe = classe;
        this.myEtudes = myEtudes;
    }
}


