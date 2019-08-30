//https://www.hackerrank.com/challenges/java-exception-handling/problem

    /*
    * Create the method long power(int, int) here.
    */

    long power(int n, int p) throws Exception{
        
        if(n==0 && p==0) 
        throw new java.lang.Exception("n and p should not be zero.");

        else if(n<0 || p<0) 
        throw new java.lang.Exception("n or p should not be negative.");

        else return (long)java.lang.Math.pow(n,p); 
    }
