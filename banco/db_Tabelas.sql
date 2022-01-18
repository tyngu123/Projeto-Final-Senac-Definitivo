CREATE DATABASE db_projeto_final;

USE db_projeto_final;

CREATE TABLE tipo_usuario(
		id_tipo int PRIMARY KEY auto_increment,
        descricao VARCHAR(20)
) ENGINE = innodb;

CREATE TABLE tipo_documento(
		id_documento INT PRIMARY KEY auto_increment,
        descricao VARCHAR(30)
	) ENGINE = innodb;
    
CREATE TABLE bairro(
	id_bairro int PRIMARY KEY auto_increment,
	descricao VARCHAR(20)
) ENGINE = innodb;

CREATE TABLE estado(
	id_estado int PRIMARY KEY auto_increment,
	descricao VARCHAR(20),
    UF CHAR(2)
) ENGINE = innodb;

CREATE TABLE municipio(
	id_municipio int PRIMARY KEY auto_increment,
	descricao VARCHAR(20),
    id_estado int,
	FOREIGN KEY (id_estado)
    REFERENCES estado(id_estado)
				ON UPDATE CASCADE
				ON DELETE CASCADE
) ENGINE = innodb;

CREATE TABLE logradouro(
	id_logradouro int PRIMARY KEY auto_increment,
	descricao VARCHAR(20)
    
) ENGINE = innodb;


CREATE TABLE endereco (
		id_endereco INT PRIMARY KEY AUTO_INCREMENT,
        id_logradouro INT NOT NULL,
        FOREIGN KEY (id_logradouro)
		REFERENCES logradouro(id_logradouro)
				ON UPDATE CASCADE
				ON DELETE CASCADE,
		 id_bairro INT NOT NULL,
        FOREIGN KEY (id_bairro)
		REFERENCES bairro(id_bairro)
				ON UPDATE CASCADE
				ON DELETE CASCADE,
                 id_municipio INT,
        FOREIGN KEY (id_municipio)
		REFERENCES municipio(id_municipio)
				ON UPDATE CASCADE
				ON DELETE CASCADE,
                CEP VARCHAR(20) NOT NULL,
                numero int NOT NULL,
                complemento VARCHAR (15)
			) ENGINE = innodb;    

CREATE TABLE usuario (
		id_usuario int PRIMARY KEY auto_increment,
        nome_completo VARCHAR(15) NOT NULL,
        apelido VARCHAR(15) NOT NULL,
        nascimento date,
        documento VARCHAR(30) NOT NULL UNIQUE,
        id_documento INT NOT NULL,
        FOREIGN KEY (id_documento)
        REFERENCES tipo_documento(id_documento),
		id_endereco INT NOT NULL,
        FOREIGN KEY (id_endereco)
		REFERENCES endereco(id_endereco)
				ON UPDATE CASCADE
				ON DELETE CASCADE,
        email VARCHAR(50) NOT NULL UNIQUE,
        senha VARCHAR(15) NOT NULL,
        id_tipo int NOT NULL,
			FOREIGN KEY (id_tipo)
			REFERENCES tipo_usuario(id_tipo)
				ON UPDATE CASCADE
				ON DELETE CASCADE
) ENGINE = innodb;



CREATE TABLE plano_cliente (
		id_assinatura int primary key auto_increment,
		planos VARCHAR(30),
        planos_descricao VARCHAR (40),
        planos_preco DECIMAL(4,2)
) ENGINE = innodb;
        
CREATE TABLE funcionalidade (
			id_fun INT PRIMARY KEY auto_increment,
            fun VARCHAR(15),
            fun_descricao VARCHAR(100)
           ) ENGINE = innodb;      
        
    CREATE TABLE relacao (
			id_relacao INT PRIMARY KEY auto_increment,
                id_tipo INT,
            FOREIGN KEY (id_tipo)
			REFERENCES tipo_usuario(id_tipo)
			ON UPDATE CASCADE
            ON DELETE CASCADE,
            id_fun INT,
            FOREIGN KEY (id_fun)
            REFERENCES funcionalidade(id_fun)
            ON UPDATE CASCADE
            ON DELETE CASCADE,
              id_assinatura INT,
            FOREIGN KEY (id_assinatura)
            REFERENCES plano_cliente(id_assinatura)
            ON UPDATE CASCADE
            ON DELETE CASCADE
	) ENGINE = innodb;    
    
CREATE TABLE assinatura_do_cliente (
		id_ass_cli int primary key auto_increment,
		id_usuario int,
			foreign key (id_usuario)
			references usuario(id_usuario)
				ON UPDATE CASCADE
				ON DELETE CASCADE,
		id_assinatura int,
			foreign key (id_assinatura)
			references plano_cliente(id_assinatura)
				ON UPDATE CASCADE
				ON DELETE CASCADE 
)ENGINE = innodb; 

CREATE TABLE Cartao (
		id_cartao INT primary key auto_increment,
		numero VARCHAR(45),
		data_validade VARCHAR(5),
		nome_pessoa VARCHAR(45),
		cvv MEDIUMINT(3),
		tipo ENUM('Credito', 'Debito'),
		banco VARCHAR(45)
        
)ENGINE = innodb;

CREATE TABLE pix (
		id_pix INT PRIMARY KEY auto_increment,
		nome_beneficiario VARCHAR(50),
		chave_pix VARCHAR(20)
)ENGINE = innodb;



CREATE TABLE forma_de_pagamento (
		id_forma_pagamento INT primary key auto_increment,
		id_cartao INT,
		FOREIGN KEY (id_cartao)
		REFERENCES cartao(id_cartao)
            ON UPDATE CASCADE
            ON DELETE CASCADE,
		id_pix INT,
		FOREIGN KEY (id_pix)
		REFERENCES pix(id_pix)
            ON UPDATE CASCADE
            ON DELETE CASCADE
) ENGINE = innodb;

CREATE TABLE venda(
		id_venda INT,
		data_venda DATE,
		id_assinatura INT,
        valor DECIMAL (4,2),
        FOREIGN KEY (id_assinatura)
		REFERENCES plano_cliente(id_assinatura)
            ON UPDATE CASCADE
            ON DELETE CASCADE,
		id_forma_pagamento int,
        foreign key (id_forma_pagamento)
        references forma_de_pagamento(id_forma_pagamento)
			ON UPDATE CASCADE
            ON DELETE CASCADE
) ENGINE = innodb;


CREATE TABLE vagas (
		id_vagas int PRIMARY KEY auto_increment,
        id_usuario int,
         FOREIGN KEY (id_usuario)
		REFERENCES usuario(id_usuario)
        ON UPDATE CASCADE
            ON DELETE CASCADE,
        titulo VARCHAR(50) NOT NULL,
        descricao VARCHAR(300) NOT NULL,
        salario DECIMAL(6,2) NOT NULL,  
        beneficio VARCHAR(150) NOT NULL,
        carga_horaria VARCHAR(50) NOT NULL,
        estado VARCHAR(40) NOT NULL,
        requisitos VARCHAR(200) NOT NULL
)ENGINE = innodb;          

            
CREATE TABLE config (
			id_config INT PRIMARY KEY auto_increment,
            termo varchar(500),
		    sobre varchar(500),
		    seguranca varchar(500)
          
)ENGINE = innodb;


