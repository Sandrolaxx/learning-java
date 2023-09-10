# Tipos primitivos em Java🇧🇷

São tipos que guardão em memória valores simples, são sempre escritos com letra minúscula, diferentemente dos Objetos. Tamos oito, são eles:

- int
- double
- float
- byte
- char
- long
- shor
- boolean

| Tipo    | Tamanho(bits) | Mín                | Máx                                   | Exemplo                       |
| ------- | ------------- | ------------------ | ------------------------------------- | ----------------------------- |
| byte    | 8             | -2<sup>7</sup>     | 2<sup>7</sup> -1                      | byte b =100;                  |
| short   | 16            | -2<sup>15</sup>    | 2<sup>15</sup> -1                     | shor s = 30_000;              |
| int     | 32            | -2<sup>31</sup>    | 2<sup>31</sup> -1                     | int i = 100_000_000;          |
| long    | 64            | -2<sup>63</sup>    | 2<sup>63</sup> -1                     | long l = 100_000_000_000_000; |
| float   | 32            | -2<sup>-149</sup>  | (2-2<sup>-23</sup>)\*2<sup>127</sup>  | float f = 1.456f;             |
| double  | 64            | -2<sup>-1074</sup> | (2-2<sup>-52</sup>)\*2<sup>1023</sup> | double d = 1.456789012345678; |
| char    | 16            | 0                  | 2<sup>16</sup> -1                     | char c = 'a'                  |
| boolean | 1             | -                  | 2<sup>7</sup> -1                      | boolean b = true              |

---

### int

Também conhecido como integer, ele permite o armazenamento de valores não fracionários, o Java o aloca em 32 bits de memória, possibilitando definir valores no range de `-2,147,483,648` até `2,147,483,647`.

No Java 8 é possível criar um **int** com valor até 4,294,967,295 com o auxílio de novas funcões auxiliares.

Ex:

```java
int age = 25;

int withoutAssignment;
```

O valor padrão de um **int** sem atribuição é 0.

---

### byte

Ele ocupa apenas 8 bits de memória, o que nos permite armazenar valores entre o range de `-128` até `127`.

Ex:

```java
int age = 25;

int withoutAssignment;
```

Valor padrão é 0.

---

### short

Se você deseja salvar memória e o byte é muito pequeno, pode utilizar o **short** ele fica no entre o byte e o int, seus valores possíveis estão entre `-32,768` até `32,767`.

Ex:

```java
short s = 20202;

short s;
```

Similar aos outros tipos, seu valor padrão é 0. Permite realizar todas as operações aritméticas padrões.

---

### long

O último tipo primitivo inteiro é o long, ele é armazenado em 64 bits de memória, isso quer dizer que ele suporte um valor muito grande.

Os valores possíveis de long estão em `-9,223,372,036,854,775,808` até `9,223,372,036,854,775,807`.

---

### float

Nós podemos representar números fracionários básicos com o tipo float, ele nos fornece uma precisão simples, isso significa que caso passarmos de seis casas decimais, o número se torna menor preciso e mais uma estimativa.

Na maioria dos casos não nos importamos em perder algumas casas decimais, mas caso nosso cálculo precise de uma precisão absoluta(operações financeiras, pouso na lua, etc), vamos precisar utilizar um tipo designado para isso, o [BigDecimal]("https://www.baeldung.com/java-bigdecimal-biginteger").

Ele é armazenado em 32 bits assim como os outros int's. Por conta do ponto decimal seu range é diferente, ele também pode representar valores positivos e negativos, seu range vai de `-1.40239846 x 10`<sup>-45</sup> até `3.40282347 x 10`<sup>38</sup>

Ex:

```java
float f = 3.145f;

float f;
```

**Valor padrão é 0.0 ao invés de 0\_**. É necessário colocar o **f** no final do número quando declarar o float, caso contrario o Java irá lançar uma exceção por conta do valor padrão de decimais ser **double**.

---

### double

O double tem o mesmo intuito do float, representar números decimais, seu nome vem do fato poder representar números decimais com precisão dupla, ele sofre do mesmo problema de precisão de seu irmão.

Ele é armazenado em 64 bits de memória, ou seja, ele pode armazenar números muito grandes, seu range vai de `-4.9406564584124654 x 10`<sup>-324</sup> até `1.7976931348623157 x 10`<sup>308</sup>.

Ex:

```java
double d = 3.13457599923384753929348D;

double d;
```

Valor padrão 0.0, similarmente ao float, você pode adicionar o 'D' ao final do número(opcional).

---

### boolean

Tipo primitivo mais simples, possui apenas dois valores, `true` ou `false`. É armazenado em apenas um bit.

Com tudo, por conveniência, o Java preenche o valor e o armazena em um byte(8 bits). Deve ser um rolo representar um bit😅.

Ex:

```java
boolean b = true;

boolean b;
```

Criando a variável sem atribuição de valor o valor padrão é `false`. Muito utilizado para controlar o fluxo lógico de nossas aplicações.

---

### char

Nosso último tipo primitivo é o char, também chamado de character, ele é um inteiro de 16-bit que representa um [código Unicode](https://www.joelonsoftware.com/2003/10/08/the-absolute-minimum-every-software-developer-absolutely-positively-must-know-about-unicode-and-character-sets-no-excuses/), seu range vai de 0 até 65,535. Em Unicode isso representa de `\u0000` até `\uffff`. Também suporta tabela ASCII.

Ex:

```java
char c = 'a';

char c = 65;

char c;
```

O valor padrão é `\u0000`, podemos utilizar qualquer caractere literal e ele vai ser automaticamente transformado em seu respectivo código unicode.

---

### Estouro(Overflow e Underflow)

E se tentarmos colocar um valor maior que o tipo suporta? Isso é chamado de estouro(Overflow), no caso de inteiros ele volta a contar a partir do primeiro número negativo, números flutuantes retornam infinito.

Ex:

```java
int i = Integer.MAX_VALUE;
int j = i + 1;
// j vai voltar para -2_147_483_648

double d = Double.MAX_VALUE;
double x = d + 1;
// x se torna infinito
```

Underflow tem o mesmo comportamento, mas para estouro negativo em inteiros, para decimais quando temos o estouro negativo o número retorna a 0.0.

---

### Autoboxing

Cada tipo primitivo em Java possui uma classe que pode envolver(wrap). Por exemplo, a classe **Integer** pode envolver um **int**, em algumas vezes podemos precisar transformar os tipos primitivos em seus objetos envolvidos, para termos todos os benefícios da classe Object, por exemplo, utilizar como [generics](https://www.baeldung.com/java-generics).

Por sorte o Java faz essa conversão automaticamente para nós, esse processo se chama Autoboxing.

Ex:

```java
Character c = 'c';

Integer i = 1;
```

<br/>

Próximo conteúdo 📝👉[Operadores](../operators/operadores.md)

<br/>

Materiais de Apoio:

https://www.baeldung.com/java-primitives