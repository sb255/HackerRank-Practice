//https://www.hackerrank.com/challenges/java-bigdecimal/problem

        /*
         * Author: Samarth Bais
         * GitHub: github.com/sb255
         */

        //Write your code here
        //use n as the size of the String and ignore n+2
        String[] probString = new String[n];

        //create a new String as problem String, named probString
        for(int i=0; i<n; i++){
            probString[i] = new String(s[i]);
        }

        //Not using annoymous inner class and making a local class which implements Comparator
        class CompareBigDecimal implements Comparator<String> {
            @Override
                public int compare(String a, String b){
                BigDecimal aa = new BigDecimal(a);
                BigDecimal bb = new BigDecimal(b); 
                return aa.compareTo(bb); 
            }
        }

        Arrays.sort(probString, Collections.reverseOrder(new CompareBigDecimal())); 
        s = probString; 
