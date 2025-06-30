# Usar uma imagem base oficial do OpenJDK com a versão 17
FROM openjdk:17-jdk-slim

# Definir o diretório de trabalho dentro do container
WORKDIR /app

# Copiar o arquivo JAR da aplicação para o container
# O comando `mvn clean package` deve ser executado ANTES de construir a imagem Docker
# para garantir que o arquivo JAR esteja disponível no diretório `target/`
COPY target/*.jar app.jar

# Expor a porta que a aplicação Spring Boot irá usar
EXPOSE 8080

# Comando para executar a aplicação quando o container iniciar
ENTRYPOINT ["java", "-jar", "app.jar"]