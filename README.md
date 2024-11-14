### Gerenciador de Hardware para Laboratórios

## integrantes: 
![euDouglas](https://github.com/user-attachments/assets/2f78d7f1-296c-457b-9fd5-44c4d9c27ab6)

## Descrição
## O Gerenciador de Hardware para Laboratórios é um sistema destinado ao controle, monitoramento e manutenção de máquinas de laboratórios de hardware. Ele integra funcionalidades de inventário, controle de manutenção e peças trocadas, permitindo o gerenciamento eficaz de múltiplos laboratórios e garantindo que todas as máquinas e componentes estejam sempre em bom estado de funcionamento.

## Este sistema permite:

Cadastro e controle de máquinas.
Registro de manutenções e consertos.
Controle de inventário de peças e equipamentos.
Gerenciamento de múltiplos laboratórios e seus respectivos status.
Geração de relatórios detalhados sobre uso e manutenção.
## Funcionalidades
## 1. Cadastro e Controle de Máquinas
Registro de especificações detalhadas de hardware das máquinas.
Associação de máquinas a laboratórios específicos.
Monitoramento do status (funcionando, em manutenção, fora de uso).
## 2. Controle de Consertos e Manutenções
Registro de manutenções corretivas e preventivas.
Histórico completo de manutenções realizadas.
Agendamento de manutenções preventivas.
## 3. Inventário de Peças e Equipamentos
Cadastro e controle de peças e componentes em estoque.
Relacionamento de peças utilizadas nos consertos e manutenções.
## 4. Gerenciamento de Laboratórios
Gerenciamento de múltiplos laboratórios, associando máquinas e peças.
Visualização do status de máquinas e peças por laboratório.
## 5. Controle de Acesso e Usuários
Criação de perfis de usuários com diferentes permissões (administrador, técnico, professor).
Logs de ações realizadas por cada usuário.
## Requisitos
## Requisitos Funcionais
RF-01: Cadastro de máquinas com especificações detalhadas.
RF-02: Associação de máquinas a laboratórios.
RF-03: Exibição do status das máquinas.
RF-04: Registro de manutenções realizadas.
RF-05: Relacionamento das peças utilizadas nas manutenções.
RF-06: Histórico de manutenções.
RF-07: Agendamento de manutenções preventivas.
## Requisitos Não Funcionais
RNF-01: O sistema deve ser capaz de processar até 1000 máquinas e peças com desempenho adequado.
RNF-02: Interface intuitiva para facilitar o uso.
RNF-03: Backup automático diário.
RNF-04: Multiplataforma (Windows, Linux, macOS).
RNF-05: Controle de acesso seguro.
## Tecnologias Utilizadas
Backend: Node.js (Express)
Frontend: React.js ou Vue.js
Banco de Dados: MySQL ou PostgreSQL
Autenticação: JWT (JSON Web Tokens)
Interface Gráfica: JavaFX ou Swing para aplicação desktop
Biblioteca para Relatórios: JFreeChart (gráficos de desempenho)
## Estrutura do Banco de Dados
## 1. Tabela usuarios
Colunas: id_usuario, nome, email, senha, perfil
## 2. Tabela laboratorios
Colunas: id_laboratorio, nome
## 3. Tabela maquinas
Colunas: id_maquina, id_laboratorio, nome, processador, memoria_RAM, armazenamento, numero_serie, status
## 4. Tabela manutencoes
Colunas: id_manutencao, id_maquina, data_manutencao, diagnostico, solucao, tecnico_responsavel
## 5. Tabela pecas
Colunas: id_peca, nome_peca, quantidade_estoque, descricao, imagem
## 6. Tabela pecas_manutencao
Colunas: id_peca_manutencao, id_manutencao, id_peca, quantidade_utilizada


## banco de dados 
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



USE gerenciador_hardware;

-- Tabela de Usuários
CREATE TABLE usuarios (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100),
    nome_usuario VARCHAR(50) NOT NULL UNIQUE,
    senha VARCHAR(50) NOT NULL,
    perfil ENUM('tecnico', 'administrador', 'professor', 'estagiario'),
    data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Tabela de Laboratórios
CREATE TABLE laboratorios (
    id_laboratorio INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    localizacao VARCHAR(100)
);



-- Tabela de Máquinas
CREATE TABLE maquinas (
    id_maquina INT AUTO_INCREMENT PRIMARY KEY,
    processador VARCHAR(50),
    ram VARCHAR(20),
    armazenamento VARCHAR(50),
    numero_serie VARCHAR(50) UNIQUE,
    data_aquisicao DATE,
    status ENUM('funcionando', 'em manutenção', 'fora de uso') DEFAULT 'funcionando',
    id_laboratorio INT,
    FOREIGN KEY (id_laboratorio) REFERENCES laboratorios(id_laboratorio)
);

-- Tabela de Peças
CREATE TABLE pecas (
    id_peca INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50),
    tipo VARCHAR(50),
    fabricante VARCHAR(50),
    numero_serie VARCHAR(50) UNIQUE,
    quantidade_estoque INT DEFAULT 0
);

