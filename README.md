# java-design-patterns and design principles

A Guide to learn these concepts:

The SOLID principles were introduced by Robert C. Martin in his 2000 paper “Design Principles and Design Patterns.” These concepts were later built upon by Michael Feathers, who introduced us to the SOLID acronym. And in the last 20 years, these five principles have revolutionized the world of object-oriented programming, changing the way that we write software.

So, what is SOLID and how does it help us write better code? Simply put, Martin and Feathers’ design principles encourage us to create more maintainable, understandable, and flexible software. Consequently, as our applications grow in size, we can reduce their complexity and save ourselves a lot of headaches further down the road!

The following five concepts make up our SOLID principles:

    Single Responsibility
    Open/Closed
    Liskov Substitution
    Interface Segregation
    Dependency Inversion

While these concepts may seem daunting, they can be easily understood with some simple code examples. In the following sections, we’ll take a deep dive into these principles, with a quick Java example to illustrate each one.

Single Responsibility

Let’s begin with the single responsibility principle. As we might expect, this principle states that a class should only have one responsibility. Furthermore, it should only have one reason to change.

How does this principle help us to build better software? Let’s see a few of its benefits:

    Testing – A class with one responsibility will have far fewer test cases.
    Lower coupling – Less functionality in a single class will have fewer dependencies.
    Organization – Smaller, well-organized classes are easier to search than monolithic ones.


Open for Extension, Closed for Modification

It’s now time for the O in SOLID, known as the open-closed principle. Simply put, classes should be open for extension but closed for modification. In doing so, we stop ourselves from modifying existing code and causing potential new bugs in an otherwise happy application.

Of course, the one exception to the rule is when fixing bugs in existing code.


Liskov Substitution

Next on our list is Liskov substitution, which is arguably the most complex of the five principles. Simply put, if class A is a subtype of class B, we should be able to replace B with A without disrupting the behavior of our program.

Interface Segregation

The I  in SOLID stands for interface segregation, and it simply means that larger interfaces should be split into smaller ones. By doing so, we can ensure that implementing classes only need to be concerned about the methods that are of interest to them.


Dependency Inversion

The principle of dependency inversion refers to the decoupling of software modules. This way, instead of high-level modules depending on low-level modules, both will depend on abstractions.



