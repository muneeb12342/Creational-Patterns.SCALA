# Creational-Patterns.SCALA
## Lazy Initialization
- A special case of lazy evaluation strategy
- It Initializes value/object on it's first access
- Lazy values can hold nulls
- They are thread safe

## Singleton
- It restricts the instantiation of a class to one object
- It provides the global point of access to it
- It uses the Lazy Initialization
- Singleton is always kept private instead of public

## Factory Method
- There are two types 
1. Factory Method
2. Abstract Factory

### Factory Method
- It provides the interface for creating an Object
- Subclasses will decide which class to instantiate
- It is very helpful tool in trying to move away from a sort of class explosion into a World Where we have a few key classes and we can use those key classes to instantiate with different properties
- It encapsulate class instantiation in a method

### Abstract Factory
- It is used when we have to create multiple objects
- There are multiple factories and multiple methods to create thaose objects
- e.g When we have two options in our mobile to change mobile theme to BLACK or change it to WHITE, there are two objects now.

