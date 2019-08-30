// https://www.hackerrank.com/challenges/java-stdin-stdout/problem

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String i = scan.nextLine();
        String j = scan.nextLine();
        String k = scan.nextLine(); 

        int ii = Integer.parseInt(i); 
        double jj = Double.parseDouble(j);

        // Write your code here.

        System.out.println("String: " + k);
        System.out.println("Double: " + jj);
        System.out.println("Int: " + ii);
    }
