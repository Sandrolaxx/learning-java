# Classes and Objects🇺🇸

In java, classes are fundamental structures that used to model real-world objects and organize the software code. Classes serve as tamplate or blueprints for creating objects, which are specific instance of the class.

### Class definition

Class in Java is defined using the "class" keyword followed by the class name. Example:

```java
public class Ninja {
    // atributes, constructors and methods
}
```

---

### Attributes:

Attributes are variables that represent characteristics or properties of the object. They are declared inside the class and describe the state of the object. Example:

```java
public class Ninja {

    String name;

    String village;

}
```

---

### Methods

Methods are functions defined within a class that describe the behavior of objects in that class. They can be used to perform operations or perform actions on an object. For example:

```java
public void performJutso() {
        System.out.println(name + " perfomr jutso " + jutsoName);
    }
```

---

### Constructors

A constructor is a special method that is called when an object of the class is created. It is used to initialize the object's attributes. Example:

```java
public Ninja(String name, String village) {
    this.name = name;
    this.village = village;
}
```

---

### Objects

An object is an instance of a class. You can create objects from a class using the "new" operator. Remembering that the object takes up space in memory, while the class does not.

Example:

```java
Ninja ninja1 = new Ninja("Naruto", "Folha");

Ninja ninja2 = new Ninja("Sasuke", "Folha");
```
