// https://www.hackerrank.com/challenges/java-string-compare/problem

    public static String getSmallestAndLargest(String s, int k) {
        
        String smallest = s;
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        for(int i=0; i<s.length()-k+1; i++){
            String subs = s.substring(i, i+k);
            if(subs.compareTo(smallest)<0) smallest  = subs; 
            if(subs.compareTo(largest)>0) largest = subs; 
        }
        
        return smallest + "\n" + largest;
    }
