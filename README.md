# Projeto Webservice

  Esse projeto é o back-end de uma aplicação onde é possível guardar informações de pedidos dos clientes. É possível criar novos clientes, deletar, atualizar
  e recuperar informações sobre cada um.
  
  - Endpoints da aplicação:
  ```
  http://localhost:8080/users
  http://localhost:8080/products
  http://localhost:8080/orders
  http://localhost:8080/categories
  ```
  ### Ferramentas utilizadas
    - Java
    - Spring Boot
    - JPA
    - Hibernate
    - Banco de dados H2 em memória
    
**PS:** *É feita uma carga no banco de dados com informações sempre que a aplicação é iniciada.*
#### Tabelas criadas no banco de dados H2

![h2db](https://user-images.githubusercontent.com/60411725/98855807-63256e80-243b-11eb-947c-84b07d3c655e.jpg)


#### Exemplo de resposta no Postman

 - Essa mensagem é uma exceção tratada que ocorre quando tenta acessar um usuário que não existe.
![postman](https://user-images.githubusercontent.com/60411725/98855674-26f20e00-243b-11eb-8a88-d7db974e5354.jpg)

#### Resposta em Json no Postman no endpoint http://localhost:8080/orders/1

```json
{
    "id": 1,
    "moment": "2019-06-20T19:53:07Z",
    "orderStatus": "PAID",
    "client": {
        "id": 1,
        "name": "Maria Brown",
        "email": "maria@gmail.com",
        "phone": "98888888",
        "password": "123456"
    },
    "items": [
        {
            "quantity": 2,
            "price": 90.5,
            "product": {
                "id": 1,
                "name": "The Lord of the Rings",
                "description": "Lorem ipsum dolor sit amet, consectetur.",
                "price": 90.5,
                "imgUrl": "",
                "categories": [
                    {
                        "id": 2,
                        "name": "Books"
                    }
                ]
            },
            "subtotal": 181.0
        },
        {
            "quantity": 1,
            "price": 1250.0,
            "product": {
                "id": 3,
                "name": "Macbook Pro",
                "description": "Lorem ipsum dolor sit amet, consectetur.",
                "price": 1250.0,
                "imgUrl": "",
                "categories": [
                    {
                        "id": 3,
                        "name": "Computers"
                    }
                ]
            },
            "subtotal": 1250.0
        }
    ],
    "payment": {
        "id": 1,
        "moment": "2019-06-20T21:53:07Z"
    },
    "total": 1431.0
}
```
