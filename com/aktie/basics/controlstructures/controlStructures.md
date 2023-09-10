# Control Structures🇺🇸

## Overview

Simply, a program is a list of instructions. Instruction controls are blocks where the program can change its path.

We use these structures to choose between two or more paths. There are three types in Java:
`if/else/else if`, ternary operator and switch.

---

## IF/ELSE

The `if/else` statement is the most basic control structure. It can also be considered the very basis of decision making in programming.

While `if` can be used alone, the most common use is to use two paths with `if/else`.

Example:

```java
if (count > 2) {
     System.out.println("Count is higher than 2");
} else {
     System.out.println("Count is lower or equal than 2");
}
```

Theoretically, we can chain or nest `if/else` blocks infinitely, but this will degrade the readability of the code, which is why it is not recommended.

---

## Ternary operator

We can use the ternary operator as a shorter way to define an `if/else` expression.

We can refactor the previous example to:

```java
System.out.println(count > 2 ? "Count is higher than 2" : "Count is lower or equal than 2");
```

While ternary can be a great way to make our code more readable, it's not always a good substitute for `if/else`.

---

## switch operator

If we have multiple eligible cases, it will be very complex to create an `if/else` structure to control all these possibilities, for that we can use the `switch`:

Example:

```java
int count = 3;
switch(count) {
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

Three or more nested `if/else` can be difficult to read. To solve this we can use the `switch`, as we saw above.

It is necessary to keep in mind that `switch` has scope and input limitations that we need to remember before using.

<br/>

[Operators](../operators/operators.md)📝👈 Last content __________|__________Next content 📝👉[Arrays](../arrays/arrays.md)

<br/>

Support Materials:

https://www.baeldung.com/java-control-structures
https://tuyosistema.com/blog/2021/12/11/estruturas-de-controle-em-java