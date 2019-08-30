//https://www.hackerrank.com/challenges/java-bitset/problem

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt(); 
        int a2 = sc.nextInt(); 

        //creating BitSet objects
        BitSet b1 = new BitSet(a1);
        BitSet b2 = new BitSet(a2);

        while(sc.hasNext()){

            String operation = sc.next();
            int set1 = sc.nextInt(); 
            int set2 = sc.nextInt();

            if(operation.equals("AND")){
                if(set1==1)
                    b1.and(b2); 
                
                else
                    b2.and(b1); 
                //cardinality() returns the number of set bit in a bitset
                System.out.println(b1.cardinality()+" "+b2.cardinality()); 
            }

            if(operation.equals("OR")){
                if(set1==1)
                    b1.or(b2); 
                
                else
                    b2.or(b1); 

                System.out.println(b1.cardinality()+" "+b2.cardinality()); 
            }

            if(operation.equals("XOR")){
                if(set1==1)
                    b1.xor(b2); 
                
                else
                    b2.xor(b1); 

                System.out.println(b1.cardinality()+" "+b2.cardinality()); 
            }

            if(operation.equals("FLIP")){
                if(set1==1)
                    b1.flip(set2); 
                
                else
                    b2.flip(set2); 

                System.out.println(b1.cardinality()+" "+b2.cardinality()); 
            }

            if(operation.equals("SET")){
                if(set1==1)
                    b1.set(set2); 
                
                else
                    b2.set(set2); 

                System.out.println(b1.cardinality()+" "+b2.cardinality()); 
            }

        } 
        
    }
