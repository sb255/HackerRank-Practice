//https://www.hackerrank.com/challenges/java-static-initializer-block/problem

//Write your code here
static boolean flag;
static int B; 
static int H;

//static initialization block
static {
    Scanner sc = new Scanner(System.in); 
    B = sc.nextInt(); 
    H = sc.nextInt(); 

    if(B>0 && H>0){
        flag = true;
    }
    
    else{
        System.out.print("java.lang.Exception: Breadth and height must be positive"); 
    }
