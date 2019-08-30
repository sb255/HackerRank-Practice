//https://www.hackerrank.com/challenges/java-negative-subarray/problem

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        int count = 0, sum = 0;  
    
        for(int i=0; i<length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<length; i++){
            for(int j=i; j<length; j++){
                sum = sum + arr[j];

                if(sum<0)
                    count++; 

            }
            sum = 0; 
        }

        System.out.println(count);
        
    }
