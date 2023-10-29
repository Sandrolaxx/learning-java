# Encapsulamento🇧🇷

É um dos quatro princípios fundamentais da programação orientada a objetos (POO), juntamente com abstração, herança e polimorfismo. 

Em Java, o encapsulamento é um conceito importante que visa proteger os atributos e métodos de uma classe, controlando o acesso a eles por meio de modificadores de acesso. 

O encapsulamento promove a segurança, manutenção e flexibilidade do código, ao mesmo tempo que oculta os detalhes internos da implementação de uma classe. Aqui estão os principais pontos sobre encapsulamento em Java:

### Modificadores de Acesso

Em Java, existem quatro modificadores de acesso que determinam o nível de visibilidade de membros de classe (atributos e métodos)

`public`: Membros públicos podem ser acessados de qualquer lugar.
`private`: Membros privados só podem ser acessados dentro da própria classe.
`protected`: Membros protegidos podem ser acessados dentro da própria classe e por subclasses.
`default` (sem modificador): Membros padrão só podem ser acessados por classes no mesmo pacote.

Atributos Privados:
Para encapsular atributos, é uma prática comum declará-los como privados (usando o modificador private). Isso impede que outros objetos acessem e modifiquem diretamente os atributos da classe.

```java
public class Ninja {
    
    private String nome;

    private String aldeia;
    
}
```

---

### Métodos Acessores (Getters e Setters)

Para permitir o acesso controlado aos atributos privados, são usados métodos acessores. Os métodos "getters" são usados para recuperar o valor de um atributo, e os métodos "setters" são usados para definir o valor de um atributo. Isso permite que você aplique lógica personalizada ou validação ao acesso aos atributos.

```java
public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}
```

---

### Vantagens do Encapsulamento:

- Controle de Acesso: O encapsulamento impede o acesso não autorizado e a modificação direta dos atributos de uma classe, mantendo a integridade dos dados.
- Flexibilidade: Você pode modificar a implementação interna de uma classe sem afetar o código que a utiliza, desde que os métodos acessores permaneçam consistentes.
- Manutenção: Facilita a manutenção do código, uma vez que você pode fazer alterações na classe sem afetar outros componentes do programa.
- Segurança: Ajuda a evitar erros e bugs causados por acesso direto a atributos.

Em resumo, o encapsulamento em Java é uma técnica que ajuda a criar classes mais robustas, seguras e flexíveis, permitindo controlar o acesso a seus membros e ocultar detalhes de implementação. É uma prática importante na programação orientada a objetos e é amplamente usada para criar código de alta qualidade.