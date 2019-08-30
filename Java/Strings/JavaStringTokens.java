//https://www.hackerrank.com/challenges/java-string-tokens/problem

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        int count = 0;

        if(s.equals(""))
            System.out.println(0);

        else{
            for(String x : s.split("[ !,?._'@]+")){
                count++;
            }

            System.out.println(count);

            for(String x : s.split("[ !,?._'@]+")){
                System.out.println(x);
            }
        }
        
        scan.close();
    }
