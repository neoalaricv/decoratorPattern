# Module Objectives

Understand the purpose and benefits of the Decorator Pattern.
Implement the Decorator Pattern using interfaces and/or abstract classes in Java.
Evaluate Decorator Pattern implementations and propose solutions to potential issues.

# Decorator Pattern
The Decorator Pattern is a design pattern that allows the behavior of an object to be extended dynamically, without the need to change its source code. It is a structural pattern that involves wrapping an object in another object, which has the same interface as the original object but adds or modifies its behavior.

The key elements of the Decorator Pattern include:

1. Component Interface: This is the base interface that all concrete components and decorators implement. It declares the methods that are common to all components and decorators.

2. Concrete Component: This is the concrete class that implements the component interface. It provides the basic functionality that can be decorated.

3. Decorator Interface: This is the base interface that all concrete decorators implement. It extends the component interface and declares additional methods that are used to modify the behavior of the component.

4. Concrete Decorator: This is the concrete class that implements the decorator interface. It wraps a component and adds additional behavior to it.

In Java, the Decorator Pattern is typically implemented using inheritance and composition. The Component interface is usually an interface, while the Concrete Component and Decorator classes are typically implemented as concrete classes. The Concrete Decorator classes are also implemented as concrete classes that extend the Decorator class.

# A Working Example

a.Component Interface: Car interface

The Component Interface defines the methods that all Concrete Components and Decorators must implement. In this example, the Car interface defines the assemble() method, which all cars must implement.

b.Concrete Component: BasicCar class

A Concrete Component is the basic implementation of the Component Interface. In this example, the BasicCar class is the Concrete Component, which implements the Car interface and provides a basic implementation of the assemble() method.

c.Decorator Interface: CarDecorator interface

The Decorator Interface extends the Component Interface and defines additional methods that all Concrete Decorators must implement. In this example, the CarDecorator interface extends the Car interface and adds the setCar() method.

d.Concrete Decorators: CarWithAC and CarWithGPS classes

A Concrete Decorator is a class that implements the Decorator Interface and adds functionality to the Component it decorates. In this example, the CarWithAC and CarWithGPS classes are Concrete Decorators that add functionality to the BasicCar Component. They both implement the CarDecorator interface and add the setCar() method to set the Component they will decorate. They also override the assemble() method of the Component to add their specific functionality (AC and GPS).
