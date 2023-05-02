# crud-spring

Projeto feito para testar conhecimentos sobre persistência de dados usando as seguintes tecnologias:

Linguagem de programação: JAVA
Banco de Dados: PostgreSQL
Testes: Postman
Frameworks: Springboot
Gerenciador de dependências: Maven

Foi desenvolvido as quatro operações SELECT, DELETE, UPDATE e CREATE.

O projeto foi desenvoldido com a seguinte estrutura de pacotes

Controller: Contém o(s) endpoint(s)
DAO: Contém a(s) interface(s) que extende a classe CrudRepository com os métodos para fazer a persistência de dados. 
DTO: Contém a(s) classe(s) que implementa os métodos estabelecidos na classe presente no pacote Services, em conjunto com a classe do pacote DAO.
Model: Pacote que contém a classe Produto (Exemplo utilizado para desenvolvimento), contendo informações dos objetos a serem persistidos no banco
Services: Contém a(s) interface(s) com os métodos a serem implementados na(s) classe(s) do pacote DTO.


![image](https://user-images.githubusercontent.com/101127069/235787644-77657244-8c0a-4265-b270-51edbeecd4b5.png)
