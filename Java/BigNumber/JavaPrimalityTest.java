//https://www.hackerrank.com/challenges/java-primality-test/problem

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger x = new BigInteger(n);

        //If certainty is 1, it will check for prime and composite
        if(x.isProbablePrime(1))
            System.out.println("prime");
        
        else
            System.out.println("not prime");

        scanner.close();
    }