-- Tabela de Consertos
CREATE TABLE consertos (
    id_conserto INT AUTO_INCREMENT PRIMARY KEY,
    data DATE,
    descricao_problema TEXT,
    solucao_aplicada TEXT,
    id_maquina INT,
    FOREIGN KEY (id_maquina) REFERENCES maquinas(id_maquina)
);

-- Tabela de Histórico de Manutenção
CREATE TABLE historico (
    id_historico INT AUTO_INCREMENT PRIMARY KEY,
    id_maquina INT,
    id_conserto INT,
    data DATE,
    FOREIGN KEY (id_maquina) REFERENCES maquinas(id_maquina),
    FOREIGN KEY (id_conserto) REFERENCES consertos(id_conserto)
);


USE gerenciador_hardware;

-- Inserindo dados na tabela de Usuários
INSERT INTO usuarios (nome, email, nome_usuario, senha, perfil) VALUES
('Douglas Vieira', 'douglascanal1998@gmail.com', 'Dunga', '1234', 'tecnico'),
('admin', 'admin@gmail.com', 'admin', '1234', 'administrador'),
('eder de rosso', 'eder.rosso@ulbra.br', 'eder', '1234', 'professor'),
('jeferson', 'jeferson@ulbra.br', 'jef', '1234', 'professor'),
('joão', 'joao@gmail.com', 'jo', '1234', 'estágiario');

-- Inserindo dados na tabela de Laboratórios
INSERT INTO laboratorios (nome, localizacao) VALUES
('Laboratório de Computação', 'Prédio A - Sala 101'),
('Laboratório de Computação', 'Prédio B - Sala 202'),
('Laboratório de Computação', 'Prédio C - Sala 303');

-- Inserindo dados na tabela de Máquinas
INSERT INTO maquinas (id_laboratorio, numero_serie, processador, memoria_ram, armazenamento, status, data_aquisicao, localizacao) VALUES
(1, 'SN123456', 'Intel Core i7', '16GB', '512GB SSD', 'funcionando', '2022-01-15', 'Sala A101'),
(2, 'SN654321', 'AMD Ryzen 5', '8GB', '1TB HDD', 'em manutenção', '2021-06-20', 'Sala B202'),
(3, 'SN789456', 'Intel Core i5', '8GB', '256GB SSD', 'fora de uso', '2023-03-12', 'Sala C303');


-- Inserindo dados na tabela de Peças
INSERT INTO pecas (tipo, fabricante, numero_serie, quantidade_estoque, imagem_peca) VALUES
('Memória RAM', 'Kingston', 'RAM123456', 20, NULL),
('Processador', 'Intel', 'CPU789456', 10, NULL),
('HD', 'Seagate', 'HD654321', 15, NULL),
('Fonte', 'Corsair', 'FONTE112233', 5, NULL),
('Placa Mãe', 'ASUS', 'MB445566', 8, NULL);


