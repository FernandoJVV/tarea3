drop schema practica;
drop user usuario_practica;
CREATE SCHEMA `practica` ;

CREATE TABLE `practica`.`estado` (
  `id_estado` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(20) NOT NULL,
  `capital` VARCHAR(30) NOT NULL,
  `poblacion` int(25) NULL,
  `costas` VARCHAR(15) NULL,
  PRIMARY KEY (`id_estado`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_eo_0900_ai_ci;

INSERT INTO `practica`.`estado` (`id_estado`, `nombre`, `capital`, `poblacion`, `costas`) VALUES ('1', 'Costa Rica', 'San Jose', 5000000, '45');
INSERT INTO `practica`.`estado` (`id_estado`, `nombre`, `capital`, `poblacion`, `costas`) VALUES ('2', 'Estados Unidos', 'Washington D.C.', 65903000, '56');
INSERT INTO `practica`.`estado` (`id_estado`, `nombre`, `capital`, `poblacion`, `costas`) VALUES ('3', 'Mexico', 'Ciudad de Mexico', 3420000, '34');

create user 'usuario_practica'@'%' identified by 'la_Clave.';
grant all privileges on practica.* to 'usuario_practica'@'%';
flush privileges;