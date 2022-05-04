package com.problem_statement16;

public class ClimbingStairs {
	 static int fib(int n)
	    {
	        if (n <= 1)
	            return n;
	        return fib(n - 1) + fib(n - 2);
	    }
	 
	    static int countWays(int s)
	    {
	        return fib(s + 1);
	    }
	 
	    public static void main(String args[])
	    {
	        int s = 2;
	        System.out.println("Number of ways = " + countWays(s));

	        int s1 = 3;
	        System.out.println("Number of ways = " + countWays(s1));
	    }
}

	      
	        
	    