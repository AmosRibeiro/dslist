# DSList - Lista de jogos - API Java Spring Boot 
## Sobre o projeto

DSList é uma aplicação back end web desenvolvida durante o **Intensivão Java Spring**, evento distribuido pela [DevSuperior](https://devsuperior.com.br).

A API lista jogos por meio de seus atributos como: gênero, nome, plataforma e etc. Possui uma função interessante com uma lista dinâmica em que você pode mover e trocar os jogos de posição.


# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven

## Implantação em teste
- Teste das requisições API: Postman
- Banco de dados: H2

### Requisições GET Postman:
```bash
http://localhost:8080/games
```
```bash
http://localhost:8080/lists
```
```bash
http://localhost:8080/lists/2/games
```
```bash
http://localhost:8080/games/1
```
### Requisição POST Postman:
```bash
http://localhost:8080/lists/2/replacement
```

![Postman 1](https://github.com/AmosRibeiro/dslist/blob/main/images/postman1.png)

![Postman 2](https://github.com/AmosRibeiro/dslist/blob/main/images/postman2.png)

![Postman 3](https://github.com/AmosRibeiro/dslist/blob/main/images/postman3.png)

![Postman 4](https://github.com/AmosRibeiro/dslist/blob/main/images/postman4.png)

![Postman 5](https://github.com/AmosRibeiro/dslist/blob/main/images/postman5.png)

# Como executar o projeto

## Back end
Pré-requisitos: 

Java 21 [Baixar](https://www.oracle.com/br/java/technologies/downloads/#java21)

IDEA Com Maven instalada Ex: IntelliJ [Baixar](https://www.jetbrains.com/idea/download/?section=windows)


## Instruções
 Clone o repositório no local desejado:
```bash
git clone https://github.com/AmosRibeiro/dslist.git
```
 Abra o projeto na sua IDEA e na ferramenta Maven rode o comando:
```bash
mvn package
```
 Entrar na pasta do projeto e executar o comando:
```bash
java -jar ./target/dslist-0.0.1-SNAPSHOT.jar
```

# Autor

Amós Ribeiro

[Linkedin](https://www.linkedin.com/in/amosribeiro1202/)
 
