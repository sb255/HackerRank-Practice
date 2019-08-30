// https://www.hackerrank.com/challenges/java-hashset/problem

    HashSet<String> hashSet = new HashSet<>(); 

    for(int i=0; i<t; i++){
        hashSet.add(pair_left[i]+" "+pair_right[i]);
        System.out.println(hashSet.size()); 
    }
