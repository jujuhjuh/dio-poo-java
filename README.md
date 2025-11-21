## 🟣 README.md — Desafio POO com Java (DIO)

## 📘 Desafio: Programação Orientada a Objetos (POO) com Java

Este repositório contém a implementação do desafio de Programação Orientada a Objetos (POO) da formação Java da Digital Innovation One (DIO).
O objetivo é aplicar os quatro pilares da orientação a objetos:

* Abstração

* Encapsulamento

* Herança

* Polimorfismo


O projeto simula um pequeno sistema educacional com entidades básicas: Pessoa, Aluno, Professor e Curso.




## Objetivos do Desafio

✔ Entender como modelar classes e objetos no Java
✔ Usar corretamente herança e polimorfismo
✔ Criar uma estrutura simples, mas funcional
✔ Organizar o código de forma clara e escalável
✔ Praticar conceitos fundamentais da OOP na prática




## 🧩 Estrutura do Projeto

/
├── src/
│   ├── Main.java
│   ├── Pessoa.java
│   ├── Aluno.java
│   ├── Professor.java
│   └── Curso.java
└── README.md




## 🏛 Descrição das Classes


* Pessoa (Classe Base)

Representa uma pessoa genérica do sistema.
Possui:

nome

idade


Serve como base para outras classes.



* Aluno (Herda de Pessoa)

Representa um estudante matriculado.
Possui:

matrícula

curso associado


Demonstra herança + especialização.



* Professor (Herda de Pessoa)

Representa o professor responsável pelo curso.
Possui:

área de atuação


Demonstra polimorfismo ao sobrescrever métodos.



* Curso

Representa um curso simples.
Possui:

nome

carga horária

professor responsável


Mostra composição entre classes.



## ▶️ Como Executar

* 1. Compile os arquivos:

javac src/*.java


* 2. Execute o programa:

java src.Main



## 🧪 Exemplos de Saída

  O programa imprime informações formatadas sobre:

* professor

* aluno

* curso


Tudo instanciado através da estrutura orientada a objetos.




## 🏁 Conclusão

Este desafio ajuda a fixar os conceitos essenciais de POO, ao mesmo tempo em que prepara o aluno para projetos maiores e mais completos.
É uma base sólida para continuar estudando e aplicando Java no mundo real!
