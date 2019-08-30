// https://www.hackerrank.com/challenges/java-loops/problem

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt(); 
        int sum = 0; 

        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for(int j=0; j<n; j++){
                sum = sum + a + (int)Math.pow(2, j)*b;
            System.out.print(sum);
            System.out.print(" ");
            a = 0; 
            }
            sum = 0; 
            System.out.println("");
        }

        in.close();
    } 
