//https://www.hackerrank.com/challenges/prime-checker/problem

import static java.lang.System.in;

class Prime {
    void checkPrime(int ... args){ 
        for(int i : args){
            BigInteger val = new BigInteger(String.valueOf(i));

            if(val.isProbablePrime(1))
                System.out.print(i+" "); 
        }
        System.out.println("");
    }
}

