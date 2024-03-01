create table classe (
    id int auto_increment primary key,
    nom varchar(50)
);

create table etudiant (
    id int auto_increment primary key,
    nom varchar(50),
    prenom varchar(50),
    sexe boolean,
    id_classe int,
    foreign key (id_classe) references classe(id)
);

create table matiere (
    id int auto_increment primary key,
    nom varchar(20),
    niveau varchar(20)
);

create table etudier (
    id_etudiant int,
    id_matiere int,
    note decimal,
    PRIMARY KEY (id_etudiant, id_matiere),
    foreign key (id_etudiant) references etudiant(id),
    foreign key (id_matiere) references matiere(id)
);

create table professeur (
    id int auto_increment primary key,
    nom varchar(20),
    id_matiere int,
    foreign key (id_matiere) references matiere(id)
);

create table enseigner (
    id_classe int,
    id_professeur int,
    PRIMARY KEY (id_classe, id_professeur),
    foreign key (id_classe) references classe(id),
    foreign key (id_professeur) references professeur(id)
);