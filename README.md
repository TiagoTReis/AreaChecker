# 📐 AreaChecker

**AreaChecker** é um projeto Java desenvolvido como parte da disciplina de Linguagem de Programação II (LP II). O objetivo principal do projeto é possibilitar a conferência de cálculos de área de diversas figuras geométricas através de um ponto central de acesso: a fábrica de formas `ShapeFactoryImpl`.

## ✏️ Objetivo

Criar uma solução em Java que permita calcular a área das seguintes figuras geométricas:

- Quadrado
- Retângulo
- Círculo
- Triângulo
- Paralelogramo
- Trapézio
- Hexágono
- Losango
- Cubo (área total)

A aplicação segue princípios de boa organização em pacotes, uso de interfaces, enums e polimorfismo, reforçando boas práticas de desenvolvimento Java.

---

## 🧱 Estrutura do Projeto

A estrutura do projeto é organizada em pacotes com visibilidade controlada, onde o acesso externo se dá apenas pela classe `ShapeFactoryImpl`.

### Interfaces e Enums

- **Calculable**: Interface que define o método `double calcularArea();`, implementado por todas as figuras.
- **ShapeType**: Enum com os tipos de figuras disponíveis para cálculo.

### Factory

- **ShapeFactoryImpl**: Classe que centraliza a criação e o acesso às figuras geométricas. É o único ponto de acesso externo às figuras.

### Figuras Geométricas (implementam `Calculable`)

- Quadrado
- Retângulo
- Círculo
- Triângulo
- Paralelogramo
- Trapézio
- Hexágono
- Losango
- Cubo

> ✅ *Observação: Não são utilizados getters e setters nas classes de figuras geométricas, conforme especificado.*

---

## 🧪 Testes

Os testes são realizados através da classe `Main`, contendo pelo menos um cenário de teste para cada figura. Eles demonstram o uso da `ShapeFactoryImpl` para criação e cálculo da área das figuras.

---

## 🛠️ Tecnologias Utilizadas

- Java 11+ (ou versão definida pela disciplina)
- IDE de sua escolha (Eclipse, IntelliJ, NetBeans, etc.)

---

## 🚀 Como Executar

1. Clone este repositório:
   ```bash
   https://github.com/TiagoTReis/AreaChecker.git

---

## 🧠 Conceitos Aplicados

- **Polimorfismo**: Utilizado para tratar diferentes figuras geométricas de forma genérica através da interface `Calculable`.
- **Encapsulamento**: Cada figura é responsável por encapsular seus próprios dados e lógica de cálculo da área.
- **Uso de interfaces**: A interface `Calculable` define o contrato que todas as figuras devem seguir.
- **Organização por pacotes**: O projeto está estruturado em pacotes específicos para fábrica, modelos, enums e interfaces.
- **Enumerações (Enums)**: O `ShapeType` enum define os tipos de figuras disponíveis na aplicação.
- **Padrão Fábrica (Factory Pattern)**: A classe `ShapeFactoryImpl` centraliza a criação dos objetos, seguindo o padrão de projeto Fábrica.





