/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  garate.erlantz
 * Created: 09-mar-2022
 */

DROP TABLE terminoak;
CREATE TABLE Terminoak (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    euskeraz VARCHAR(20),
    gazteleraz VARCHAR(20)
);

INSERT INTO Terminoak VALUES (null, "sagarra", "manzana");
INSERT INTO Terminoak (euskeraz, gazteleraz) VALUES ("madaria","pera");
INSERT INTO Terminoak (euskeraz, gazteleraz) VALUES ("marrubia","fresa");