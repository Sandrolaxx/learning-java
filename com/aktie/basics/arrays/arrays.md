# Arrays🇺🇸

## Overview

They are used to be able to store a series of values in a simple and efficient way. First we need to understand what an array is, according to [Java documentation](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html), a array is an object that contains a fixed number of values of the same type. The elements of a array are indexed, which means that you can access any of them with their respective index.

We can consider that a array is a numbered list of cells (excel type) each cell with a variable. In Java, the array starts at 0.

We can create arrays of primitive types and objects, that is, we can create arrays of int, float, String and custom objects.

---

## Declaration

Now that we know what a Array is, we can then delve into its uses. Starting let's see how to declare this guy.

Example:

```java
int[] anArray;
```

or

```java
int anOtherArray[];
```

The first example is more widely used.

---

## Initialization

There are some ways to initialize a array, here we will see the two main ones, starting with the simplest way:

Example:

```java
int[] anArray = new int[10];
```

Here we declare the array and initialize it with 10 elements, which assumed the default value, in the case of int the number 0, in the case of `Object` it is `null`. Remembering that it is mandatory to define the size of the array.

The second way allows us to already set the values of the elements at initialization:

Example:

```java
int[] anArray = new int[] {1, 2, 3, 4, 5};
```

In this model, we don't need to set the size of the array, it sets automatically based on the number of elements.

---

## Accessing elements

We can access the element by informing its index in the array. In the example below, the number 10 will be printed in the log.

Example:

```java
anArray[0] = 10;

System.out.println(anArray[0]);
```

Notice how we are using index to access the element. The number between the square brackets is the specific position we want to access.

When the index is negative or goes beyond the amount of elements supported in the array, Java will throw an `ArrayIndexOutOfBoundException`.

---

## Iterating in Array

We can use the techniques presented in [doc](../loops/loops.md) about loops, accessing element by element can be quite laborious, for that it is necessary to use loops.

Example:

```java
int[] anArray = new int[] {1, 2, 3, 4, 5};

for (int i = 0; i < anArray.length; i++) {
     System.out.println(anArray[i]);
}
```

The example above will print the numbers from 1 to 5 on the console. Here we use the `length` property, it is a public property that gives us the size of the array.

Of course it is also possible to use other looping mechanisms like `while`, `do while`, Java collectios, it is also possible to iterate using `foreach`.

Example

```java
int[] anArray = new int[] {1, 2, 3, 4, 5};

for (int element : anArray) {
     System.out.println(element);
}
```

This second example is the same as the first, but with a code boilerplate in the indexes. `foreach` is a good choice when:<br/>

- We do not need to modify the array, as it is a local scope variable, it will not effectively change the array element.
- We don't need the index to do something.

---

## Varargs

We already understand the basic part of creating and manipulating arrays. Now let's dive in and talk about more advanced topics, starting with `varargs`. `varargs` allows us to pass an arbitrary amount of arguments to a method, for more details about `varargs` refer to [doc](https://www.baeldung.com/java-varargs) about.

Example:

```java
void varargsMethod(String... varargs) {}
```

The above method can receive from 0 to N Strings as an argument, under the hood it takes all the values passed by parameter and creates an array.

Example:

```java
String[] anArray = new String[] {"Milk", "Tomato", "Chips"};
varargsMethod(anArray);
```

Example above is the same as:

```java
varargsMethod("Milk", "Tomato", "Chips");
```

---

## Transforming Arrays into Lists

Okay arrays are cool, but most of the time we'll be working with lists, so let's look at ways to turn a array into a list.

The first and simplest way is to create an empty list and iterate through the array to add each element.

Example:

```java
int[] anArray = new int[] {1, 2, 3, 4, 5};

List<Integer> aList = new ArrayList<>();

for (int element : anArray) {
     aList.add(element);
}
```

The second form is more succinct:

```java
Integer[] anArray = new Integer[] {1, 2, 3, 4, 5};

List<Integer> aList = Arrays.asList(anArray);
```

The static method `Arrays.asList` uses `varargs` as an argument to create a list with the informed values. Unfortunately this model has some problems:

- Cannot be used with an array of primitive types
- It is not possible to add or remove elements from the created list, it returns a List of fixed size, however its data can be changed, unlike `List.of` which returns an unmodifiable list, in the case of `Arrays.asList` ** I can only change the values of existing positions**.

---

## Arrays to Streams

We managed to transform arrays into lists, but from Java 8 we have access to the Stream API and we want to transform our arrays into Stream. Java provides us with an `Array.stream` method for this.

Example:

