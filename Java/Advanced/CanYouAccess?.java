//https://www.hackerrank.com/challenges/can-you-access/problem

            
            /*
             * Author: Samarth Bais
             * GitHub: github.com/sb255
             */

	    //Write your code here
            Solution.Inner ss = new Solution.Inner();
            o = ss.new Private(); 
            Solution.Inner.Private p = (Solution.Inner.Private) o; 

            String value = p.powerof2(num);

            if(value.equals("power of 2"))
                System.out.println(num+" is power of 2");

            else 
                System.out.println(num+" is not a power of 2");
