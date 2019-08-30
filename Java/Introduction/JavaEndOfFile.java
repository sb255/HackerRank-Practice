//https://www.hackerrank.com/challenges/java-end-of-file/problem

    public static void main(String[] args) {

        int i = 1; 

        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
            String input = sc.nextLine(); 
            System.out.println(i+" "+input);
            i++;
        }

    }
