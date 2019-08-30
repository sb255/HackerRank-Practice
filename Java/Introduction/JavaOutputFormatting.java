// https://www.hackerrank.com/challenges/java-output-formatting/problem

    public static void main(String[] args) throws Exception {
        
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            
                String s1=sc.next();
                int x=sc.nextInt();

                String s2=sc.next();
                int y=sc.nextInt();
                
                String s3=sc.next();
                int z=sc.nextInt();

                int xx=s1.length();
                System.out.print(s1);
                for(int a=0;a<15-xx;a++)
                System.out.print(" ");

                if(x==0)
                System.out.println("00"+x);
                else if(x>=100)
                System.out.println(x);
                else if(x<100)
                System.out.println("0"+x); 

        
                int yy=s2.length();
                System.out.print(s2);
                for(int b=0;b<15-yy;b++)
                System.out.print(" ");
                
                
                if(y==0)
                System.out.println("00"+y);
                else if(y>=100)
                System.out.println(y);
                else if(y<100)
                System.out.println("0"+y);


                int zz=s3.length();
                System.out.print(s3);
                for(int c=0;c<15-zz;c++)
                System.out.print(" ");
                

                if(z==0)
                System.out.println("00"+z);
                else if(z>=100)
                System.out.println(z);
                else if(z<100)
                System.out.println("0"+z);

            
            System.out.println("================================");

    }
