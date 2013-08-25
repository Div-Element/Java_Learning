package com.timethor.teaching.java.assignments.A02.Factorial;

import java.util.Scanner;

/**
 * ::::::::JOHN READ THIS::::::
 * READ ALL OF THE THINGS IN THE COMMENTS
 * I have created the functions and classes for you, you need to fill them
 * in with the assignments from the website I linked, here it is:
 * <p/>
 * A.1 Factorial
 * <p/>
 * Main quest: Write a program which takes a single argument, computes the
 * factorial iteratively and prints the value on the screen. I have done
 * the print part for you. Just fill in the MathHelper file!!
 * <p/>
 * Here are the first couple factorials so you can check your answers
 * Factorial(0) = 1
 * Factorial(1) = 1*1 = 1
 * Factorial(2) = 1*2 = 2
 * Factorial(3) = 2*3 = 6
 * Factorial(4) = 6*4 = 24
 * Factorial(5) = 24*5 = 120
 * Factorial(6) = 120*6 = 720
 * Factorial(7) = 720*7 = 5,040
 * As you can see it grows fast, here are the next few
 * Factorial(8) = 40,320
 * Factorial(9) = 362,880
 * Factorial(10) = 3,628,800
 * Extended Quest 1: Change the program so that it computes the factorial
 * recursively. Just fill in MathHelper.factorial_recursive.
 * <p/>
 * Extended Quest 2: Change the program so that it is interactive instead
 * of terminating after each computation.
 * Extended Quest 3: Fill in the factorial_X_lookup methods in MathHelper
 * <p/>
 * Really there are like 5 parts:
 * You can either do these in order or do part 5 first
 * <p/>
 * Part 1: Fill in factorial_iterative
 * Part 2: Fill in factorial_recursive
 * Part 3: Fill in factorial_iterative_lookup
 * Part 4: Fill in factorial_recursive_lookup
 * Part 5: Make the main method below into an interactive prompt with
 * `stop` as the keyword to quit out of the program
 * ========================================================================
 * BONUS INTRO: You might notice that if you do
 * fact(13) it will show 1,932,053,504
 * and then
 * fact(14) it will show 1,278,945,280
 * notice how it is lower? That is not good!! Fact(14) is 14 times bigger
 * than Fact(13), not smaller.
 * WHY IS THIS?
 * ------------
 * an `int` is only 32-bits big, with a max size of 2,147,483,647
 * see how close Fact(13) is?
 * <p/>
 * BONUS 1:
 * Convert all methods in MathHelper to return a `long`. You will have to
 * change some of the variable types inside the methods too, not just
 * change the return type.
 * <p/>
 * BONUS 2:
 * Find the max long value and the value that breaks long. you can try to
 * find this out manually by using your program or by writing a new method
 * in MathHelper to find it for you. Then protect your user by detecting
 * when they have input a value higher than the limit and let them know
 * they can't get a factorial for that value
 * ========================================================================
 * <p/>
 * @author Timethor
 */
public class Starter {

    /**
     * I am leaving this here so you can see how you are progressing
     * When you are done and enter a number, all four outputs should match
     * and it should ask for another number. Typing stop will make it quit.
     * <p/>
     * Adding the interactive part should be about an addition of 5-8 lines
     * <p/>
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter a number:  ");
        Scanner in = new Scanner(System.in);
        int fact = in.nextInt(), orial;
        // Go to the MathHelper file... notice they are all static methods
        // also notice that I did not have to do this:
        // MathHelper MH = new MathHelper();
        // MH.factorial...();
        // Static lets you call a function without creating a "new" Object
        orial = MathHelper.factorial_iterate(fact);
        System.out.println("Factorial_i (" + fact + ") = " + orial);

        orial = MathHelper.factorial_iterate_lookup(fact);
        System.out.println("Factorial_il(" + fact + ") = " + orial);

        orial = MathHelper.factorial_recursive(fact);
        System.out.println("Factorial_r (" + fact + ") = " + orial);

        orial = MathHelper.factorial_recursive_lookup(fact);
        System.out.println("Factorial_rl(" + fact + ") = " + orial);
    }
}
