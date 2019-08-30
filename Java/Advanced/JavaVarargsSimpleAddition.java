//https://www.hackerrank.com/challenges/simple-addition-varargs/problem

class Add{

    public void add(int a, int b){
        System.out.println(a+"+"+b+"="+(a+b));
    }

    public void add(int a, int b, int c){
      System.out.println(a+"+"+b+"+"+c+"="+(a+b+c));
    }

    public void add(int a, int b, int c, int d, int e){
      System.out.println(a+"+"+b+"+"+c+"+"+d+"+"+e+"="+(a+b+c+d+e));
    }

    public void add(int a, int b, int c, int d, int e, int f){
        System.out.println(a+"+"+b+"+"+c+"+"+d+"+"+e+"+"+f+"="+(a+b+c+d+e+f));
    }

}
