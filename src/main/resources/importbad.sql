-- donnÃ©es pour croisiÃ¨re01 --

INSERT INTO `jpa`.`client` (`nom`, `prenom`) VALUES
('Louis', 'Laetitia'),
('Fournol', 'Didier'),
('Balcon', 'Sophie'),
('Deride', 'Tony'),
('Congard', 'Nicolas');

INSERT INTO `jpa`.`paquebot` (`nom`, `tonnage`) VALUES
('British Queen', 1860),
('Titanic', 46328),
('Oasis of the Seas', 225282);

INSERT INTO `jpa`.`croisiere` (`duree`, `nom`, `paquebot_id`) VALUES
(15, 'Mer EgÃ©e', 1),
(9, 'Mer Caspied', 1),
(12, 'Adriatique', 3);

INSERT INTO `jpa`.`reservation` (`id`, `date_resa`, `montant`, `croisiere_id`) VALUES
('2020-11-12', 2400, 3),
('2020-01-23', 11500, 3),
('2020-03-04', 1199, 3),
('2020-04-12', 2867, 3),
('2020-02-22', 890, 3),
('2020-02-27', 2543, 3),
('2020-12-22', 2400, 2),
('2020-02-27', 1199, 2),
('2020-02-22', 1199, 2);

INSERT INTO `jpa`.`reservation_client` (`reservation_id`, `client_id`) VALUES
(1, 1),
(2, 1),
(4, 1),
(6, 1),
(8, 1),
(9, 1),
(1, 2),
(2, 2),
(4, 2),
(6, 2),
(8, 2),
(9, 2),
(1, 3),
(2, 3),
(4, 3),
(6, 3),
(8, 3),
(9, 3),
(3, 4),
(5, 4),
(7, 4),
(3, 5),
(5, 5),
(7, 5);