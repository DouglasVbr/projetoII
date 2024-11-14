### Gerenciador de Hardware para Laboratórios
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
