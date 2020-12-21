# BUILDER DESIGN PATTERN

| Category | Use case |
|   ---    |      --- |
| Creational | Build complex objects |

## Theory
In real world application, it is required to have a hassle free approach to build complex objects.
</br><b>Example</b></br>
Lets consider that we gonna construct a car and the required props would be engine, tyre, mirror, type etc.,
</br></br>And doing so using constructor like
</br>
```java
new Car(Engine engine, String type, Mirror mirror, Tyre tyre) {
  ...
  ...
}
```
is quite complex so comes the <b>Builder Design Pattern</b>

## To do so,
* Use private constructor to restrict normal way of instantiating the class.
* Use nested class kinda `Builder` with appropriate constructor and methods to construct the object.
