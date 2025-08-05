# Projeto Aluguel de Veículos - POO em Java

## Descrição
Este projeto tem como objetivo praticar os conceitos fundamentais da Programação Orientada a Objetos (POO) utilizando a linguagem Java, aplicados em um sistema simples de aluguel de veículos.

No projeto, é feita a modelagem de veículos com diferentes categorias e cálculo do valor total do aluguel, explorando os pilares da POO: abstração, encapsulamento, herança e polimorfismo.

## Tecnologias Utilizadas
- Java 17
- IDE IntelliJ IDEA

## Estrutura do Projeto
- **Classe abstrata `Veiculo`**: representa o conceito geral de um veículo, com atributos comuns a todas as categorias e método abstrato para cálculo do valor do aluguel.
- **Classes concretas (`Picape`, `Sedan`, `SUV` etc.)**: estendem `Veiculo` e implementam o cálculo específico do valor.
- **Classe `Programa`**: contém o método `main` para interação com o usuário e execução do sistema.

## Conceitos de POO Aplicados

### 1. Abstração
A classe abstrata `Veiculo` define os atributos essenciais e o comportamento abstrato `calculoValoe()` que será implementado nas subclasses, abstraindo as características comuns dos veículos.

### 2. Encapsulamento
Todos os atributos da classe `Veiculo` são privados e acessados via métodos getters e setters, garantindo proteção dos dados e controle de acesso.

### 3. Herança
As subclasses, como `Picape`, herdam os atributos e métodos de `Veiculo`, especializando o comportamento (implementação do método abstrato).

### 4. Polimorfismo
O sistema utiliza referências do tipo `Veiculo` para manipular objetos das subclasses (como `Picape`), permitindo chamar métodos implementados nas classes concretas de forma genérica.

---
