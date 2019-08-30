//https://www.hackerrank.com/challenges/java-substring/problem

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        String ne = S.substring(start,end); 

        System.out.println(ne);
    }
