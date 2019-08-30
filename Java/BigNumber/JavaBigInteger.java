//https://www.hackerrank.com/challenges/java-biginteger/problem

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        BigInteger v1 = new BigInteger(sc.nextLine());
        BigInteger v2 = new BigInteger(sc.nextLine());

        System.out.println(v1.add(v2));
        System.out.println(v1.multiply(v2));

    }
