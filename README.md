# Server Status Checker - Documentação
Visão Geral

O Server Status Checker é um sistema de back-end desenvolvido em Java com o framework Spring Boot para rastrear o status de vários servidores. Esta aplicação fornece uma maneira eficiente de monitorar e gerenciar o status dos servidores em sua rede.
Funcionalidades

    Registro e gerenciamento de servidores.
    Verificação do status dos servidores.
    Alertas de status.

Requisitos

Certifique-se de que você possui os seguintes requisitos instalados em sua máquina antes de executar a aplicação:

    Java Development Kit (JDK) 8 ou superior
    MySQL Server
    Maven
    Spring Boot
    Dependências definidas no arquivo pom.xml

Configuração

1- Clone o repositório da aplicação a partir do GitHub.

```
  git clone https://github.com/SamuelBatis/server-status.git
```
2. Crie um banco de dados MySQL e defina as credenciais no arquivo `application.yml`:

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/seu_banco_de_dados
    username: seu_usuario
    password: sua_senha
```


3- Execute o aplicativo Spring Boot.
```
  mvn spring-boot:run
```


## API Endpoints

A seguir, estão listados os endpoints disponíveis nesta aplicação:

### Listar Servidores
- **Método:** GET
- **Endpoint:** /list
- **Descrição:** Retorna uma lista de servidores.
- **Exemplo:** `http://localhost:8080/list`

### Verificar Status do Servidor
- **Método:** GET
- **Endpoint:** /ping/{ipAddress}
- **Descrição:** Verifica o status de um servidor com o endereço IP especificado.
- **Exemplo:** `http://localhost:8080/ping/192.168.1.1`

### Salvar Servidor
- **Método:** POST
- **Endpoint:** /save
- **Descrição:** Cria um novo servidor com os detalhes fornecidos no corpo da requisição.
- **Exemplo:** `http://localhost:8080/save`

### Obter Servidor por ID
- **Método:** GET
- **Endpoint:** /get/{id}
- **Descrição:** Obtém informações sobre um servidor específico com base no ID.
- **Exemplo:** `http://localhost:8080/get/1`

### Deletar Servidor por ID
- **Método:** DELETE
- **Endpoint:** /delete/{id}
- **Descrição:** Remove um servidor com base no ID especificado.
- **Exemplo:** `http://localhost:8080/delete/1`

### Obter Imagem do Servidor
- **Método:** GET
- **Endpoint:** /image/{fileName}
- **Descrição:** Retorna a imagem associada a um servidor com o nome de arquivo especificado.
- **Exemplo:** `http://localhost:8080/image/server_image.png`







