# API para gerenciar tarefas.

Este projeto é uma aplicação backend para gerenciamento de tarefas, desenvolvida com Spring Boot e MongoDB, utilizando programação reativa com Spring WebFlux, integração com AWS (S3 e Lambda), e containerização com Docker.

## Funcionalidades

- Criar uma nova tarefa.
- Listar todas as tarefas.
- Atualizar uma tarefa existente.
- Deletar uma tarefa.
- Buscar tarefas por status (concluída/não concluída).
- Upload de arquivos relacionados às tarefas no AWS S3.
- Processamento de eventos via AWS Lambda ao criar uma nova tarefa.

## Tecnologias Utilizadas

- **Java 17** (ou versão mais recente)
- **Spring Boot 3.3.3**
- **MongoDB** (Banco de dados NoSQL)
- **Spring WebFlux** (Programação Reativa)
- **AWS S3** (Armazenamento de Arquivos)
- **AWS Lambda** (Processamento de Eventos)
- **Docker** (Containerização)
- **Swagger** (Documentação da API)

## Pré-requisitos

Antes de iniciar, você precisará ter as seguintes ferramentas instaladas:

- **JDK 17** ou versão superior
- **Maven** (para gerenciar as dependências)
- **Docker** e **Docker Compose**
- **AWS CLI** configurado com credenciais válidas
- **MongoDB** rodando localmente ou configurado no Docker

## Configuração do Projeto

Incluir os dados AWS - S3 - Lambda em src/main/resources/application.properties 

    .yaml

    aws.access.key.id= CHAVE-ID-AWS
    aws.secret.access.key= CHAVE-SECRETA-AWS
    aws.region= REGIÃO-AWS
    aws.s3.bucket.name= BUCKET-AWS

## Construção e Execução do Projeto

Para rodar a aplicação e o MongoDB com Docker, utilize o docker-compose :

    .bash
    
    docker-compose up --build

## Endpoints da API

Abaixo estão listados os principais endpoints da API.

## Criar Nova Tarefa

    .http
    
    POST /tasks

Exemplo para o body:

    .json
    
    {
      "title": "Nova tarefa",
      "description": "Descrição da tarefa",
      "status": "NOT_COMPLETED"
    }
## Listar Todas as Tarefas
    .http
    
    GET /tasks

## Atualizar uma Tarefa
    .http
    
    PUT /tasks/{id}

## Deletar uma Tarefa
    .http
    
    DELETE /tasks/{id}

## Buscar Tarefas por Status
    .http
    
    GET /tasks?status=COMPLETED

## Integração com AWS

A aplicação está integrada com o AWS S3 para armazenamento de arquivos relacionados a tarefas e com o AWS Lambda para processar eventos quando uma nova tarefa é criada.

Certifique-se de configurar suas credenciais no arquivo application.yml conforme mencionado na seção Configuração do AWS S3 e Lambda.

## Executar Testes
    .bash
    
    mvn test

## Versionamento

Este projeto utiliza o Git para versionamento. Para acessar o repositório público, visite o link do repositório GitHub.

## Contribuição

Sinta-se à vontade para fazer um fork deste repositório e enviar pull requests.

## Licença
    .javascript
    
    Esse `README.md` fornece uma visão geral da configuração do projeto, instruções para execução, e documentação dos principais endpoints da API, além de abordar o uso de Docker, AWS e Swagger.




