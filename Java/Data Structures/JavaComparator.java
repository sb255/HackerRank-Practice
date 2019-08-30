//https://www.hackerrank.com/challenges/java-comparator/problem

/*
 * Author: Samarth Bais
 * GitHub: github.com/sb255
 */

// Write your Checker class here
class Checker implements Comparator{

    public int compare(Object a, Object b){
        Player aa = (Player) a; 
        Player bb = (Player) b; 

        if(aa.score>bb.score)
            return -1; 
        
        else if(aa.score==bb.score)
            return aa.name.compareTo(bb.name); 
        
        else
            return 1; 
    }

}
