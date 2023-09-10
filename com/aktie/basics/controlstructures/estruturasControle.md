# Estruturas de Controle🇧🇷

## Overview

De maneira simples, um programa é uma lista de instruções. Controles de instrução são blocos onde o programa pode mudar seu caminho.

Utilizamos essas estruturas para escolher entre dois ou mais caminhos. Existem três tipos em Java:
`if/else/else if`, operador ternário e switch.

---

## IF/ELSE

A declaração `if/else` é a estrutura de controle mais básica. Também pode ser considerada a própria base da tomada de decisão na programação.

Enquanto o `if` pode ser usado sozinho, o uso mais comum é utilizando dois caminhos com `if/else`.

Exemple:

```java
if (count > 2) {
    System.out.println("Count is higher than 2");
} else {
    System.out.println("Count is lower or equal than 2");
}
```

Teoricamente, podemos encadear ou aninhar blocos if/else infinitamente, mas isso prejudicará a legibilidade do código e é por isso que não é recomendado.

---

## Operador ternário

Podemos utilizar o operador ternário como uma maneira mais curta de definir uma expressão `if/else`.

Podemos refatorar o exemplo anterior para:

```java
System.out.println(count > 2 ? "Count is higher than 2" : "Count is lower or equal than 2");
```

Embora ternário possa ser uma ótima maneira de tornar nosso código mais legível, nem sempre é um bom substituto para `if/else`.

---

## Operador switch

Se tivermos múltiplos casos elegíveis, será muito complexo criar uma estrutura if/else para controlar todas essas possibilidades, para isso podemos utilizar o `switch`:

Exemplo:

```java
int count = 3;
switch (count) {
case 0:
    System.out.println("Count is equal to 0");
    break;
case 1:
    System.out.println("Count is equal to 1");
    break;
default:
    System.out.println("Count is either negative, or higher than 1");
    break;
}
```

Três ou mais `if/else` aninhados podem ser difíceis de ler. Para resolver isso podemos utilizar o `switch`, como vimos acima.

É necessário ter em mente que o `switch` tem limitações de escopo e input que precisamos lembrar antes de usar.

<br/>

[Operadores](../operators/operadores.md)📝👈 Conteúdo anteriror __________|__________Próximo conteúdo 📝👉[Vetores](../arrays/vetores.md)

<br/>

Materiais de Apoio:

https://www.baeldung.com/java-control-structures
https://tuyosistema.com/blog/2021/12/11/estruturas-de-controle-em-java