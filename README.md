Este é um projeto desenvolvido em Java com a versão JDK 21, utilizando o NetBeans 23 como IDE e o MySQL como banco de dados. O sistema é voltado para o gerenciamento de alunos e suas respectivas turmas, permitindo um controle eficiente através de tabelas inter-relacionadas.

Funcionalidades
- Gerenciamento de alunos: cadastro, listagem e exclusão.
- Gerenciamento de turmas: cadastro, listagem e exclusão.
- Associação de alunos a turmas e controle relacional entre eles.
- Banco de dados com suporte a atualizações e exclusões em cascata.

Pré-requisitos
- Java JDK 21 instalado no sistema.
- NetBeans 23 para abrir e executar o projeto.
- Servidor MySQL rodando localmente com permissões para criar bancos de dados.
- Biblioteca MySQL Connector/J (JAR) adicionada ao projeto para integração com o banco de dados. (Confira se está presente em: LIBRARIES. Caso não, baixe o JAR no site: https://dev.mysql.com/downloads/connector/j/ e adcione a Libraries)

Configuração do Banco de Dados:
Crie o banco de dados local utilizando o script abaixo no seu servidor MySQL:

USE escola;

CREATE TABLE aluno (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) UNIQUE,
    data_nasc DATE,
    idade INT,
    renda DECIMAL(6,2)
);

CREATE TABLE turma (
    id INT AUTO_INCREMENT PRIMARY KEY,
    descricao VARCHAR(100) UNIQUE
);

CREATE TABLE turma_aluno (
    fk_aluno INT,
    fk_turma INT,
    FOREIGN KEY (fk_aluno) REFERENCES aluno(id) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (fk_turma) REFERENCES turma(id) ON DELETE CASCADE ON UPDATE CASCADE
);

- Atualize as configurações de conexão no arquivo ConnectionFactory do projeto:
- Abra o arquivo ConnectionFactory.java.
- Substitua as configurações pelos dados do seu servidor MySQL

Como Executar:

- Clone ou baixe este repositório.
- Abra o projeto no NetBeans.
- Confirme que as bibliotecas necessárias (como o MySQL Connector/J) estão adicionadas ao projeto.
- Configure o arquivo ConnectionFactory.java conforme as instruções acima.
- Execute o projeto pelo NetBeans.

Estrutura do Projeto:

Modelo:
- Aluno: Representa os alunos no sistema.
- Turma: Representa as turmas no sistema.
- TurmaAluno: Associa alunos às turmas.

Banco de Dados:
- Script de criação das tabelas com relações e cascatas configuradas.

Conexão:
- Classe ConnectionFactory para gerenciar a comunicação com o banco de dados.

Recomendações:
- Utilize o MySQL Workbench para gerenciar o banco de dados.
- Mantenha as dependências do projeto atualizadas.
- Em caso de erro de conexão, verifique as configurações no ConnectionFactory e os serviços MySQL locais.

Projeto adaptado com base no trabalho: CRUD Java utilizando NetBeans, do professor Mário Jesus.
