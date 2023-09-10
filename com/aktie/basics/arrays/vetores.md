# Vetores🇧🇷

## Overview

São utilizados para poder armazenar uma série de valores de uma forma simples e eficiente. Primeiramente precisamos entender o que é um array, segundo a [documentação do Java](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html), um vetor é um objeto que contem um número fixo de valores do mesmo tipo. Os elementos de um vetor são indexados, isso que dizer que você pode acessar qualquer um deles com seu respectivo índice.

Podemos considerar que um vetor é uma lista de células(tipo excel mesmo) numeradas, cada célula com uma variável. No Java o vetor inicia em 0.

Podemos criar vetores de tipos primitivos e objetos, ou seja, podemos criar vetores de int, float, String e objetos customizados.

---

## Declaração

Agora que sabemos o que é um Vetor, podemos então nos aprofundar em seus usos. Iniciando vamos ver como declarar esse cara.

Exemplo:

```java
int[] anArray;
```

ou

```java
int anOtherArray[];
```

O primeiro exemplo é mais amplamente utilizado.

---

## Inicialização

Existem alguns modos de inicializar um vetor, aqui veremos os dois principais, iniciando com maneira mais simples:

Exemplo:

```java
int[] anArray = new int[10];
```

Aqui declaramos o vetor e inicializamos ele com 10 elementos, que assumiram o valor padrão, no caso do int o número 0, no caso de `Object` é `null`. Lembrando que é obrigatório definir o tamanho do vetor.

A segunda forma nos possibilita já setar os valores dos elementos na inicialização:

Exemplo:

```java
int[] anArray = new int[] {1, 2, 3, 4, 5};
```

Nesse modelo não precisamos setar qual o tamanho do array, ele seta automaticamente com base na quantidade de elementos.

---

## Acessando os elementos

Podemos acessar o elemento informando seu índice no vetor. No exemplo abaixo será printado no log o número 10.

Exemplo:

```java
anArray[0] = 10;

System.out.println(anArray[0]);
```

Note como estamos utilizando índice para acessar o elemento. O número entre os colchetes é a posição especifica que desejamos acessar.

Quando o índice é negativo ou vai além da quantidade de elementos suportado no array, Java vai lançar um `ArrayIndexOutOfBoundException`.

---

## Iterando do Vetor

Podemos utilizar as técnicas apresentadas na [doc](../loops/loops.md) sobre loops, acessar elemento a elemento pode ser bem trabalhoso, para isso se faz necessário a utilização de loops.

Exemplo:

```java
int[] anArray = new int[] {1, 2, 3, 4, 5};

for (int i = 0; i < anArray.length; i++) {
    System.out.println(anArray[i]);
}
```

Exemplo acima irá printar no console os números de 1 à 5. Aqui utilizamos a propriedade `length`, é uma propriedade pública que nos dá o tamanho do vetor.

É claro que também é possível utilizar outros mecanismos de loop como `while`, `do while`, Java collectios, também é possível iterar utilizando `foreach`.

Exemplo

```java
int[] anArray = new int[] {1, 2, 3, 4, 5};

for (int element : anArray) {
    System.out.println(element);
}
```

Esse segundo exemplo é o mesmo que o primeiro, porém com um boilerplate de código nos índices. O `foreach` é uma boa opção quando:<br/>

- Não precisamos modificar o array, por ser uma variável de escopo local, ele não ira efetivamente alterar o elemento do array.
- Não precisamos do índice para fazer algo.

---

## Varargs

