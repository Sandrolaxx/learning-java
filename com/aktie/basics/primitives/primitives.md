# All primitive types in Java🇺🇸

We have eight types to store simple data. They aren't considered objects and represent raw values:

- int
- double
- float
- byte
- char
- long
- shor
- boolean

| Type    | Size(bits) | Min                | Max                                   | Exemple                       |
| ------- | ---------- | ------------------ | ------------------------------------- | ----------------------------- |
| byte    | 8          | -2<sup>7</sup>     | 2<sup>7</sup> -1                      | byte b =100;                  |
| short   | 16         | -2<sup>15</sup>    | 2<sup>15</sup> -1                     | shor s = 30_000;              |
| int     | 32         | -2<sup>31</sup>    | 2<sup>31</sup> -1                     | int i = 100_000_000;          |
| long    | 64         | -2<sup>63</sup>    | 2<sup>63</sup> -1                     | long l = 100_000_000_000_000; |
| float   | 32         | -2<sup>-149</sup>  | (2-2<sup>-23</sup>)\*2<sup>127</sup>  | float f = 1.456f;             |
| double  | 64         | -2<sup>-1074</sup> | (2-2<sup>-52</sup>)\*2<sup>1023</sup> | double d = 1.456789012345678; |
| char    | 16         | 0                  | 2<sup>16</sup> -1                     | char c = 'a'                  |
| boolean | 1          | -                  | 2<sup>7</sup> -1                      | boolean b = true              |

---

### int

Also known as integer, it allows the storage of non-fractional values, Java allocates it in 32 bits of memory, making it possible to define values in the range of `-2,147,483,648` to `2,147,483,647`.

In Java 8 it possible to create an **int** with a value up to 4,294,967,295 with new special helper functions.

Ex:

```java
int age = 25;

int withoutAssignment;
```

The default value of **int** with no assignment is 0.

---

### byte

It occupies only 8 bits of memory, which allows us to store values between the range of `-128` to `127`.

Ex:

```java
int age = 25;

int withoutAssignment;
```

Default value is 0.

---

### long

The last integer type is long, it is stored in 64 bits of memory, this means that it supports a very large value.

Possible values to long is `-9,223,372,036,854,775,808` to `9,223,372,036,854,775,807`.

---

### float

We can represent basic fractional numbers with the float type, it gives us single precision, this means that if we go beyond six decimal places, the number becomes less accurate and more of an estimate.

In most cases we don't mind losing a few decimal places, but if our calculation needs absolute precision (financial operations, moon landing, etc), we will need to use a designated type for this, the [BigDecimal]("https://www.baeldung.com/java-bigdecimal-biginteger").

It is stored in 32 bits just like the other int's. Because of the decimal point, its range is different, it can also represent positive and negative values, its range goes from `-1.40239846 x 10`<sup>-45</sup> to `3.40282347 x 10`<sup>38</sup>

Ex:

```java
float f = 3.145f;

float f;
```

**Default value is 0.0 rather than 0**. It is necessary to place the **f** at the final of the number when declaring the float, otherwise Java will be throw an exception because the default type of decimals is **double**.

---

### double

The double has the same purpose as the float, representing decimal numbers, its name comes from the fact that it can represent decimal numbers with double precision, it suffers from the same precision problem as its brother.

It is stored in 64 bits of memory, that is, it can store very large numbers, its range goes from `-4.9406564584124654 x 10`<sup>-324</sup> to `1.7976931348623157 x 10`<sup>308</sup>.

Ex:

```java
double d = 3.13457599923384753929348D;

double d;
```

Default value 0.0, similarly to float, you can add 'D' to the end of the number (optional).

---

### boolean

Simplest primitive type, has only two values, `true` or `false`. It is stored in just one bit.

However, for convenience, Java pads the value and stores it in a byte (8 bits). It must be troublesome to represent a bit😅.

Ex:

```java
boolean b = true;

boolean b;
```

When creating the variable without assigning a value the default value is `false`. Often used to control the logical flow of our applications.

---

### char

The last primitive is char, also called a character, It is a 16-bit integer that represents a [Unicode-encoded](https://www.joelonsoftware.com/2003/10/08/the-absolute-minimum-every-software-developer-absolutely-positively-must-know-about-unicode-and-character-sets-no-excuses/) character, your range go 0 to 65,535. In Unicode it represent `\u0000` to `\uffff`. Also support ASCII.

Ex:

```java
char c = 'a';

char c = 65;

char c;
```

Dafault value is `\u0000`, we can create a character passing an integer and automatically transformed into their Unicode encoding for us.

---

### Overflow and Underflow

If we try to put a value bigger than what the type supports? It is called Overflow, in integer cases, the value restarts with the maximum negative value; float values go to infinity.

Ex:

```java
int i = Integer.MAX_VALUE;
int j = i + 1;
// j vai voltar para -2_147_483_648

double d = Double.MAX_VALUE;
double x = d + 1;
// x se torna infinito
```

Underflow has the same behavior for integer values, for decimals, when we have a negative(underflow) the number restart with a 0.0 value.

---

### Autoboxing

Each primitive type has a wrapper class. For instance, the **Integer** class can wrapper an **int**, sometimes we need to transform the primitive types to their classes, to access the benefits of objects, for example, [generics](https://www.baeldung.com/java-generics).

Our lucky the Java makes this happen automatically, this process is called Autoboxing.

Ex:

```java
Character c = 'c';

Integer i = 1;
```

<br/>

Next content 📝👉[Operators](../operators/operators.md)

<br/>

Support Materials:

https://www.baeldung.com/java-primitives
