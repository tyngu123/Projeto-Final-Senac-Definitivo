CREATE DATABASE db_projeto_final;

USE db_projeto_final;

CREATE TABLE tipo_usuario(
		id_tipo INT PRIMARY KEY AUTO_INCREMENT,
        descricao VARCHAR(20) NOT NULL
) ENGINE = innodb;

CREATE TABLE tipo_documento(
		id_documento INT PRIMARY KEY AUTO_INCREMENT,
        descricao VARCHAR(30) NOT NULL
) ENGINE = innodb;
    
CREATE TABLE bairro(
		id_bairro INT PRIMARY KEY AUTO_INCREMENT,
		descricao VARCHAR(50)
) ENGINE = innodb;

CREATE TABLE estado(
		id_estado INT PRIMARY KEY AUTO_INCREMENT,
		descricao VARCHAR(50) NOT NULL,
		UF CHAR(2) NOT NULL
) ENGINE = innodb;

CREATE TABLE municipio(
		id_municipio INT PRIMARY KEY AUTO_INCREMENT,
		descricao VARCHAR(50) NOT NULL,
		id_estado INT NOT NULL,
			FOREIGN KEY (id_estado)
			REFERENCES estado(id_estado)
				ON UPDATE CASCADE
				ON DELETE CASCADE
) ENGINE = innodb;

CREATE TABLE logradouro(
		id_logradouro INT PRIMARY KEY AUTO_INCREMENT,
		descricao VARCHAR(50) NOT NULL
    
) ENGINE = innodb;

CREATE TABLE endereco (
		id_endereco INT PRIMARY KEY AUTO_INCREMENT,
        id_logradouro INT NOT NULL,
			FOREIGN KEY (id_logradouro)
			REFERENCES logradouro(id_logradouro)
				ON UPDATE CASCADE
				ON DELETE CASCADE,
		nome_rua VARCHAR (500) NOT NULL,
		id_bairro INT NOT NULL,
			FOREIGN KEY (id_bairro)
			REFERENCES bairro(id_bairro)
				ON UPDATE CASCADE
				ON DELETE CASCADE,
		id_municipio INT NOT NULL,
			FOREIGN KEY (id_municipio)
			REFERENCES municipio(id_municipio)
				ON UPDATE CASCADE
				ON DELETE CASCADE,
		CEP VARCHAR(20) NOT NULL,
		numero int NOT NULL,
		complemento VARCHAR (50) NOT NULL
) ENGINE = innodb;    

CREATE TABLE usuario (
		id_usuario INT PRIMARY KEY AUTO_INCREMENT,
        nome_completo VARCHAR(50) NOT NULL,
        apelido VARCHAR(50) NOT NULL,
        nascimento date null,
        documento VARCHAR(30) NOT NULL UNIQUE,
        id_documento INT NOT NULL,
			FOREIGN KEY (id_documento)
			REFERENCES tipo_documento(id_documento)
            	ON UPDATE CASCADE
				ON DELETE CASCADE,
		id_endereco INT NOT NULL,
			FOREIGN KEY (id_endereco)
			REFERENCES endereco(id_endereco)
				ON UPDATE CASCADE
				ON DELETE CASCADE,
        email VARCHAR(50) NOT NULL UNIQUE,
        senha VARCHAR(30) NOT NULL,
        id_tipo int NOT NULL,
			FOREIGN KEY (id_tipo)
			REFERENCES tipo_usuario(id_tipo)
				ON UPDATE CASCADE
				ON DELETE CASCADE
) ENGINE = innodb;

CREATE TABLE plano_cliente (
		id_plano INT PRIMARY KEY AUTO_INCREMENT,
		planos VARCHAR(100) NOT NULL,
        planos_descricao VARCHAR (100) NOT NULL,
        planos_preco DECIMAL(4,2) NOT NULL
) ENGINE = innodb;
        
CREATE TABLE funcionalidade (
		id_fun INT PRIMARY KEY AUTO_INCREMENT,
        fun VARCHAR(100) NOT NULL,
        fun_descricao VARCHAR(100) NOT NULL
) ENGINE = innodb;      
        
CREATE TABLE relacao (
		id_relacao INT PRIMARY KEY AUTO_INCREMENT,
		id_tipo INT NOT NULL,
			FOREIGN KEY (id_tipo)
			REFERENCES tipo_usuario(id_tipo)
				ON UPDATE CASCADE
				ON DELETE CASCADE,
        id_fun INT NOT NULL,
			FOREIGN KEY (id_fun)
			REFERENCES funcionalidade(id_fun)
				ON UPDATE CASCADE
				ON DELETE CASCADE,
		id_plano INT NOT NULL,
			FOREIGN KEY (id_plano)
			REFERENCES plano_cliente(id_plano)
				ON UPDATE CASCADE
				ON DELETE CASCADE
) ENGINE = innodb;    
    
CREATE TABLE assinatura_do_cliente (
		id_assinatura INT PRIMARY KEY AUTO_INCREMENT,
		id_usuario INT NOT NULL,
			FOREIGN KEY (id_usuario)
			REFERENCES usuario(id_usuario)
				ON UPDATE CASCADE
				ON DELETE CASCADE,
		id_plano INT NOT NULL,
			FOREIGN KEY (id_plano)
			REFERENCES plano_cliente(id_plano)
				ON UPDATE CASCADE
				ON DELETE CASCADE 
)ENGINE = innodb; 

CREATE TABLE cartao (
		id_cartao INT PRIMARY KEY AUTO_INCREMENT,
		numero VARCHAR(45) NOT NULL,
		data_validade VARCHAR(5) NOT NULL,
		nome_pessoa VARCHAR(45) NOT NULL,
		cvv MEDIUMINT(3) NOT NULL,
		tipo ENUM('Credito', 'Debito') NOT NULL,
		banco VARCHAR(45) NOT NULL
        
)ENGINE = innodb;

CREATE TABLE pix (
		id_pix INT PRIMARY KEY AUTO_INCREMENT,
		nome_beneficiario VARCHAR(50),
		chave_pix VARCHAR(20)
)ENGINE = innodb;

CREATE TABLE forma_de_pagamento (
		id_forma_pagamento INT PRIMARY KEY AUTO_INCREMENT,
		id_cartao INT NOT NULL,
			FOREIGN KEY (id_cartao)
			REFERENCES cartao(id_cartao)
				ON UPDATE CASCADE
				ON DELETE CASCADE,
		id_pix INT NOT NULL,
			FOREIGN KEY (id_pix)
			REFERENCES pix(id_pix)
				ON UPDATE CASCADE
				ON DELETE CASCADE
) ENGINE = innodb;

CREATE TABLE venda(
		id_venda INT PRIMARY KEY AUTO_INCREMENT,
		data_venda DATE NOT NULL,
		id_plano INT NOT NULL, 
			FOREIGN KEY (id_plano)
			REFERENCES plano_cliente(id_plano)
				ON UPDATE CASCADE
				ON DELETE CASCADE,
        valor DECIMAL (4,2),
        id_usuario INT NOT NULL,
			FOREIGN KEY (id_usuario)
			REFERENCES usuario(id_usuario)
				ON UPDATE CASCADE
				ON DELETE CASCADE,
		id_forma_pagamento INT NOT NULL,
			FOREIGN KEY (id_forma_pagamento)
			REFERENCES forma_de_pagamento(id_forma_pagamento)
				ON UPDATE CASCADE
				ON DELETE CASCADE
) ENGINE = innodb;

CREATE TABLE vagas (
		id_vagas INT PRIMARY KEY AUTO_INCREMENT,
        id_usuario INT NOT NULL,
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