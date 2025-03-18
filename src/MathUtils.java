// ****************************************************************
// MathUtils.java
//
// Provides static mathematical utility functions.
//
// ****************************************************************
public class MathUtils
{
    //-------------------------------------------------------------
    // Returns the factorial of the argument given
    // Throws IllegalArgumentException if n < 0 or > 20
    // Turned the int into a long to increase the factorial ceiling from 16 to 20.
    //-------------------------------------------------------------
    public static long factorial(int n)
    {
        if (n < 0)
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        if (n > 20)
            throw new IllegalArgumentException("Factorial cannot be calculated for numbers greater than 20 due to arithmetic overflow");

        long fac = 1;
        for (long i=n; i>0; i--)
            fac *= i;
        return fac;
    }
}
