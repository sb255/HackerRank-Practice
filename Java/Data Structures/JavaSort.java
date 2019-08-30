//https://www.hackerrank.com/challenges/java-sort/problem

Collections.sort(studentList,new CGPAComparator()); 

class CGPAComparator implements Comparator{  
    public int compare(Object o1,Object o2){  
        Student s1=(Student)o1;  
        Student s2=(Student)o2;  
  
        if(s1.cgpa==s2.cgpa)  
            return s1.fname.compareTo(s2.fname);   
        else if(s1.cgpa>s2.cgpa)  
            return -1;  
        else  
            return 1;  
    }   
}

 
class NameComparator implements Comparator{  
    public int compare(Object o1,Object o2){  
        Student s1=(Student)o1;  
        Student s2=(Student)o2;  
  
    return s1.fname.compareTo(s2.fname);  
    }  
} 