```java
String[] anArray = new String[] {"Milk", "Tomato", "Chips"};

Stream<String> aStream = Arrays.stream(anArray);
```

When we pass a array Object to the method it returns a Stream of the referred type (Stream\<Integer> for a array of Integer). When we pass primitives it returns a Stream of primitives.

It is also possible to create a Stream from a subset of an array:

```java
Stream<String> anotherStream = Arrays.stream(anArray, 1, 3);
```

This will create a `Stream<String>` with just "Tomato" and "Chips", the first index of the method is inclusive and the second index is exclusive.

---

## Sorting Arrays

Now let's see how to order our array, that is, rearrange its elements in a certain order. The `Arrays` class provides a method called `sort`.

There are some overloads for `sort`:

- Primitive type arrays are sorted in ascending order.
- Object arrays (these objects need to implement the Comparable interface), they are naturally ordered, that is, whatever is implemented in the `compareTo` method of Comparable.

Something interesting is being able to sort elements in specific indices.

The algorithm behind the scenes are [quick sort](https://pt.wikipedia.org/wiki/Quicksort) and [merge sort](https://pt.wikipedia.org/wiki/Merge_sort) for primitives, respectively.

Examples about:

```java
int[] anArray = new int[] {5, 2, 1, 4, 8};
Arrays.sort(anArray); // anArray is now {1, 2, 4, 5, 8}

Integer[] anotherArray = new Integer[] {5, 2, 1, 4, 8};
Arrays.sort(anotherArray); // anotherArray is now {1, 2, 4, 5, 8}

String[] yetAnotherArray = new String[] {"A", "E", "Z", "B", "C"};
Arrays.sort(yetAnotherArray, 1, 3, Comparator.comparing(String::toString).reversed()); // yetAnotherArray is now {"A", "Z", "E", "B", "C"}
```

---

## Searching in a Array

To carry out a search is very simple, just loop the array and perform a Boolean expression to find the desired element.

Example:

```java
int[] anArray = new int[] {5, 2, 1, 4, 8};

for (int i = 0; i < anArray.length; i++) {
     if (anArray[i] == 4) {
         System.out.println("Found at index " + i);
         break;
     }
}
```

If you already have a sorted array, you can use [binary search](https://www.baeldung.com/java-binary-search) which is much more efficient.

Fortunately Java provides us with the `Arrays.binarySearch` method. We pass the array and the element we want to find.

In the case of a generic array, we also have to provide the Comparator that was used to sort the array in the first place. There is again the possibility to call the method on a subset of the array.

Example:

```java
int[] anArray = new int[] {1, 2, 3, 4, 5};

int index = Arrays.binarySearch(anArray, 4);

System.out.println("Found at index " + index);
```

In the example it returns us that the number 4 is in cell 4, this returns us the index 3. **Note that we used an already sorted array\***.

---

## Concatenating arrays

And finally, let's see how to concatenate two arrays. The idea is to create a array the size of two concatenated arrays. After that we add the elements of the first array and after that the second one.

```java
int[] anArray = new int[] {5, 2, 1, 4, 8};
int[] anotherArray = new int[] {10, 4, 9, 11, 2};

int[] resultArray = new int[anArray.length + anotherArray.length];

for (int i = 0; i < resultArray.length; i++) {
     resultArray[i] = (i < anArray.length ? anArray[i] : anotherArray[i - anArray.length]);
}
```

As we can see, while the index is smaller than the size of the first array we add the elements of this array, then we add the elements of the second. We can use the `Arrays.setAll` method to remove the need for the loop.

Example:

```java
int[] anArray = new int[] {5, 2, 1, 4, 8};
int[] anotherArray = new int[] {10, 4, 9, 11, 2};

int[] resultArray = new int[anArray.length + anotherArray.length];

Arrays.setAll(resultArray, i -> (i < anArray.length ? anArray[i] : anotherArray[i - anArray.length]));
```

This method will add all elements to the new array according to a function, the function associates the result with an index.

Here's a third option for merging arrays: System.arraycopy. This method takes a source array, a source position, a destination array, a destination position and an int defining the number of elements to be copied.

Example:

```java
System.arraycopy(anArray, 0, resultArray, 0, anArray.length);
System.arraycopy(anotherArray, 0, resultArray, anArray.length, anotherArray.length);
```

As we can see, we copy the first array, then the second (after the last element of the first).

---

<br/>

[Control Structures](../controlstructures/controlStructures.md)📝👈 Last content __________|__________Next content 📝👉[Loops](../loops/loops.md)

<br/>

Support Materials:

https://www.baeldung.com/java-arrays-guide
