//https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        try{
            int x = sc.nextInt();
            int y = sc.nextInt(); 

            int result = x/y; 

            System.out.println(result); 
        }
        catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");  
        } 
        catch(Exception e){
            System.out.println(e);
        }
