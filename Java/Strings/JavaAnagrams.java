//https://www.hackerrank.com/challenges/java-anagrams/problem

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int aLength = a.length();
        int bLength = b.length(); 
        a = a.toLowerCase(); 
        b = b.toLowerCase();  
        StringBuilder t2 = new StringBuilder(b);  

        for(int i=0; i<aLength; i++){
            for(int j=0; j<t2.length(); j++){
                if(a.charAt(i)==t2.charAt(j)){
                    t2.deleteCharAt(j);
                      break;
                }
            }
        }

        if(t2.length()==0 && aLength==bLength)
            return true; 

        else
            return false; 
    }

