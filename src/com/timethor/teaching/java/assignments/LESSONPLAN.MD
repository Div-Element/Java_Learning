## Lesson Plan

### How Assignments and Lessons are labeled

| Type | Marker |
|------|:------:|
|Assignments |A|
|Lessons     |L|
|Completed   |C|
|Proposed    |P|

Examples: <br />
L01C - Lesson #01, Completed <br />
A23C - Assignment #23, Completed <br />
L00P - Proposed Lesson with no assigned number <br />
A00P - Proposed Assignment with no assigned number

- - -
#### TODO ###
* Add prerequisites to title pages
* Possibly make a graph showing assignment dependencies

- - - 

### Elementary ####
- - -
L01P - Java Basics and Concepts
* Topic: Objects and Behaviors => Classes and Methods - How do you make and use them?
* Topic: Data Types - What are they? Why does Java have them?
* Topic: Variables - Declarations and Definitions. Assignment methods.
* Topic: Basic Operators - ( + - * / && || ! == != -- ++)
* Topic: Expressions, Statements, Blocks - What are they? How do I use them?
* Topic: Control Flow statements
  * if, elseif, else
  * switch
  * do, while
  * for
* Branching statements - break, continue, return

- - -
A01C - Hello World with different methods of output
* Addition: Output wrapping, pick a # of chars for a line, wrap at the end, insert a dash (-) if a word is broken
* Topics: Output 
* Addition Topics: Strings

- - -
A02C - Write a program that asks the user for his/her name and greets him/her with that name with different input methods
* Addition - Modify to greet only alice and bob
* Topics: Input, Output
* Addition Topics: Control Flow(If)

- - -
A00P - Write a program directory that will allow you to pick from previous and future assignments to run them
* Topics: Input/Output, 

- - -
A00P - Write a program that asks the user for a number n and prints the sum of numbers 1 to n
* Addition - only multiples of three and five are considered in the sum. i.e. 3,5,9,15 for n=17
* Addition - that asks the user for a number n and gives him the possibility to choose between sum or product of 1 to n
* Topics: I/O, Control Flow(for, do, while)
* Addition Topics: Control Flow(If, switch)

- - -
A00P - ... that prints a multiplication table for numbers up to 12
* Addition - Rather than using 0-12 as the x,y bounds, take 4 inputs, x-start, x-end, y-start, y-end. 
* Topics: I/O Formatting, Arrays, Control Flow(for, do, while)

- - -
A00P - ... that prints x number of prime numbers, where x is a number input by the user
* Addition - Improve the program to use a lookup table?
* Addition - Improve the program by using a more efficient method, try using a prime sieve
* Topics: Caching, Collections, Control Flow, Algorithm translation

- - -
A00P - Write a guessing game where the user has to guess a secret number. After every guess the program tells the user whether his numbeer was too small or large. At the end the number of tries needed should be printed. It counts only as one try if the user inputs the same number consecutively.

- - -
A00P - ... that computes and prints the next 20 leap years from an input year
    
- - -
A00P - ... that computes \[4\cdot\sum_{k=1}^{10^6}\frac{(-1)^{k+1}}{2k-1}.\]
    Topics: Input, Parsing
- - -
A00P - Write a welcome prompt that lets you select any of the programs you have written so far. Upon the program asking, make it default to the current project you are working on. Keep it up to date as you complete assignments

### Strings, Arrays, Lists & other Collections ####
- - -
A00P - A function that returns the largest element in a list, array, collection
- - -
A00P - A function that reverses a list, array, colletion ( preferably in-place )
- - -
A00P - checks whether an element occurs in a list - Contains()
- - -
A00P - returns the elements on odd positions in a list
- - -
A00P - computes the running total of a list, array, collection
- - -
A00P - tests whether a string is a palindrome
- - -
A00P - three functions that compute sum of numbers in a list using a for loop, while loop, and recursion
- - -
A00P - on_all, that applies a function to every element of a list. Use it to print the first 20 perfect squares.
- - -
A00P - concatenates two or more lists
- - -
A00P - combines two lists by interleaving them [a,b,c] [1,2,3] -> [a,1,b,2,c,3]
- - -
A00P - merges two sorted lists into a new sorted list
- - -
A00P - computes the first 100 fibonacci numbers
- - -
A00P - takes a number and returns a list of its digits, then do it sorted
- - -
A00P - add, subtract, and multiply two numbers in their digit-list representation (and return a new digit list). If you're ambitious implement Karatsuba multiplication
- - -
A00P - program that implements sorting algorithms. Selection sort, Insertion sort, merge sort, quick sort, stooge sort, bubble sort.
- - -
A00P - Binary searching
- - -
A00P - that takes a list of strings and outputs them to the console in a frame of *'s
- - -
A00P - Pig latin to english, english to pig latin
    
### Intermediate ####
- - -
A00P - outputs all possibilities to put a plus, minus, or nothing between the numbers 1 -> 9 such that the result adds to 100, 1+2+3-4+5+6+78+9=100
- - -
A00P - takes a fraction number of days for a planet and output a leap-year rule that minimizes the difference in the planet's solar year.
- - -
A00P - data structure for graphs that allows modification (insertion, deletion). It should be possible to store values at edges and nodes. May be easier to use a dictionary of (node, edgelist) to do this.
- - -
A00P - function that generates a DOT representation of a graph
- - -
A00P - automatically generates essays for you. 
    A.) Using a sample text, create a directed (multi-)graph where the words of a text are nodes and there is a directed edge between u and v if u is followed by v in your sample text. Multiple occurances lead to multiple edges. 
    B.) Do a random walk of the graph: Starting from an arbitrary node choose a random successor. If no successor exists, choose another random node.
- - -
A00P - that automatically converts english text to morse code and vice versa
- - -
A00P - that finds the longest palindromic substring of a given string. try to be as efficient as possible.

### Advanced ####
- - -
A00P - two strings, find longest common subsequence
- - -
A00P - array of numbers, program efficiently answers queries of the form: "Which is the nearest larger value for the number at position i?, where distance is the difference in array index
- - -
A00P - two strings, outputs the shortest sequence of character insertions and deletions that turn one string into the other
- - -
A00P - multiplies two matrixes together. Make it as efficient as you can and compare the performance to a polished linear algebra library. You might want to read about Strassen's Algorithm and the effects CPU caches have. Try different matrix layouts and see what happens..
- - -
A00P - given a set of n-dimensional rectangular boxes, write a program that computes the volume of their union. Start with 2D and work your way up.
- - -
A00P - sudoku solver

### GUI ####
- - -
A00P - program that displays a bouncing ball
- - -
A00P - memory game n by m tiles
- - -
A00P - a tetris clone
    
### Open ended ####
- - -
A00P - program that plays hangman as well as possible. you could use a large dictionary and select the letter that excludes most words that are still possible solutions. Try to make it efficient. dont scan the whole dictionary in every turn
- - -
A00P - Rock, paper, scissors that plays better than a human. Try to expliot that humans are very bad at generating random numbers.
- - -
A00P - battle ship agains human opponents. It takes coordinates as input and outputs whether that was a hit or not and it's own shot's coordinates
