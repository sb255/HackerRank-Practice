//https://www.hackerrank.com/challenges/java-strings-introduction/problem

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        String AA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String BB = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println(A.length()+B.length());

        System.out.println(compareWords(A,B)); 

        System.out.println(AA+" "+BB);
        
    }
