//https://www.hackerrank.com/challenges/java-list/problem

/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        LinkedList<Integer> list = new LinkedList<>(); 

        Scanner sc = new Scanner(System.in); 
        int size = sc.nextInt(); 

        for(int i=0; i<size; i++){
            list.add(sc.nextInt());
        } 
        
        int numberOfQuery = sc.nextInt(); 

        for(int i=0; i<numberOfQuery; i++){

            String action = sc.next(); 

            if(action.equals("Insert")){
                int index = sc.nextInt();
                int value = sc.nextInt(); 
                list.add(index, value);
            }
            
            else if(action.equals("Delete")){
                int index = sc.nextInt(); 
                list.remove(index);
            }
                 
        }
         
        sc.close(); 

       for(int value : list){
           System.out.print(value+" "); 
       }
