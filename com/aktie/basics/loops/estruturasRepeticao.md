# Estruturas de Repetição🇧🇷

## Overview

São utilizados para iterar em uma grande massa de dados e realizar um processamento em cada elemento, muito utilizado para manipular listas. Temos os três principais tipos que são o `while`, `do-while` e `for`.

---

## While

Realiza uma iteração enquanto determinada expressão está sendo atendida. Para entrar no bloco ao menos uma primeira vez é necessária que a expressão seja atendida(verdadeira) ao menos uma vez.

Exemplo:

```java
int whileCounter = 1;

while (whileCounter <= 50) {
    methodToRepeat();

    whileCounter++;
}
```

---

## Do While

Raramente utilizado, ao contrário do while ele não precisa ter uma primeira expressão valida para entrar em seu bloco, ele executa ao menos uma vez e após isso realiza a checagem da expressão.

Exemplo:

```java
int whileCounter = 60;

do {
    methodToRepeat();

    whileCounter++;
} while (whileCounter <= 50);
```

---

## For

Utilizado para poder fazer um loop de acordo com uma condição e ter acesso ao índice dessa iteração.

Exemplo:

```java
for (int i = 0; i <= 20; i++) {
    if (i % 2 == 0) {
        System.out.println("Even Number - ".concat(String.valueOf(i)));
    }
}
```

---

## Break

Quando precisamos sair de todo o loop e encerrar todo o seu processamento, ignorando a expressão a ser atendida.

Exemplo - Parando execução quando chegado no número 25:

```java
int maxVal = 25;

for (int i = 0; i <= 50; i++) {
    if (i == maxVal) {
        System.out.println("Last number ".concat(String.valueOf(i)).concat("\n"));

        break;
    }
}
```

---

## Continue

Quando precisamos para a execução do resto do bloco e pular para a próxima iteração.

Exemplo - Printando somente o final de semana:

```java
for (int i = 1; i < 8; i++) {
    if (i != 1 && i != 7) {
        continue;
    }

    System.out.println("Today is ".concat(i == 1 ? "Sunday" : "Saturday"));
}
```

<br/>

[Estrutura de Controle](../arrays/vetores.md)📝👈 Conteúdo anteriror __________|__________Próximo conteúdo 📝👉POO

<br/>

Support Materials:

https://www.baeldung.com/java-control-structures