-- Inserindo dados na tabela de Consertos
INSERT INTO consertos (data, descricao_problema, solucao_aplicada, id_maquina) VALUES
('2023-07-01', 'Superaquecimento', 'Limpeza e troca de pasta térmica', 1),
('2023-08-15', 'Atualização de drivers', 'Atualização de BIOS e drivers de rede', 2),
('2024-01-20', 'Falha de inicialização', 'Substituição do SSD', 3);

-- Inserindo dados na tabela de Histórico de Manutenção
INSERT INTO historico (id_maquina, id_conserto, data) VALUES
(1, 1, '2023-07-01'),
(2, 2, '2023-08-15'),
(3, 3, '2024-01-20');

-- Inserindo dados na tabela de Manutenções
INSERT INTO manutencoes (id_maquina, id_maquina, id_usuario, tipo, descricao_problema, descricao_solucao, data_manutencao, custo) VALUES
(1, 1, '1','corretiva', 'Superaquecimento', 'Limpeza e troca de pasta térmica', '2023-07-01', 150.00),
(2, 2, '2', 'preventiva', 'Atualização de drivers', 'Atualização de BIOS e drivers de rede', '2023-08-15', 75.00),
(3, 3, '3', 'corretiva', 'Falha de inicialização', 'Substituição do SSD', '2024-01-20', 200.00);

-- Inserindo dados na tabela de Peças por Manutenção
INSERT INTO pecas_manutencao (id_manutencao, id_peca, quantidade_usada) VALUES
(1, 1, 1),
(2, 2, 2),
(3, 3, 1);

-- Inserindo dados na tabela de Histórico de Uso
INSERT INTO historico_uso (id_maquina, data_uso, descricao) VALUES
(1, '2023-06-01', 'Usada para testes de software'),
(2, '2023-07-05', 'Manutenção no laboratório de redes'),
(3, '2024-01-15', 'Usada para experimentos em física');

-- Inserindo dados na tabela de Agendamento de Manutenção
INSERT INTO agenda_manutencao (id_maquina, data_agendada, descricao, status) VALUES
(1, '2024-01-10', 'Revisão preventiva completa', 'pendente'),
(2, '2024-02-15', 'Verificação de temperatura e desempenho', 'pendente');

DESCRIBE usuarios;

ALTER TABLE usuarios MODIFY perfil VARCHAR(255);

SELECT * FROM usuarios WHERE id_usuario IN (1, 2, 3);
SELECT id_usuario FROM usuarios;

INSERT INTO usuarios (nome, email, nome_usuario, senha, perfil) VALUES ('Douglas Vieira', 'douglascanal1998@gmail.com', 'dunga', '1234', 'tecnico');
INSERT INTO usuarios (id_usuario, nome) VALUES (2,'eder de rosso', 'eder.rosso@ulbra.br' );
INSERT INTO usuarios (id_usuario, nome) VALUES (3,'jeferson', 'jeferson@ulbra.br' );

SELECT * FROM usuarios WHERE id_usuario IN (1, 2, 3);

-- Inserindo peças usadas em uma manutenção
INSERT INTO pecas_manutencao (id_manutencao, id_peca, quantidade_usada) 
VALUES 
(1, 2, 5),  -- 5 peças com id_peca = 2 usadas na manutenção com id_manutencao = 1
(2, 3, 2),  -- 2 peças com id_peca = 3 usadas na manutenção com id_manutencao = 2
(3, 1, 3);  -- 3 peças com id_peca = 1 usadas na manutenção com id_manutencao = 3


## modelo conceitual 

![modeloconceitual](https://github.com/user-attachments/assets/d8c36d5f-887e-497b-ae9f-98337cee6f95)


## modelo logico 
![modeloLogico](https://github.com/user-attachments/assets/22a05eb8-2519-4084-918b-d9402a3a581a)













