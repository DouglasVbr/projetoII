CREATE DATABASE gerenciador_hardware;

USE gerenciador_hardware;

-- Tabela de Usuários
CREATE TABLE usuarios (
    id_usuario INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    nome_usuario VARCHAR(50) UNIQUE NOT NULL,
    senha VARCHAR(255) NOT NULL,
    perfil ENUM('tecnico', 'administrador', 'professor') NOT NULL,
    data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Tabela de Laboratórios
CREATE TABLE laboratorios (
    id_laboratorio INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    localizacao VARCHAR(255) NOT NULL
);

-- Tabela de Máquinas
CREATE TABLE maquinas (
    id_maquina INT PRIMARY KEY AUTO_INCREMENT,
    id_laboratorio INT NOT NULL,
    numero_serie VARCHAR(50) UNIQUE NOT NULL,
    processador VARCHAR(100) NOT NULL,
    memoria_ram VARCHAR(50) NOT NULL,
    armazenamento VARCHAR(50) NOT NULL,
    status ENUM('funcionando', 'em manutenção', 'fora de uso') NOT NULL,
    data_aquisicao DATE NOT NULL,
    localizacao VARCHAR(100) NOT NULL,
    FOREIGN KEY (id_laboratorio) REFERENCES laboratorios(id_laboratorio)
);

-- Tabela de Manutenções
CREATE TABLE manutencoes (
    id_manutencao INT PRIMARY KEY AUTO_INCREMENT,
    id_maquina INT NOT NULL,
    id_usuario INT NOT NULL,
    tipo ENUM('preventiva', 'corretiva') NOT NULL,
    descricao_problema TEXT NOT NULL,
    descricao_solucao TEXT,
    data_manutencao DATE NOT NULL,
    custo DECIMAL(10, 2),
    FOREIGN KEY (id_maquina) REFERENCES maquinas(id_maquina),
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario)
);

-- Tabela de Peças
CREATE TABLE pecas (
    id_peca INT PRIMARY KEY AUTO_INCREMENT,
    tipo VARCHAR(100) NOT NULL,
    fabricante VARCHAR(100) NOT NULL,
    numero_serie VARCHAR(50) UNIQUE NOT NULL,
    quantidade_estoque INT NOT NULL,
    imagem_peca BLOB
);

-- Tabela de Peças por Manutenção
CREATE TABLE pecas_manutencao (
    id_peca_manutencao INT PRIMARY KEY AUTO_INCREMENT,
    id_manutencao INT NOT NULL,
    id_peca INT NOT NULL,
    quantidade_usada INT NOT NULL,
    FOREIGN KEY (id_manutencao) REFERENCES manutencoes(id_manutencao),
    FOREIGN KEY (id_peca) REFERENCES pecas(id_peca)
);

-- Tabela de Histórico de Uso
CREATE TABLE historico_uso (
    id_historico INT PRIMARY KEY AUTO_INCREMENT,
    id_maquina INT NOT NULL,
    data_uso DATE NOT NULL,
    descricao TEXT NOT NULL,
    FOREIGN KEY (id_maquina) REFERENCES maquinas(id_maquina)
);

-- Tabela de Agendamento de Manutenção
CREATE TABLE agenda_manutencao (
    id_agendamento INT PRIMARY KEY AUTO_INCREMENT,
    id_maquina INT NOT NULL,
    data_agendada DATE NOT NULL,
    descricao TEXT NOT NULL,
    status ENUM('pendente', 'realizada') NOT NULL,
    FOREIGN KEY (id_maquina) REFERENCES maquinas(id_maquina)
);