Já entendemos a parte básica de criação e manipulação dos vetores. Agora vamos aprofundar e falar de tópicos mais avançados, começando pelo `varargs`. O `varargs` nos permite passar uma quantidade de argumentos arbitrária para um método, para mais detalhes sobre `varargs` consulte a [doc](https://www.baeldung.com/java-varargs) sobre.

Exemplo:

```java
void varargsMethod(String... varargs) {}
```

O método acima pode receber de 0 até N Strings como argumento, por baixo dos panos ele pega todos os valores passados por parâmetro e cria um array.

Exemplo:

```java
String[] anArray = new String[] {"Milk", "Tomato", "Chips"};
varargsMethod(anArray);
```

Exemplo acima é o mesmo que:

```java
varargsMethod("Milk", "Tomato", "Chips");
```

---

## Transformando Vetores(Arrays) em Listas(List)

Ok vetores são legais, mas na maioria das vezes vamos estar trabalhando com listas, então vamos ver as formas de transformar um vetor em lista.

A primeira forma e a mais simples é criar uma lista vazia e iterar o vetor para adicionar cada elemento.

Exemplo:

```java
int[] anArray = new int[] {1, 2, 3, 4, 5};

List<Integer> aList = new ArrayList<>();

for (int element : anArray) {
    aList.add(element);
}
```

A segunda forma é mais sucinta:

```java
Integer[] anArray = new Integer[] {1, 2, 3, 4, 5};

List<Integer> aList = Arrays.asList(anArray);
```

O método estático `Arrays.asList` utiliza `varargs` como argumento para criar uma lista com os valores informados. Infelizmente esse modelo tem alguns problemas:

- Não é possível utilizar com um array de tipos primitivos
- Não é possível adicionar ou remover elementos a lista criada, ela retorna uma Lista de tamanho fixo, porém seus dados podem ser alterados, diferentemente de `List.of` que retorna uma lista imodificável, no caso do `Arrays.asList` **só consigo mudar os valores das posições já existentes**.

---

## Vetores para Streams

Conseguimos transformar vetores em listas, mas a partir do Java 8 temos acesso a Stream API e queremos transformar nossos vetores em Stream. Java nos prove o método `Array.stream` para isso.

Exemplo:

```java
String[] anArray = new String[] {"Milk", "Tomato", "Chips"};

Stream<String> aStream = Arrays.stream(anArray);
```

Quando passamos um Objeto vetor para o método ele retorna uma Stream do referido tipo(Stream\<Integer> para um vetor de Integer). Quando passamos primitivos ele retorna uma Stream de primitivos.

É possível criar também uma Stream de um subset de um vetor:

```java
Stream<String> anotherStream = Arrays.stream(anArray, 1, 3);
```

Isso vai criar uma `Stream<String>` apenas com "Tomato" e "Chips", o primeiro índice do método é inclusivo e o segundo índice é exclusivo.

---

## Ordenando Vetores

Agora vermos como ordenar nosso vetor, ou seja, reorganizar seus elementos em uma determinada ordem. A classe `Arrays` provem um método chamado `sort`.

Existem algumas sobrecargas para `sort`:

- Vetores de tipo primitivos são ordenados de forma ascendente.
- Vetores de Object(esses objetos precisam implementar a interface Comparable), eles são ordenados de forma natural, ou seja, o que estiver implementado no método `compareTo` de Comparable.

Algo interessante é poder ser realizado a ordenação de elementos em índices especificos.

O algoritmo por baixo dos panos são o [quick sort](https://pt.wikipedia.org/wiki/Quicksort) e [merge sort](https://pt.wikipedia.org/wiki/Merge_sort) para primitivos, respectivamente.

Exemplos sobre:

```java
int[] anArray = new int[] {5, 2, 1, 4, 8};
Arrays.sort(anArray); // anArray is now {1, 2, 4, 5, 8}

Integer[] anotherArray = new Integer[] {5, 2, 1, 4, 8};
Arrays.sort(anotherArray); // anotherArray is now {1, 2, 4, 5, 8}

String[] yetAnotherArray = new String[] {"A", "E", "Z", "B", "C"};
Arrays.sort(yetAnotherArray, 1, 3, Comparator.comparing(String::toString).reversed()); // yetAnotherArray is now {"A", "Z", "E", "B", "C"}
```

---

## Buscando em um Vetor

Para realizar uma busca é muito simples, basta fazer um loop no vetor e realizar uma expressão booleana para encontrar o elemento desejado.

Exemplo:

```java
int[] anArray = new int[] {5, 2, 1, 4, 8};

for (int i = 0; i < anArray.length; i++) {
    if (anArray[i] == 4) {
        System.out.println("Found at index " + i);
        break;
    }
}
```

Caso você já tenha um vetor ordenado, pode utilizar [busca binária](https://www.baeldung.com/java-binary-search) que é bem mais eficiente.

Felizmente o Java nos prove o método `Arrays.binarySearch`. Passamos o vetor e o elemento que desejamos encontrar.

No caso de um vetor genérico, também temos que fornecer o Comparator que foi usado para classificar o array em primeiro lugar. Existe novamente a possibilidade de chamar o método em um subconjunto do array.

Exemplo:

```java
int[] anArray = new int[] {1, 2, 3, 4, 5};

int index = Arrays.binarySearch(anArray, 4);

System.out.println("Found at index " + index);
```

No exemplo ele nos retorna que o número 4 está na célula 4, isso nos retorna o índice 3. **Note que utilizamos um vetor já ordenado\***.

---

## Concatenando vetores

E finalmente, vamos ver como concatenar dois vetores. A ideia é criar um vetor com o tamanho de dois vetores concatenados. Depois disso adicionamos os elementos do primeiro vetor e após isso o do segundo.

```java
int[] anArray = new int[] {5, 2, 1, 4, 8};
int[] anotherArray = new int[] {10, 4, 9, 11, 2};

int[] resultArray = new int[anArray.length + anotherArray.length];

for (int i = 0; i < resultArray.length; i++) {
    resultArray[i] = (i < anArray.length ? anArray[i] : anotherArray[i - anArray.length]);
}
```

Como podemos ver, enquanto o índice for menor que o tamanho do primeiro vetor nos adicionamos os elementos desse vetor, depois adicionamos os elementos do segundo. Podemos utilizar o método `Arrays.setAll` para remover a necessidade do loop.

Exemplo:

```java
int[] anArray = new int[] {5, 2, 1, 4, 8};
int[] anotherArray = new int[] {10, 4, 9, 11, 2};

int[] resultArray = new int[anArray.length + anotherArray.length];

Arrays.setAll(resultArray, i -> (i < anArray.length ? anArray[i] : anotherArray[i - anArray.length]));
```

Esse método vai adicionar todos os elementos ao novo vetor de acordo com uma função, a função associa o resultado a um índice.

Aqui está uma terceira opção para mesclar arrays: System.arraycopy. Este método pega um array de origem, uma posição de origem, um array de destino, uma posição de destino e um int definindo o número de elementos a serem copiados.

Exemplo:

```java
System.arraycopy(anArray, 0, resultArray, 0, anArray.length);
System.arraycopy(anotherArray, 0, resultArray, anArray.length, anotherArray.length);
```

Como podemos ver, copiamos o primeiro array, depois o segundo (após o último elemento do primeiro).

<br/>

[Estruturas de Controle](../controlstructures/estruturasControle.md)📝👈 Conteúdo anteriror __________|__________Próximo conteúdo 📝👉[Estrutura de Repetição](../loops/estruturasRepeticao.md)
<br/>

Materiais de Apoio:

https://www.baeldung.com/java-arrays-guide
