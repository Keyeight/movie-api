# Escolhemos qual imagem vamos querer baixar e usar no nosso container
FROM eclipse-temurin:17-jdk-jammy

# Criamos um caminho onde iremos trabalhar e utilizar dentro do container
WORKDIR app

# tag RUN serve para executar comandos dentro do container
RUN apt-get update && apt-get -y upgrade

# copia arquivos ou pastas para o diretorio de trabalho (app)
COPY pom.xml mvnw ./

COPY .mvn .mvn

COPY src ./src

RUN ./mvnw package

# expoe uma porta do container para fora dele 8080:8080
EXPOSE 8080

# comando a ser executado sempre que o container iniciar
ENTRYPOINT ["./mvnw", "spring-boot:run"]