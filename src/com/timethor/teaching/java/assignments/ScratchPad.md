TODO:: Add prerequisites to title pages
TODO:: Possibly make a graph showing assignment dependencies

Elementary:
    A01 - Hello World with different methods of output
        Topics: Output
    A02 - Write a program that asks the user for his/her name and greets him/her with that name with different input methods
        Addition - Modify to greet only alice and bob
        Topics: 
    A03 - Write a program that asks the user for a number n and prints the sum of numbers 1 to n
        Addition - only multiples of three and five are considered in the sum. i.e. 3,5,9,15 for n=17
        Addition - that asks the user for a number n and gives his the possibility to choose between sum or product of 1 to n
    A02 - ... that prints a multiplication table for numbers up to 12
    A03 - ... that prints all prime numbers (until a button is pressed?)
    A05 - Write a guessing game where the user has to guess a secret number. After every guess the program tells the user whether his numbeer was too small or large. At the end the number of tries needed should be printed. It counts only as one try if the user inputs the same number consecutively.
    A03 - ... that computes and prints the next 20 leap years from an input year
    B04 - ... that computes \[4\cdot\sum_{k=1}^{10^6}\frac{(-1)^{k+1}}{2k-1}.\]
    
    A05 - Write a welcome prompt that lets you select any of the programs you have written so far. Upon the program asking, make it default to the current project you are working on. Keep it up to date as you complete assignments
Lists, Strings:
    A02 - A function that returns the largest element in a list, array, collection
    B04 - A function that reverses a list, array, colletion ( preferably in-place )
    B02... checks whether an element occurs in a list - Contains()
    B03... returns the elements on odd positions in a list
    ... computes the running total of a list, array, collection
    ... tests whether a string is a palindrome
    ... three functions that compute sum of numbers in a list using a for loop, while loop, and recursion
    ... on_all, that applies a function to every element of a list. Use it to print the first 20 perfect squares.
    ... concatenates two or more lists
    ... combines two lists by interleaving them [a,b,c] [1,2,3] -> [a,1,b,2,c,3]
    ... merges two sorted lists into a new sorted list
    ... computes the first 100 fibonacci numbers
    ... takes a number and returns a list of its digits, then do it sorted
    ... add, subtract, and multiply two numbers in their digit-list representation (and return a new digit list). If you're ambitious implement Karatsuba multiplication
    program that implements sorting algorithms. Selection sort, Insertion sort, merge sort, quick sort, stooge sort, bubble sort.
    Binary searching
    ... that takes a list of strings and outputs them to the console in a frame of *'s
    Pig latin to english, english to pig latin
    
Intermediate:
    ... outputs all possibilities to put a plus, minus, or nothing between the numbers 1 -> 9 such that the result adds to 100, 1+2+3-4+5+6+78+9=100
    ... takes a fraction number of days for a planet and output a leap-year rule that minimizes the difference in the planet's solar year.
    ... data structure for graphs that allows modification (insertion, deletion). It should be possible to store values at edges and nodes. May be easier to use a dictionary of (node, edgelist) to do this.
    ... function that generates a DOT representation of a graph
    ... automatically generates essays for you. 
        A.) Using a sample text, create a directed (multi-)graph where the words of a text are nodes and there is a directed edge between u and v if u is followed by v in your sample text. Multiple occurances lead to multiple edges. 
        B.) Do a random walk of the graph: Starting from an arbitrary node choose a random successor. If no successor exists, choose another random node.
    ... that automatically converts english text to morse code and vice versa
    ... that finds the longest palindromic substring of a given string. try to be as efficient as possible.
    
    
Advanced:
    ... two strings, find longest common subsequence
    ... array of numbers, program efficiently answers queries of the form: "Which is the nearest larger value for the number at position i?, where distance is the difference in array index
    ... two strings, outputs the shortest sequence of character insertions and deletions that turn one string into the other
    ... multiplies two matrixes together. Make it as efficient as you can and compare the performance to a polished linear algebra library. You might want to read about Strassen's Algorithm and the effects CPU caches have. Try different matrix layouts and see what happens..
    ... given a set of n-dimensional rectangular boxes, write a program that computes the volume of their union. Start with 2D and work your way up.
    ... sudoku solver

GUI:
    ... program that displays a bouncing ball
    ... memory game n by m tiles
    ... a tetris clone
    
Open ended:
    ... program that plays hangman as well as possible. you could use a large dictionary and select the letter that excludes most words that are still possible solutions. Try to make it efficient. dont scan the whole dictionary in every turn
    Rock, paper, scissors that plays better than a human. Try to expliot that humans are very bad at generating random numbers.
    battle ship agains human opponents. It takes coordinates as input and outputs whether that was a hit or not and it's own shot's coordinates