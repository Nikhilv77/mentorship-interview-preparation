# Mentorship Interview Preparation Notes

This repository is structured as topic-wise practice for Data Structures and Core Java. Each section contains problems solved along with the underlying concepts they reinforce.

---

## Prerequisites (Core Java Basics)

Topics that must be clear before starting:

* Variables and Primitive Data Types
* Strings (immutability, basic operations)
* Control Flow (if/else, switch)
* Loops (for, while)
* Methods (parameters, return values)

---

## Pre-Read Concepts (OOP Foundation)

Conceptual understanding required before OOP implementation:

* Difference between Procedural and Object-Oriented Programming
* State vs Behavior
* Class vs Object
* Access Modifiers (public, private)

---

## Post-Read Concepts (Advanced Java Understanding)

* Stack vs Heap Memory
* Pass-by-Value in Java
* static keyword
* Abstract Classes vs Interfaces

---

## DSA Practice

### Arrays

Problems solved:

1. Two Sum
2. Running Sum of 1D Array
3. Richest Customer Wealth
4. Build Array from Permutation

Key questions to revise:

* When should HashMap be used in arrays?
* How to reduce time complexity from O(n²) to O(n)?
* What is the tradeoff between space and time in Two Sum?

Concepts covered:

* Prefix sum
* Index mapping
* Basic iteration patterns

---

### Strings

Problems solved:

1. Valid Palindrome
2. Reverse String
3. Fizz Buzz
4. Length of Last Word

Key questions:

* How to handle alphanumeric filtering in strings?
* Difference between String and StringBuilder?
* When to use two pointers?

Concepts:

* Two pointer technique
* String traversal
* Character manipulation

---

### Hashing

Problems solved:

1. Contains Duplicate
2. Valid Anagram
3. First Unique Character in a String
4. Ransom Note

Key questions:

* Why is HashMap preferred over nested loops?
* Difference between HashMap and HashSet use cases?
* How to count frequency efficiently?

Concepts:

* Frequency counting
* Constant time lookup
* Tradeoff: extra space for faster access

---

### Stack

Problems solved:

1. Valid Parentheses
2. Baseball Game
3. Remove All Adjacent Duplicates in String
4. Backspace String Compare

Key questions:

* When should a stack be used?
* How does LIFO help in string problems?
* How to simulate undo operations using stack?

Concepts:

* LIFO structure
* Stack simulation problems
* String + stack combination

---

### Linked List

Problems solved:

1. Reverse Linked List
2. Merge Two Sorted Lists
3. Remove Duplicates from Sorted List
4. Linked List Cycle

Key questions:

* Difference between iterative and recursive reversal?
* How does fast and slow pointer detect cycles?
* Why are linked lists preferred over arrays in some cases?

Concepts:

* Pointer manipulation
* Two-pointer technique
* Linked list traversal

---

## OOP Practice

### Classes & Objects

Implementation:

* Player class with:

  * username
  * level (default = 1)
  * health (default = 100)

Questions:

* What is the difference between class and object?
* What is constructor initialization?
* Why avoid hardcoding values inside methods?

---

### Encapsulation

Implementation:

* BankAccount class
* Private balance field
* Public methods:

  * deposit()
  * withdraw()

Validation:

* Reject negative deposits
* Prevent overdrawing

Questions:

* Why should fields be private?
* How does encapsulation improve security?
* What is controlled access?

---

### Inheritance

Implementation:

* Base class: Employee
* Child classes:

  * Developer
  * Manager

Questions:

* What does "extends" mean?
* Why use super() keyword?
* When should inheritance be used instead of duplication?

Concepts:

* Code reuse
* Parent-child relationship
* Method overriding

---

### Polymorphism

Implementation:

* Base class: SmartDevice
* Child classes:

  * SmartLight
  * SmartSpeaker

Behavior:

* Override turnOn() method
* Store objects in parent reference array

Questions:

* What is runtime polymorphism?
* How does method overriding work?
* Why use parent reference for child objects?

Concepts:

* Dynamic method dispatch
* Flexibility in design
* Extensibility

---

## Notes for Revision

* Prefer solving problems by pattern, not by memorization
* Always analyze time and space complexity
* Focus on writing clean and readable code
* Revisit problems after a gap

---
