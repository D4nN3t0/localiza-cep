# 📍 Localiza CEP

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![API REST](https://img.shields.io/badge/API-REST-0088CC?style=for-the-badge)
![JSON](https://img.shields.io/badge/JSON-000000?style=for-the-badge&logo=json&logoColor=white)
![Status](https://img.shields.io/badge/status-ativo-brightgreen?style=for-the-badge)

Projeto em Java para consulta de endereço a partir de um CEP, utilizando consumo de API externa.

A aplicação realiza uma requisição HTTP, trata a resposta em JSON e exibe as informações do endereço no terminal.

---

## 🚀 Funcionalidades

- Consulta de endereço via CEP
- Consumo de API pública (ex: ViaCEP)
- Conversão de JSON para objetos Java
- Exibição dos dados no terminal

---

## 🛠️ Tecnologias utilizadas

- Java
- API REST
- JSON
- HttpClient
- Gson

---
## 🏗️ Estrutura do Projeto

O código foi dividido em pacotes isolando as regras de domínio da camada de execução do aplicativo:

```
src/
├── app/
│ └── Main.java
| └── Menu.java
├── exception/
│ └── CepInvalidoException.java
├── model/
│ └── Endereco.java
├── service/
│ └── ConsumoApi.java
├── util/
│ └── GeradorDeArquivo.java
```
---

## 🚀 Como Executar o Projeto
Pré-requisitos
- Java JDK instalado (versão 17 ou superior recomendada).
- Uma IDE de sua preferência (o desenvolvimento deste projeto utilizou o IntelliJ IDEA).

---

### Passos para rodar
1. Clone este repositório na sua máquina local:
   ```bash
   git clone [https://github.com/SEU-USUARIO/localiza-cep.git](https://github.com/SEU-USUARIO/localiza-cep.git)
   ```
2. Abra o projeto em sua IDE.
3. Navegue até o arquivo src/br/com/daniel/localizacep/app/Main.java.
4. Execute o método main.

📌 Exemplo de uso
``` bash
Digite o CEP:
01001000

Resultado:
Logradouro: Praça da Sé
Bairro: Sé
Cidade: São Paulo
UF: SP
```

*desenvolvido com ☕ por [Daniel Avelino](https://github.com/D4nN3t0) durante a formação Java na Alura.*
