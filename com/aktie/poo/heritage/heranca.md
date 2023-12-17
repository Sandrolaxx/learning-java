# Herança🇧🇷

A herança é um dos pilares da programação orientada a objetos (POO) e permite a criação de novas classes baseadas em classes existentes, aproveitando e estendendo suas características.

Ponto importantes:

- **Definição**: Herança é um conceito que permite que uma classe (chamada classe derivada ou subclasse) herde atributos e métodos de outra classe (chamada classe base, superclasse ou pai).

- **Relação de "é um"**: A relação entre as classes é frequentemente descrita como "é um". Por exemplo, se temos uma classe Animal, uma subclasse poderia ser Cachorro, porque um cachorro é um tipo de animal.

- **Reutilização de código**: A herança promove a reutilização de código, evitando a duplicação e permitindo que as classes compartilhem comportamentos e características comuns da classe base.

- **Membros herdados**: As classes derivadas herdam os atributos e métodos públicos e protegidos da classe base. Isso significa que a classe derivada pode acessar e utilizar esses membros.

- **Adição e Modificação**: Além de herdar membros da classe base, a classe derivada pode adicionar novos atributos e métodos ou modificar o comportamento dos métodos existentes (sobrescrevendo-os).

- **Palavras-chave**: A herança é implementada usando palavras-chave `extends`. Por exemplo: `class Subclasse extends Superclasse`.

- **Hierarquia de classes**: A herança permite a criação de hierarquias de classes, onde classes mais específicas (subclasses) herdam de classes mais genéricas (superclasses), criando uma estrutura organizada e orientada ao domínio do problema.

- **Polimorfismo**: A herança está intimamente ligada ao polimorfismo, onde objetos de subclasses podem ser tratados como objetos de sua superclasse. Isso permite que métodos comuns sejam chamados, mas com comportamentos diferentes, dependendo da implementação na subclasse.

- **Modificadores de Acesso:** Em herança, os modificadores de acesso (como `public`, `private` e `protected`) controlam a visibilidade dos membros herdados. Por exemplo, membros `private` não são herdados diretamente, enquanto `protected` é acessível pela classe derivada.

- **Métodos e Atributos Estáticos:** Em algumas linguagens, como Java, métodos estáticos não são herdados, pois pertencem à classe, não às instâncias. Já atributos estáticos são compartilhados entre a classe base e suas subclasses.

A herança é um conceito poderoso na POO, permitindo a criação de hierarquias de classes, facilitando a reutilização de código e promovendo a extensibilidade e flexibilidade em sistemas complexos.

---

### Utilização na prática:

```java
public class AlunoNinja extends Ninja {                                                      // 1

    public AlunoNinja(String nome, int idade, String aldeia, String cla, String equipamento, // 2
        String nomeJutso, String nomeTime, String nomeProfessor) {
		super(nome, idade, aldeia, cla, equipamento, nomeJutso);                            // 3

        this.nomeProfessor = nomeProfessor;                                                 // 4
        this.nomeTime = nomeTime;
	}

	private String nomeTime;

    private String nomeProfessor;

    public String getNomeTime() {
        return nomeTime;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    @Override
    public void apresentarse() {                                                          // 5
        System.out.println("Olá meu nome é " + getNome() + " sou do cla " + getCla() + " e meu time é " + this.nomeTime);
    }

}
```

1. A classe `AlunoNinja` extende(`extends`) a classe Ninja. Com isso herdando todos seus atributos e comportamentos
2. Construtor com parâmetros da classe AlunoNinja
3. Chamando o construtor com parâmetros da classe pai(Ninja)
4. A classe filha(AlunoNinja) pode ter seus próprios atributos e métodos
5. Podemos também sobrescrever na classe filha os comportamentos da classe pai.

---

### Pontos de Atenção⚠

1. **Acoplamento Forte:** A herança cria um forte acoplamento entre a classe base e suas subclasses. Modificações na classe base podem impactar diretamente todas as subclasses, dificultando a manutenção e aumentando a complexidade do código.

2. **Hierarquias Frágeis:** Hierarquias de herança muito profundas ou complexas podem se tornar difíceis de compreender e manter. A relação entre classes pode se tornar obscura, especialmente em sistemas extensos.

3. **Herança Indesejada:** Às vezes, ao herdar de uma classe para reutilizar apenas parte de seu comportamento, a subclasse também herda funcionalidades não desejadas. Isso pode levar a uma estrutura de classes confusa e classes filhas com funcionalidades não relacionadas.

4. **Dificuldade em Reutilizar em Novos Contextos:** Às vezes, a herança pode levar à dificuldade de reutilizar código em contextos diferentes, pois a estrutura hierárquica pode ser muito específica para um domínio de problema particular.

5. **Limitações de Herança Múltipla:** A herança múltipla (quando suportada(C++, python)) pode ser complexa e causar problemas de ambiguidade de herança, conflitos de nomes e dependências indesejadas.

6. **Rigidez na Evolução:** Mudanças na estrutura da classe base podem ter impacto em todas as subclasses. Isso pode tornar a evolução do sistema mais rígida, exigindo mais esforço para modificar ou estender a funcionalidade existente.

7. **Complexidade no Entendimento:** Uma hierarquia extensa de classes pode ser difícil de entender para novos desenvolvedores, especialmente se não for bem documentada.

💡**Dica**: É importante equilibrar o uso da herança com outros conceitos de programação orientada a objetos, como composição, interfaces e princípios SOLID. Esses princípios ajudam a mitigar os problemas associados à herança, permitindo um design mais flexível, modular e de fácil manutenção.
