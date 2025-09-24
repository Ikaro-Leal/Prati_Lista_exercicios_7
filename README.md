# Atividade 7 - Conceitos de Programação Orientada a Objetos em Java

Este repositório contém a resolução da Lista de Exercícios 7 do curso de Desenvolvimento Front-end, ministrado pelo Professor Jaques Antunes no programa +PraTi & Codifica.

O projeto consiste na implementação de 8 exercícios práticos em **Java**, cobrindo conceitos fundamentais e avançados de Programação Orientada a Objetos (POO). O objetivo é aplicar a teoria de POO para construir um código robusto, flexível e reutilizável.

---

### Tecnologias Utilizadas

- **Java**: Linguagem principal para toda a lógica do projeto (Azul Zulu JDK 21).
- **IntelliJ IDEA**: Ambiente de Desenvolvimento Integrado (IDE) utilizado para a codificação e execução.
- **Git & GitHub**: Para versionamento de código e hospedagem do repositório.

---

### Conceitos de Programação Orientada a Objetos Abordados

Cada exercício foi projetado para focar em um pilar ou padrão de design específico de POO:

- **Questão 1: Encapsulamento**
    - Implementação da classe `Produto` com atributos privados, validações em getters/setters e lançamento de exceções.

- **Questão 2: Regras de Negócio**
    - Extensão da classe `Produto` com o método `aplicarDesconto`, aplicando validação de regras de negócio.

- **Questão 3: Herança e Polimorfismo**
    - Criação da hierarquia de classes `Funcionario`, `Gerente` e `Desenvolvedor`, com sobrescrita de métodos (`calcularBonus`).

- **Questão 4: Interfaces**
    - Definição do contrato `IMeioTransporte` e sua implementação polimórfica pelas classes `Carro`, `Bicicleta` e `Trem`.

- **Questão 5: Abstração**
    - Uso de classe abstrata `FormaPagamento` para definir um modelo de processo (Template Method), com implementações concretas como `CartaoCredito`, `Boleto` e `Pix`.

- **Questão 6: Imutabilidade e Objetos de Valor**
    - Modelagem de um `Carrinho` de compras imutável, onde operações de modificação retornam novas instâncias. Criação do Objeto de Valor `Dinheiro`.

- **Questão 7: Generics**
    - Implementação de um `InMemoryRepository<T, ID>` genérico para criar uma camada de acesso a dados reutilizável e com segurança de tipos.

- **Questão 8: Padrão de Design (Strategy)**
    - Aplicação do padrão Strategy para o cálculo de frete, permitindo a troca de algoritmos (`Sedex`, `Pac`) em tempo de execução, incluindo o uso de uma estratégia via Lambda.

---

### Estrutura do Projeto

O projeto é uma aplicação Java simples, contida em um único módulo. Todos os arquivos-fonte estão localizados no diretório `src`.

```
/Prati_Lista_exercicios_7/
├── src/
│   ├── Main.java                 # Ponto de entrada, contém a execução dos testes
│   ├── Produto.java
│   ├── Funcionario.java
│   ├── Gerente.java
│   └── ... (demais arquivos .java)
└── README.md                     # Este arquivo
```


O arquivo `Main.java` serve como o ponto de entrada da aplicação e contém o código de demonstração para todas as 8 questões. Para manter o foco, o código das questões anteriores foi comentado à medida que novas questões eram resolvidas.

---

### Como Executar o Projeto

#### Pré-requisitos
* **Java Development Kit (JDK)**: Versão 21 ou superior.
* **IntelliJ IDEA**: Community ou Ultimate Edition.
* **Git**: Para clonar o repositório.

#### Passos
1.  **Clone o Repositório**
    ```bash
    git clone [https://github.com/Ikaro-Leal/Prati_Lista_exercicios_7.git](https://github.com/Ikaro-Leal/Prati_Lista_exercicios_7.git)
    ```
    *Substitua a URL se necessário.*

2.  **Abra o Projeto no IntelliJ IDEA**
    - No IntelliJ, vá em `File` > `Open...` e selecione a pasta do projeto clonado.
    - A IDE irá detectar e configurar o projeto automaticamente.

3.  **Execute a Aplicação**
    - Navegue até o arquivo `src/Main.java`.
    - Clique com o botão direito no arquivo e selecione a opção **"Run 'Main.main()'"**.
    - A saída da última questão implementada será exibida no console "Run" na parte inferior da IDE.

### Autor
- **Ikaro França Leal** - Professor, **Jaques Antunes**
- Projeto desenvolvido como parte do curso +PraTI e Codifica.

### Links
- Repositório no GitHub: https://github.com/Ikaro-Leal/Prati_Lista_exercicios_7