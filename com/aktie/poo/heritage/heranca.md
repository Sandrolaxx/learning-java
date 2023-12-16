# Herança🇧🇷

Claro, a herança é um dos pilares da programação orientada a objetos (POO) e permite a criação de novas classes baseadas em classes existentes, aproveitando e estendendo suas características. Aqui está um resumo conciso:

Ponto importantes:
* **Definição**: Herança é um conceito que permite que uma classe (chamada classe derivada ou subclasse) herde atributos e métodos de outra classe (chamada classe base, superclasse ou pai).

* **Relação de "é um"**: A relação entre as classes é frequentemente descrita como "é um". Por exemplo, se temos uma classe Animal, uma subclasse poderia ser Cachorro, porque um cachorro é um tipo de animal.

* **Reutilização de código**: A herança promove a reutilização de código, evitando a duplicação e permitindo que as classes compartilhem comportamentos e características comuns da classe base.

* **Membros herdados**: As classes derivadas herdam os atributos e métodos públicos e protegidos da classe base. Isso significa que a classe derivada pode acessar e utilizar esses membros.

* **Adição e Modificação**: Além de herdar membros da classe base, a classe derivada pode adicionar novos atributos e métodos ou modificar o comportamento dos métodos existentes (sobrescrevendo-os).

* **Palavras-chave**: A herança é implementada usando palavras-chave `extends`. Por exemplo: `class Subclasse extends Superclasse`.

* **Hierarquia de classes**: A herança permite a criação de hierarquias de classes, onde classes mais específicas (subclasses) herdam de classes mais genéricas (superclasses), criando uma estrutura organizada e orientada ao domínio do problema.

* **Polimorfismo**: A herança está intimamente ligada ao polimorfismo, onde objetos de subclasses podem ser tratados como objetos de sua superclasse. Isso permite que métodos comuns sejam chamados, mas com comportamentos diferentes, dependendo da implementação na subclasse.

A herança é um conceito poderoso na POO, permitindo a criação de hierarquias de classes, facilitando a reutilização de código e promovendo a extensibilidade e flexibilidade em sistemas complexos.

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
