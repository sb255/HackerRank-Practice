// https://www.hackerrank.com/challenges/java-arraylist/problem

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList<ArrayList<Integer>> rows = new ArrayList<ArrayList<Integer>>();

        Scanner sc = new Scanner(System.in);
        int rounds = sc.nextInt(); 

        for(int i=0; i<rounds; i++){
            int loops = sc.nextInt(); 
            ArrayList<Integer> row = new ArrayList<Integer>(); 

            for(int j=0; j<loops; j++){
                row.add(sc.nextInt()); 
            }
            rows.add(row);  
        }

        int outputLoops = sc.nextInt(); 

        for(int i=0; i<outputLoops; i++){
            int rowNumber = sc.nextInt();
            int columnNumber = sc.nextInt(); 
            try{
               System.out.println(rows.get(rowNumber-1).get(columnNumber-1)); 
            }
            catch(Exception ArrayIndexOutOfBound){
                System.out.println("ERROR!"); 
            }
        }  
    }
