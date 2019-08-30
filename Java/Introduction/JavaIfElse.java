// https://www.hackerrank.com/challenges/java-if-else/problem

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(N%2!=0)
        System.out.println("Weird");

        if(N%2==0 && N>=2 && N<=5)
        System.out.println("Not Weird");


        if(N%2==0 && N>=6 && N<=20)
        System.out.println("Weird");


        if(N%2==0 && N>20)
        System.out.println("Not Weird");

        scanner.close();
    }
