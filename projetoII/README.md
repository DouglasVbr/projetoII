Documento de Levantamento de Requisitos
Projeto: Gerenciador de Hardware para Laboratórios
Data: 25/10/2024
Responsável: Douglas Vieira

1. Introdução
1.1. Objetivo
Este documento tem como objetivo detalhar os requisitos funcionais e não funcionais do sistema "Gerenciador de Hardware para Laboratórios", que permitirá o controle e monitoramento de máquinas, consertos, peças trocadas e inventário de componentes em diversos laboratórios.

1.2. Escopo
O sistema gerenciará:

Cadastro e controle de máquinas de laboratórios.
Registro de manutenções, consertos e peças trocadas.
Monitoramento de inventário de peças.
Emissão de relatórios de atividades e manutenções.
1.3. Definições, Acrônimos e Abreviações
Máquina: Computadores e notebooks que fazem parte do laboratório (80 computadores distribuídos em 4 laboratórios e 20 notebooks).
Peça: Componentes de hardware como teclados, mouses, monitores, gabinetes e fontes de alimentação.
Conserto: Procedimentos de manutenção corretiva ou preventiva realizados em uma máquina.
Inventário: Controle de peças de hardware disponíveis e em uso nos laboratórios.
2. Requisitos Funcionais
2.1. Cadastro de Máquinas
RF-01: O sistema deve permitir o cadastro de máquinas, incluindo suas especificações de hardware (CPU, RAM, armazenamento).
RF-02: O sistema deve permitir a associação de cada máquina a um laboratório específico.
RF-03: O sistema deve exibir o status atual da máquina (funcionando, em manutenção, fora de uso).
2.2. Controle de Consertos e Manutenções
RF-04: O sistema deve permitir registrar manutenções corretivas e preventivas realizadas em uma máquina.
RF-05: O sistema deve permitir associar peças utilizadas no conserto à respectiva manutenção.
RF-06: O sistema deve armazenar um histórico completo de todas as manutenções realizadas em cada máquina.
RF-07: O sistema deve permitir a criação de agendamentos de manutenções preventivas para as máquinas.
2.3. Controle de Peças e Inventário
RF-08: O sistema deve permitir o cadastro de peças de hardware no inventário, incluindo informações como tipo, fabricante e quantidade em estoque.
RF-09: O sistema deve registrar as peças retiradas do estoque para serem utilizadas em consertos.
RF-10: O sistema deve emitir alertas quando uma peça estiver com baixa quantidade no estoque.
2.4. Gerenciamento de Laboratórios
RF-11: O sistema deve permitir gerenciar múltiplos laboratórios, associando máquinas e peças a seus respectivos locais.
RF-12: O sistema deve exibir um painel geral que mostre o status das máquinas em todos os laboratórios.
2.5. Relatórios e Auditorias
RF-13: O sistema deve gerar relatórios de consertos e manutenções realizados em um período definido.
RF-14: O sistema deve gerar relatórios sobre o uso e troca de peças ao longo do tempo.
RF-15: O sistema deve permitir a exportação de relatórios em formatos como PDF ou Excel.
2.6. Controle de Acesso e Usuários
RF-16: O sistema deve permitir a criação de perfis de usuário com diferentes níveis de acesso (técnicos, administradores).
RF-17: O sistema deve manter logs de todas as ações realizadas pelos usuários.
3. Requisitos Não Funcionais
3.1. Desempenho
RNF-01: O sistema deve ser capaz de processar e exibir informações de até 1000 máquinas e peças de hardware sem perda significativa de desempenho.
3.2. Usabilidade
RNF-02: O sistema deve possuir uma interface intuitiva, facilitando o registro de manutenções e o gerenciamento de inventário por técnicos.
3.3. Confiabilidade
RNF-03: O sistema deve manter backup automático dos dados cadastrados a cada 24 horas para garantir a integridade das informações.
3.4. Portabilidade
RNF-04: O sistema deve ser multiplataforma, funcionando em ambientes Windows, Linux e macOS.
3.5. Segurança
RNF-05: O sistema deve garantir o controle de acesso por meio de autenticação de usuário.
RNF-06: Todas as ações dos usuários devem ser registradas para auditoria futura.
4. Requisitos de Interface
4.1. Interface Gráfica
RI-01: O sistema deve ter uma interface gráfica baseada em JavaFX ou Swing.
RI-02: O sistema deve exibir gráficos de desempenho de máquinas e peças através de bibliotecas como JFreeChart.
4.2. Relatórios
RI-03: O sistema deve permitir a geração de relatórios em tempo real, com filtros de data, laboratório ou máquina específica.
5. Casos de Uso
Caso de Uso 01: Cadastro de Máquina
Ator Principal: Técnico
Fluxo Principal:

Técnico acessa a tela de cadastro de máquinas.
Técnico insere as especificações de hardware e seleciona o laboratório.
Técnico salva o cadastro e o sistema confirma a operação.
Caso de Uso 02: Registro de Manutenção
Ator Principal: Técnico
Fluxo Principal:

Técnico acessa a tela de manutenções.
Técnico seleciona a máquina e insere as informações da manutenção.
Técnico associa as peças utilizadas e salva o registro.
O sistema armazena o histórico e atualiza o status da máquina.
Caso de Uso 03: Consulta de Relatório
Ator Principal: Administrador
Fluxo Principal:

Administrador acessa a tela de relatórios.
Administrador seleciona o tipo de relatório e define o período.
O sistema gera o relatório e o exibe na tela.
Administrador pode exportar o relatório em PDF ou Excel.
6. Considerações Finais
Este documento de levantamento de requisitos tem como objetivo servir como guia para o desenvolvimento do projeto Gerenciador de Hardware para Laboratórios. O documento poderá ser atualizado conforme novas necessidades ou mudanças forem identificadas ao longo do desenvolvimento.