# Classes e Objeto🇧🇷

Em Java, classes são estruturas fundamentais que são usadas para modelar objetos do mundo real e organizar o código de um programa. As classes servem como modelos ou planos para criar objetos, que são instâncias específicas da classe.

### Definição de classe 

Uma classe em Java é definida usando a palavra-chave "class" seguida pelo nome da classe. Por exemplo:

```java
public class Ninja {
    // Atributos, construtores e métodos são definidos aqui
}
```

---

### Atributos:

Atributos são variáveis que representam características ou propriedades do objeto. Eles são declarados dentro da classe e descrevem o estado do objeto. Por exemplo:

```java
public class Ninja {
    
    String nome;

    String aldeia;

}
```

---

### Métodos

Métodos são funções definidas dentro de uma classe que descrevem o comportamento dos objetos dessa classe. Eles podem ser usados para realizar operações ou executar ações em um objeto. Por exemplo:

```java
public void realizarJutso() {
        System.out.println(nome + " realizando jutso " + nomeJutso);
    }
```

---

### Construtores

Um construtor é um método especial que é chamado quando um objeto da classe é criado. Ele é usado para inicializar os atributos do objeto. Por exemplo:

```java
public Ninja(String nome, String aldeia) {
    this.nome = nome;
    this.aldeia = aldeia;
}
```

---

### Objetos

Um objeto é uma instância de uma classe. Você pode criar objetos a partir de uma classe usando o operador "new". Lembrando que o objeto ocupa espaço em memória, enquanto a classe não.

Por exemplo:

```java
Ninja ninja1 = new Ninja("Naruto", "Folha");

Ninja ninja2 = new Ninja("Sasuke", "Folha");
```