INSERT INTO classe (nom) VALUES
('Terminal'),
('Première'),
('Seconde'),
('Quatrième'),
('Troisième');

INSERT INTO etudiant (nom, prenom, sexe, id_classe) VALUES
('Smith', 'John', 1, 1),
('Johnson', 'Emma', 0, 4),
('Williams', 'Michael', 1, 3),
('Brown', 'Olivia', 0, 1),
('Jones', 'James', 1, 2),
('Garcia', 'Sophia', 0, 3),
('Miller', 'Robert', 1, 1),
('Davis', 'Isabella', 0, 2),
('Rodriguez', 'Daniel', 1, 5),
('Martinez', 'Emily', 0, 1),
('Hernandez', 'Alexander', 1, 2),
('Lopez', 'Mia', 0, 3),
('Gonzalez', 'David', 1, 1),
('Wilson', 'Charlotte', 0, 2),
('Anderson', 'Ethan', 1, 3),
('Thomas', 'Amelia', 0, 4),
('Taylor', 'Mason', 1, 2),
('Moore', 'Harper', 0, 3),
('Jackson', 'Evelyn', 1, 1),
('Martin', 'Liam', 0, 2),
('Lee', 'Avery', 1, 3),
('Perez', 'Ella', 0, 1),
('Thompson', 'Logan', 1, 2),
('White', 'Grace', 0, 3),
('Harris', 'Benjamin', 1, 5),
('Sanchez', 'Sofia', 0, 2),
('Clark', 'Jackson', 1, 3),
('Ramirez', 'Chloe', 0, 1),
('Lewis', 'Lucas', 1, 2),
('Adams', 'Sophie', 0, 1),
('Walker', 'Noah', 1, 2),
('Stewart', 'Ava', 0, 4),
('Parker', 'Liam', 1, 1),
('Watson', 'Emma', 0, 2),
('Morris', 'Jacob', 1, 4),
('Cook', 'Olivia', 0, 5),
('Bell', 'William', 1, 2),
('Murphy', 'Isabella', 0, 3),
('Rivera', 'James', 1, 1),
('Gray', 'Sophia', 0, 2),
('James', 'Alexander', 1, 3),
('Collins', 'Charlotte', 0, 4),
('Evans', 'Ethan', 1, 2),
('Sanders', 'Mia', 0, 3),
('Howard', 'Michael', 1, 1),
('Nguyen', 'Amelia', 0, 4),
('Baker', 'Benjamin', 1, 5),
('Reed', 'Harper', 0, 1),
('Hill', 'Daniel', 1, 2);


INSERT INTO matiere (nom, niveau) VALUES
('Mathématiques', 'Secondaire'),
('Physique', 'Première'),
('Chimie', 'Terminal'),
('Histoire', 'Collège'),
('Géographie', 'Collège'),
('Français', 'Lycée'),
('Anglais', 'Université'),
('Biologie', 'Première'),
('Arts', 'Lycée'),
('EPS', 'Collège');

INSERT INTO etudier (id_etudiant, id_matiere, note)
SELECT e.id, m.id, ROUND(RAND() * 20, 2)
FROM etudiant e, matiere m;

INSERT INTO professeur (nom, id_matiere) VALUES
('Baker', 1),
('Gonzalez', 2),
('Nelson', 3),
('Carter', 4),
('Mitchell', 5),
('Perez', 6),
('Roberts', 7),
('Turner', 8),
('Phillips', 9),
('Campbell', 10);


INSERT INTO enseigner (id_classe, id_professeur) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(1, 6),
(2, 7),
(3, 8),
(4, 9),
(5, 10),
(1, 2),
(2, 3),
(3, 4),
(4, 5),
(5, 6);
