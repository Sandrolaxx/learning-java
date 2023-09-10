# Operadores🇧🇷

## Operadores aritiméticos

Em java temos todas as operações matemáticas simples, adição, subtração, divisão e multiplicação. Realizamos estas operações com os operadores aritiméticos. Abaixo trataremos de cada um:

### Operador de adição

O operador de adição(`+`) nos permite somar dois valores ou concatenar strings.

```java
int ten = 5 + 5d;
String youAndMe = "You " + "and" + " Me";
```

Resultado de operações com inteiros é sempre um inteiro\*.

### Operador de subtração

Operador de subtração(`-`), normalmente utilizado para subtrair um valor do outro.

```java
int five = 10 - 5;
int negative80 = 20 - 100;
```

### Operador de multiplicação

Operador(`*`), utilizado para multiplicar dois valores ou variavéis.

```java
int hundred = 20 * 5;
int fifteen = -5 * -3;
```

### Operador de divisão

O operador de divisão(`/`) nos permite dividir o valor da esquerda pelo valor após o operador:

```java
int four = 20 / 5;
int seven = 15 / 2;
```

Resultado de operações com inteiros é sempre um inteiro\*. Exemplo com esse operador `15/2 = 7`.

### Operador de modulo

Operador(%) utilizado para saber o resto da divisão de algum número.

Ex:

```java
int one = 15 % 2;
int zero = 10 % 5;
```

## Operadores Unários

Operadores unários requerem apenas um operando. Operadores unários são utilizados para executar várias operações, como, incrementar/decrementar um valor, negar expressões e inverter o valor de um boolean.

Ex de unário: `++` e `--`

```java
int x = 10;

System.out.println (x++); // 10 (11)
System.out.println (++x); // 12
System.out.println (x--); // 12 (11)
System.out.println (--x); // 10
```

A posição do operador influência se a operação anterior a ele será realizada antes de realizar o incremento/decremento ou depois, no exemplo da primeira linha é realizado o _System.out_ e depois o valor é incrementado.

Ex de unário: `~` e `!`

```java
int a = 10;
int b = -10;
boolean c = true;
boolean d = false;

System.out.println (~a); // - 11 (Inverte o sinal e subtrai com 1)
System.out.println (~b); // 9 (Inverte o sinal e subtrai com 1)
System.out.println (!c); // false (oposto ao valor booleano)
System.out.println (!d); // true
```

## Operadores Relacionais

Utilizado para realizar verificações de igualdade(`==`) entre valores, negação de igualdade(`!=`), maior que(`>`), menor que(`<`), maior ou igual(`>=`), menor ou igual(`>=`).

```java
int a = 10;
int b = 5;
int c = 5;

System.out.println(a == b); // false - operador de igualdade
System.out.println(a != b); // true - negação do operador de igualdade

System.out.println(a > b); // true - a não é maior que b
System.out.println(b >= c); // true - b é maior que ou igual a c

System.out.println(a < b); // false - a não é menor que b
System.out.println(b <= c); // true - b é menor ou igual a c
```

## Operadores Shift para esquerda

O operador Java left shift << é usado para mudar todos os bits de um valor para o lado esquerdo de um número especificado de vezes.

Exemplo operador Left Shift

```java
System.out.println (10 << 2); // 10 * 2 ^ 2 = 10 * 4 = 40
System.out.println (10 << 3); // 10 * 2 ^ 3 = 10 * 8 = 80
System.out.println (20 << 2); // 20 * 2 ^ 2 = 20 * 4 = 80
System.out.println (15 << 4); // 15 * 2 ^ 4 = 15 * 16 = 240
```

## Operadores Shift para direita

O operador Java right shift >> é usado para mover os operandos da esquerda para a direita pelo número de bits especificado pelo operando da direita.

Exemplo operador Right Shift

```java
System.out.println (10 >> 2); // 10 / 2 ^ 2 = 10 / 4 = 2
System.out.println (20 >> 2); // 20 / 2 ^ 2 = 20 / 4 = 5
System.out.println (20 >> 3); // 20 / 2 ^ 3 = 20 / 8 = 2
```

Exemplo do operador Shift: >> vs >>>

```java
// Para número positivo, >> e >>> funcionam da mesma forma
System.out.println (20 >> 2);
System.out.println (20 >>> 2);
// Para número negativo, >>> altera o bit de paridade (MSB) para 0
System.out.println (-20 >> 2);
System.out.println (-20 >>> 2);
```

## Operador AND: Lógico `&&` e Bitwise `&`

O operador lógico && não verifica a segunda condição se a primeira condição for falsa. Ele verifica a segunda condição apenas se a primeira for verdadeira.

O operador bit a bit & sempre verifica as duas condições se a primeira condição é verdadeira ou falsa.

Exemplo:

```java
int a = 10;
int b = 5;
int c = 20;

System.out.println(a < b && a++ < c); // falso && verdadeiro = falso
System.out.println(a); // 10 porque a segunda condição nem chegou a ser executada/testada
System.out.println(a < b & a++ < c); // falso && verdadeiro = falso
System.out.println(a); // 11 porque a segunda condição foi executada/testada
```

## Operador OR: Lógico `||` e Bitwise `|`

O operador lógico || não verifica a segunda condição se a primeira condição for verdadeira. Ele verifica a segunda condição apenas se a primeira for falsa.

O operador bit a bit | sempre verifica as duas condições se a primeira condição é verdadeira ou falsa.

Exemplo:

```java
int a = 10;
int b = 5;
int c = 20;

System.out.println(a > b || a < c); // true || true = true
System.out.println(a > b | a < c); // true | true = true

System.out.println (a > b || a ++ < c); // true || true = true
System.out.println (a); // 10 porque a segunda condição nem chegou a ser executada/testada
System.out.println (a > b | a ++ < c); // true | true = true
System.out.println (a); // 11 porque a segunda condição foi executada/testada
```

## Operador ternário

O operador ternário é usado como um substituto para a instrução if-else simples, muito usado na programação Java. É o único operador condicional que leva três operandos.

Exemplo:

```java
int a = 2;
int b = 5;
int min = a < b ? a : b;//a é menor que b ? processo verdadeiro : processo falso;

System.out.println(min);
```

## Operador de atribuição

O operador de atribuição é um dos operadores mais comuns. É usado para atribuir o valor à direita ao operando à esquerda.

Exemplo:

```java
int a = 10;
int b = 20;

a += 4; //a = a + 4 (a = 10 + 4)
b -= 4; //b = b - 4 (b = 20 - 4)

System.out.println(a);
System.out.println(b);
```

## Operador _instanceof_

Às vezes quando temos um objeto, precisamos saber qual é o tipo da instancia dele, muito utilizado quando realizamos operações com [Generics](https://www.baeldung.com/java-generics) e precisamos em algum momento realizar um cast do objeto com a segurança de não receber um ClassCastException.

```java
boolean resultTrue = Long.valueOf(20) instanceof Number;
```

<br/>

[Primitivos](../primitives/primitivos.md)📝👈 Conteúdo anteriror __________|__________Próximo conteúdo 📝👉[Estrutura de Controle](../controlstructures/estruturasControle.md)

Materiais de Apoio:

https://www.javatpoint.com/pt/operadores-em-java
https://www.baeldung.com/java-operators
