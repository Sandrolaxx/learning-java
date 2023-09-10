# Operators🇺🇸

Java provides all simple math operations, like addition, subtraction, multiplication, and division. We make those operations with the arithmetic operators. Below, we will discuss each one:

### Addition operator

The addition operator(`+`) allow us to sum values or concatenate two strings.

```java
int ten = 5 + 5d;
String youAndMe = "You " + "and" + " Me";
```

The result of int operations is always a int.

### Subtraction operator

Subtraction operator(`-`), usually used to subtract one value from another.

```java
int five = 10 - 5;
int negative80 = 20 - 100;
```

### Multiplication operator

Operator(`*`), used to multiply two values or variables.

```java
int hundred = 20 * 5;
int fifteen = -5 * -3;
```

### Division operator

The division operator(`\`), allow us to divide the left-and value by the right-hand one.

```java
int four = 20 / 5;
int seven = 15 / 2;
```

The result of int operations is always a int. An example with the operator `15/2 = 7`.

### The Modulo operator

Operator(`%`) used to know the rest of the division of number.

Ex:

```java
int one = 15 % 2;
int zero = 10 % 5;
```

## Unary operators

Unary operators only require one single operand. Usually used to increment, decrement, or negate a variable or value.

Ex unary: `++` e `--`

```java
int x = 10;

System.out.println (x++); // 10 (11)
System.out.println (++x); // 12
System.out.println (x--); // 12 (11)
System.out.println (--x); // 10
```

The position of operator at the value is important influence on the operator's order of operation, the example above, the first line, the System.out is executed, and after that, the value is incremented.

Ex unary: `~` e `!`

```java
int a = 10;
int b = -10;
boolean c = true;
boolean d = false;

System.out.println (~a); // - 11 (Invert the sign and subtract with 1)
System.out.println (~b); // 9 (Invert the sign and subtract with 1)
System.out.println (!c); // false (negate the boolean value)
System.out.println (!d); // true
```

## Relational Operators

Used to make equal to(`==`) verification between values, negate the equal verification(`!=`), greater than(`>`), less than(`<`), greater than or equal to(`>=`), less than or equal to(`<=`).

```java
int a = 10;
int b = 5;
int c = 5;

System.out.println(a == b); // false - equal to operator
System.out.println(a != b); // true - negate equal to operator

System.out.println(a > b); // true - a is greater than b
System.out.println(b >= c); // true - b is greater than or equal to c

System.out.println(a < b); // false - a is not less than b
System.out.println(b <= c); // true - b is less than or equal to c
```

## Left Shift Operators

The Java operator left shift `<<` is used to shift all bits of a value to the left side a specified number of times.

Ex Left Shift operator:

```java
System.out.println (10 << 2); // 10 * 2 ^ 2 = 10 * 4 = 40
System.out.println (10 << 3); // 10 * 2 ^ 3 = 10 * 8 = 80
System.out.println (20 << 2); // 20 * 2 ^ 2 = 20 * 4 = 80
System.out.println (15 << 4); // 15 * 2 ^ 4 = 15 * 16 = 240
```

## Right Shift Operators

The Java operator right shift `>>` is used to move operands from left to right by the number of bits specified by the right operand.

Ex Right Shift operator:

```java
System.out.println(10 >> 2); // 10 / 2 ^ 2 = 10 / 4 = 2
System.out.println(20 >> 2); // 20 / 2 ^ 2 = 20 / 4 = 5
System.out.println(20 >> 3); // 20 / 2 ^ 3 = 20 / 8 = 2
```

Ex of operator Shift: >> vs >>>

```java
// For positives, >> e >>> work the same way
System.out.println(20 >> 2);
System.out.println(20 >>> 2);
For negative number, >>> changes the parity bit (MSB) to 0
System.out.println(-20 >> 2);
System.out.println(-20 >>> 2);
```

## AND Operator: Logical `&&` and Bitwise `&`

The logical operator `&&` does not check the second condition if the first condition is false. It checks the second condition only if the first is true.

The bitwise `&` operator always checks both conditions, whether the first condition is true or false.

Ex:

```java
int a = 10;
int b = 5;
int c = 20;

System.out.println(a < b && a++ < c); // false && true = false
System.out.println(a); // 10 becuse the second condition never executed/tested
System.out.println(a < b & a++ < c); // false && true = false
System.out.println(a); // 11 becuse the second condition is executed/tested
```

## OR Operator: Logical `||` and Bitwise `|`

The logical operator || does not check the second condition if the first condition is true. It checks the second condition only if the first is false.

The bitwise operator | always checks both conditions, whether the first condition is true or false.

Ex:

```java
int a = 10;
int b = 5;
int c = 20;

System.out.println(a > b || a < c); // true || true = true
System.out.println(a > b | a < c); // true | true = true

System.out.println (a > b || a ++ < c); // true || true = true
System.out.println (a); // 10 becuse the second condition never executed/tested
System.out.println (a > b | a ++ < c); // true | true = true
System.out.println (a); // 11 becuse the second condition is executed/tested
```

## Ternary operator

The ternary operator is used as a replacement for the simple if-else statement, which is often used in Java programming. It is the only conditional operator that takes three operands.

Ex:

```java
int a = 2;
int b = 5;
int min = a < b ? a : b;//a is less than b ? true process : false process;

System.out.println(min);
```

## Assignment operator

The assignment operator is one of the most common operators. It is used to assign the value on the right to the operand on the left.

Ex:

```java
int a = 10;
int b = 20;

a += 4; //a = a + 4 (a = 10 + 4)
b -= 4; //b = b - 4 (b = 20 - 4)

System.out.println(a);
System.out.println(b);
```

## The "instanceof" operator

Sometimes when we have an object, we need to know what the type of it is, and the instanceof helps us, often used with Generics, to cast the type correctly and avoid a ClassCastException.

```java
boolean resultTrue = Long.valueOf(20) instanceof Number;
```

<br/>

[Primitives](../primitives/primitives.md)📝👈 Last content __________|__________Next content 📝👉[Control Structures](../controlstructures/controlStructures.md)

<br/>

Support Materials:

https://www.javatpoint.com/pt/operadores-em-java
https://www.baeldung.com/java-operators
