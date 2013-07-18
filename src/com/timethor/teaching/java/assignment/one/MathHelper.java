package com.timethor.teaching.java.assignment.one;

import java.util.HashMap;
import java.util.Map;

/**
 * ::::::::::JOHN READ THIS::::::::::::::
 * The FACTORIAL Function
 * ---------------------------------------------
 * Examples:
 * ---------------------------------------------
 * 3! (three factorial) = 3*2*1<br/>
 * 4! (four factorial) = 4*3*2*1<br/>
 * also<br/>
 * 4! (four factorial) = 4*3!<br/>
 * because 3! =            3*2*1<br/>
 * see how it matches up?<br/>
 * So you can compute a factorial as<br/>
 * fact(4) = fact(3)*4<br/>
 * or in general<br/>
 * fact(x) = fact(x-1)*x<br/>
 * <p/>
 * @author Timethor
 */
public class MathHelper {

    // Dont worry about this until part 3 and 4
    // This is a map:<br/>
    // The first Integer in <Int, Int> is the value
    // The second Integer in <Int, Int> is the factorial(value)    
    private static final Map<Integer, Integer> lookup = new HashMap<>();

    // Same with this, they are initial values for the lookup table
    static {
        // Factorial of (zero = 1)
        lookup.put(0, 1);
        // Factorial of (one = 1)
        lookup.put(1, 1);
        // If you think adding something here will help you dont be afraid 
        // but I didnt need to add anything other than what is here
    }

    /**
     * Lines of Code<br/>
     * Shortest: 3<br/>
     * Target: 5-7
     * <p/>
     * This method calculates the factorial with a `for` loop
     * for (int i = 1; value >= i; i++) or something like this
     * <p/>
     * @param value the value you want the factorial of
     * <p/>
     * @return factorial of value
     */
    public static int factorial_iterate(int value) {
        return 0;
    }

    /**
     * Lines of Code<br/>
     * Shortest: 1<br/>
     * Target: 4-8
     * <p/>
     * This can be done in a single line to give you an idea of how
     * simple it is. Aim for about 8 lines or less.
     * <p/>
     * Essentially, factorial of zero and one = 1; for everything else:
     * fact(value) = fact(value-1)*value;
     * So, the factorial of (value)
     * is the factorial of (value minus one)
     * times (value)
     * look at the :::READ THIS JOHN::: section if that is confusing
     * <p/>
     * @param value the value you want the factorial of
     * <p/>
     * @return factorial of value
     */
    public static int factorial_recursive(int value) {
        return 0;
    }

    /**
     * Lines of Code<br/>
     * Shortest: 7<br/>
     * Target: less than 20
     * <p/>
     * This method calculates the factorial with for loops
     * for (int i = value; i > value; i--) or something like this
     * Dont worry about lookup here
     * <p/>
     * @param value the value you want the factorial of
     * <p/>
     * @return factorial of value
     */
    public static int factorial_iterate_lookup(int value) {
        return 0;
    }

    /**
     * Lines of Code<br/>
     * Shortest: 3<br/>
     * Target: less than 15
     * <p/>
     * This can be done in three lines to give an idea of how simple
     * it can be. You should try for 20ish lines of code or less
     * <p/>
     * Essentially it is the same as before except you want to first try to
     * lookup the value: lookup.containsKey(value)
     * and then if it isn't there set it to (value-1)! * value like:
     * factorial_recursive_lookup(value-1)*value
     * you can add things to a map by using lookup.put(value,value!)
     * <p/>
     * @param value the value you want the factorial of
     * <p/>
     * @return factorial of value
     */
    public static int factorial_recursive_lookup(int value) {
        return 0;
    }
}
