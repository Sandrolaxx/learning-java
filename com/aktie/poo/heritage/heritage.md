# Heritage🇺🇸

Inheritance is one of the pillars of object-oriented programming (OOP) and allows the creation of new classes based on existing classes, taking advantage of and extending their characteristics.

Important points:

- **Definition**: Inheritance is a concept that allows a class (called a derived class or subclass) to inherit attributes and methods from another class (called a base class, superclass or parent).

- **"is a" relationship**: The relationship between classes is often described as "is a". For example, if we have an Animal class, a subclass could be Dog, because a dog "is a" type of animal.

- **Code reuse**: Inheritance promotes code reuse, avoiding duplication and allowing classes to share common behaviors and characteristics of the base class.

- **Inherited members**: Derived classes inherit the public and protected attributes and methods of the base class. This means that the derived class can access and use these members.

- **Addition and Modification**: In addition to inheriting members from the base class, the derived class can add new attributes and methods or modify the behavior of existing methods (overriding them).

- **Keywords**: Inheritance is implemented using `extends` keywords. For example: `class Subclass extends Superclass`.

- **Class hierarchy**: Inheritance allows the creation of class hierarchies, where more specific classes (subclasses) inherit from more generic classes (superclasses), creating an organized structure oriented to the problem domain.

- **Polymorphism**: Inheritance is closely linked to polymorphism, where objects from subclasses can be treated as objects from their superclass. This allows common methods to be called, but with different behavior depending on the implementation in the subclass.

- **Access Modifiers:** In inheritance, access modifiers (such as `public`, `private` and `protected`) control the visibility of inherited members. For example, `private` members are not directly inherited, while `protected` is accessible by the derived class.

- **Static Methods and Attributes:** In some languages, such as Java, static methods are not inherited, as they belong to the class, not the instances. Static attributes are shared between the base class and its subclasses.

Inheritance is a powerful concept in OOP, allowing the creation of class hierarchies, facilitating code reuse and promoting extensibility and flexibility in complex systems.

---

### Practical use:

```java
public class NinjaStudent extends Ninja {                                                    // 1

     public NinjaStudent(String name, int age, String village, String cla, String equipment, // 2
         String nameJutso, String time, String teacherName) {
        super(name, age, village, clan, equipment, nameJutso);                               // 3

         this.teacherName = teacherName;                                                     // 4
         this.time =time;
}

    private String time;

     private String teacherName;

     public String getTime() {
         return time;
     }

     public String getTeacherName() {
         return teacherName;
     }

     @Override
     public void introduce() {                                                              // 5
         System.out.println("Hello, my name is " + getName() + " I'm from the cla " + getCla() + " and my team is " + this.time);
     }

}
```

1. The `NinjaStudent` class extends(`extends`) the Ninja class. With this, inheriting all its attributes and behaviors
2. Constructor with parameters from the NinjaStudent class
3. Calling the constructor with parameters from the parent class (Ninja)
4. The child class (NinjaStudent) can have its own attributes and methods
5. We can also override the behaviors of the parent class in the child class.

---

### Points of Attention⚠

1. **Tight Coupling:** Inheritance creates strong coupling between the base class and its subclasses. Modifications to the base class can directly impact all subclasses, making maintenance more difficult and increasing code complexity.

2. **Fragile Hierarchies:** Very deep or complex inheritance hierarchies can become difficult to understand and maintain. The relationship between classes can become unclear, especially in large systems.

3. **Unwanted Inheritance:** Sometimes, when inheriting from a class to reuse only part of its behavior, the subclass also inherits unwanted functionality. This can lead to a confusing class structure and child classes with unrelated functionality.

4. **Difficulty in Reusing in New Contexts:** Sometimes inheritance can lead to difficulty in reusing code in different contexts as the hierarchical structure can be very specific to a particular problem domain.

5. **Limitations of Multiple Inheritance:** Multiple inheritance (when supported (C++, python)) can be complex and cause problems of inheritance ambiguity, name conflicts, and unwanted dependencies.

6. **Rigidity in Evolution:** Changes in the structure of the base class can have an impact on all subclasses. This can make system evolution more rigid, requiring more effort to modify or extend existing functionality.

7. **Complexity in Understanding:** An extensive class hierarchy can be difficult to understand for new developers, especially if it is not well documented.

💡**Tip**: It is important to balance the use of inheritance with other object-oriented programming concepts, such as composition, interfaces and SOLID principles. These principles help mitigate the problems associated with inheritance, allowing for a more flexible, modular, and maintainable design.
