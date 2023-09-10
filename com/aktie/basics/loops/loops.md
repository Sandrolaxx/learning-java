# Control Structures🇺🇸

## Overview

They are used to iterate over a large mass of data and perform processing on each element, often used to manipulate lists. We have the three main types which are `while`, `do-while` and `for`.

---

## While

Performs an iteration while a given expression is being satisfied. To enter the block at least once the expression must be met (true) at least once.

Example:

```java
int whileCounter = 1;

while (whileCounter <= 50) {
     methodToRepeat();

     whileCounter++;
}
```

---

## Do While

Rarely used, unlike while it does not need to have a valid first expression to enter its block, it executes at least once and after that it checks the expression.

Example:

```java
int whileCounter = 60;

of {
     methodToRepeat();

     whileCounter++;
} while (whileCounter <= 50);
```

---

## For

Used to be able to loop according to a condition and have access to the index of that iteration.

Example:

```java
for (int i = 0; i <= 20; i++) {
     if (i % 2 == 0) {
         System.out.println("Even Number - ".concat(String.valueOf(i)));
     }
}
```

---

## break

When we need to exit the whole loop and end all its processing, ignoring the expression to be satisfied.

Example - Stopping execution when reached number 25:

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

## Continues

When we need to run the rest of the block and skip to the next iteration.

Example - Printing only the weekend:

```java
for (int i = 1; i < 8; i++) {
     if (i != 1 && i != 7) {
         continue;
     }

     System.out.println("Today is ".concat(i == 1 ? "Sunday" : "Saturday"));
}
```

<br/>

[Arrays](../arrays/arrays.md)📝👈 Last content __________|__________Next content 📝👉OOP

<br/>

Support Materials:

https://www.baeldung.com/java-control-structures
