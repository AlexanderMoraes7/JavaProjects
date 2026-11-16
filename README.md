# JavaProjects

Projetos de estudo em Java, desenvolvidos durante a **Trilha Java Básico** da [DIO](https://www.dio.me). Cada pasta é um desafio de um módulo da trilha e traz o enunciado original no seu próprio `README.md`.

## Projetos

| Pasta | Módulo | O que faz |
| ----- | ------ | --------- |
| [01_ContaBanco](01_ContaBanco) | Sintaxe | Recebe pelo terminal os dados de uma conta bancária (número, agência, nome do cliente e saldo) e exibe uma mensagem de boas-vindas com essas informações. |
| [02_DesafioControleFluxo](02_DesafioControleFluxo) | Controle de Fluxo | Lê dois números inteiros e imprime a contagem entre eles com um `for`. Se o primeiro for maior que o segundo, lança a exceção customizada `ParametrosInvalidosException`. |

## Como executar

É preciso ter o JDK instalado. Dentro da pasta do projeto, compile os arquivos de `src` e execute a classe principal. Exemplo com o desafio de Controle de Fluxo:

```bash
cd 02_DesafioControleFluxo
javac -encoding UTF-8 -d bin src/*.java
java -cp bin Contador
```

As classes principais são `ContaBanco` (em `01_ContaBanco`) e `Contador` (em `02_DesafioControleFluxo`).

Os projetos também abrem direto no VS Code com o *Extension Pack for Java*, pois cada pasta já tem o seu `.vscode/settings.json`.
