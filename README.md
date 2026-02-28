# Desafio Consulta Vendas

Projeto desenvolvido como desafio da **Formação Java Spring Professional** da [DevSuperior](https://devsuperior.com.br), no capítulo de JPA, consultas SQL e JPQL.

## Sobre o projeto

Trata-se de um sistema de vendas (**Sale**) e vendedores (**Seller**). Cada venda pertence a um vendedor, e um vendedor pode ter várias vendas.

### Modelo de domínio

```
Sale                          Seller
-----------                   -----------
id : Long          *---1      id : Long
visited : Integer             name : String
deals : Integer               email : String
amount : Double               phone : String
date : LocalDate
```

## Funcionalidades implementadas

### 📊 Relatório de vendas
`GET /sales/report`

Retorna uma listagem **paginada** com id, data, quantia vendida e nome do vendedor.

**Parâmetros opcionais:**
| Parâmetro  | Tipo   | Descrição                                      |
|------------|--------|------------------------------------------------|
| `minDate`  | String | Data inicial (formato `yyyy-MM-dd`)            |
| `maxDate`  | String | Data final (formato `yyyy-MM-dd`)              |
| `name`     | String | Trecho do nome do vendedor (case insensitive)  |

**Regras:**
- Se `maxDate` não for informada, considera a data atual do sistema.
- Se `minDate` não for informada, considera 1 ano antes de `maxDate`.
- Se `name` não for informado, considera texto vazio (retorna todos).

**Exemplo de requisição:**
```
GET /sales/report?minDate=2022-05-01&maxDate=2022-05-31&name=odinson
```

---

### 📋 Sumário de vendas por vendedor
`GET /sales/summary`

Retorna uma listagem com o nome do vendedor e a soma total de suas vendas no período.

**Parâmetros opcionais:**
| Parâmetro | Tipo   | Descrição                           |
|-----------|--------|-------------------------------------|
| `minDate` | String | Data inicial (formato `yyyy-MM-dd`) |
| `maxDate` | String | Data final (formato `yyyy-MM-dd`)   |

**Regras:** as mesmas do Relatório de vendas.

**Exemplo de requisição:**
```
GET /sales/summary?minDate=2022-01-01&maxDate=2022-06-30
```

## Tecnologias utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- JPQL
- H2 Database
- Maven

## Como executar o projeto

### Pré-requisitos
- Java 17+
- Maven

### Passos

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/desafio-consulta-vendas

# Acesse a pasta do projeto
cd desafio-consulta-vendas

# Execute o projeto
./mvnw spring-boot:run
```

A aplicação estará disponível em `http://localhost:8080`.

> O banco de dados H2 já vem com dados de seed. Não é necessária nenhuma configuração adicional.

## Collection Postman

Importe a collection abaixo para testar os endpoints:

[https://www.getpostman.com/collections/dea7904f994cb87c3d12](https://www.getpostman.com/collections/dea7904f994cb87c3d12)

## Autor

Desenvolvido por **[Bruno da Silva Garbero](https://github.com/bgarbero)** como parte da Formação Java Spring Professional — [DevSuperior](https://devsuperior.com.br).
