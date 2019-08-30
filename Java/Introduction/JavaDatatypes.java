// https://www.hackerrank.com/challenges/java-datatypes/problem

        //unsigned Integers can hold only the postive value
        //signed Integers can hold both postive and negative values

            try{   
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                //The range of short data type is -2^15 to 2^15-1
                if(x>=-Math.pow(2,15) && x<=Math.pow(2,15)-1)System.out.println("* short");
                //The range of int data type is -2^31 to 2^31-1
                if(x>=-Math.pow(2,31) && x<=Math.pow(2,31)-1)System.out.println("* int");      
                //The range of long data type is -2^63 to 2^63-1   
                if((x>=-Math.pow(2,63)) && (x<=Math.pow(2,63)-1))System.out.println("* long"); 
            }
            catch(Exception e){
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
