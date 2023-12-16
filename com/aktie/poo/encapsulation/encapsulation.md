# Encapsulation🇺🇸

It is one of the four fundamental principles of object-oriented programming (OOP), along with abstraction, inheritance and polymorphism.

In Java, encapsulation is an important concept that aims to protect the attributes and methods of a class by controlling access to them through access modifiers.

Encapsulation promotes code security, maintainability, and flexibility while hiding the internal implementation details of a class. Here are the main points about encapsulation in Java:

### Access Modifiers

In Java, there are four access modifiers that determine the visibility level of class members (attributes and methods)

`public`: Public members can be accessed from anywhere.
`private`: Private members can only be accessed within the class itself.
`protected`: Protected members can be accessed within the class itself and by subclasses.
`default` (no modifier): Default members can only be accessed by classes in the same package.

Private Attributes:
To encapsulate attributes, it is common practice to declare them as private (using the private modifier). This prevents other objects from directly accessing and modifying the class's attributes.

```java
public class Ninja {
    
     private String name;

     private String village;
    
}
```

---

### Accessor Methods (Getters and Setters)

To allow controlled access to private attributes, accessor methods are used. "Getters" methods are used to retrieve the value of an attribute, and "setters" methods are used to set the value of an attribute. This allows you to apply custom logic or validation to attribute access.

```java
public String getName() {
     return name;
}

public void setName(String name) {
     this.name = name;
}
```

---

### Advantages of Encapsulation:

- Access Control: Encapsulation prevents unauthorized access and direct modification of a class's attributes, maintaining data integrity.
- Flexibility: You can modify the internal implementation of a class without affecting the code that uses it, as long as the accessor methods remain consistent.
- Maintenance: Makes code maintenance easier, since you can make changes to the class without affecting other components of the program.
- Security: Helps avoid errors and bugs caused by direct access to attributes.

In short, encapsulation in Java is a technique that helps create more robust, secure and flexible classes, allowing you to control access to their members and hide implementation details. It is an important practice in object-oriented programming and is widely used to create high-quality code.