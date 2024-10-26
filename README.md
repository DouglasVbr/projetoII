## Gerenciador de Hardware para Laboratórios

## Participantes

| [<img src="https://avatars.githubusercontent.com/u/130025057?s=400&u=f96f391fe5b875750f59ae9e4f601eaed19b9a33&v=4" width="75px"/>](https://github.com/DouglasVbr ) |
| :------------------------------------------------------------------------------------------------------------------------: |


| [Douglas Vieira](https://github.com/DouglasVbr) 

## diagrama conceitual 
![conceitualdiagrama](https://github.com/user-attachments/assets/660b8f12-a5df-4b02-8baa-8b5bb02b4102)
## Introdução
O Gerenciador de Hardware para Laboratórios é um sistema desenvolvido em Java que permite o controle e monitoramento de máquinas, consertos, peças trocadas e inventário de componentes em laboratórios de informática. O projeto visa facilitar a gestão de manutenções, controle de peças e acompanhamento do estado das máquinas.

## Objetivo
O objetivo deste projeto é criar um sistema que:

Gerencie o cadastro de máquinas e seus status.
Controle manutenções e trocas de peças.
Monitore o inventário de peças de hardware.
Forneça relatórios de atividades e manutenções realizadas.
## Funcionalidades
### Cadastro de Máquinas
Cadastro de especificações de hardware (CPU, RAM, armazenamento).
Associação de máquinas a laboratórios específicos.
Exibição do status das máquinas (funcionando, em manutenção, fora de uso).
### Controle de Consertos e Manutenções
Registro de manutenções corretivas e preventivas.
Associação de peças a manutenções específicas.
Histórico de todas as manutenções realizadas.
Agendamento de manutenções preventivas.
### Controle de Peças e Inventário
Cadastro de peças de hardware no inventário.
Registro de peças utilizadas em consertos.
Alertas de baixa quantidade de peças no estoque.
### Relatórios e Auditorias
Geração de relatórios de consertos e manutenções.
Relatórios sobre o uso e troca de peças.
Exportação de relatórios em PDF e Excel.
### Gerenciamento de Laboratórios
Gerenciamento de múltiplos laboratórios.
Painel geral com status das máquinas em todos os laboratórios.
## Controle de Acesso e Usuários
Perfis de usuário com diferentes níveis de acesso.
Logs de ações realizadas pelos usuários.
## Requisitos Funcionais
RF-01: Cadastro de máquinas.
RF-02: Associação de máquinas a laboratórios.
RF-03: Exibição de status de máquinas.
RF-04: Registro de manutenções.
RF-05: Associação de peças a consertos.
RF-06: Histórico de manutenções.
RF-07: Agendamento de manutenções.
RF-08: Cadastro de peças no inventário.
RF-09: Registro de peças retiradas.
RF-10: Alertas de baixa quantidade.
RF-11: Gerenciamento de laboratórios.
RF-12: Painel geral de status.
RF-13: Geração de relatórios de consertos.
RF-14: Relatórios sobre uso de peças.
RF-15: Exportação de relatórios.
RF-16: Perfis de usuário.
RF-17: Logs de ações.
## Requisitos Não Funcionais
RNF-01: Suporte para até 1000 máquinas e peças.
RNF-02: Interface intuitiva.
RNF-03: Backup automático dos dados a cada 24 horas.
RNF-04: Multiplataforma (Windows, Linux, macOS).
RNF-05: Autenticação de usuários.
RNF-06: Registro de ações para auditoria.
## Tecnologias Utilizadas
Java: Para a implementação da lógica de negócio.
JavaFX ou Swing: Para a interface gráfica.
MySQL: Para armazenamento de dados.
JDBC: Para conexão com o banco de dados.
JFreeChart: Para exibição de gráficos de desempenho.
JOptionPane: Para interações simples com o usuário.
## Estrutura do Projeto
src/model: Classes de modelo (DTOs).
src/dao: Classes de acesso a dados (DAOs).
src/view: Classes responsáveis pela interface gráfica.
src/controller: Controle da lógica de negócios.
resources: Arquivos de configuração e scripts SQL.
## docs: Documentação do projeto, incluindo levantamentos de requisitos.
