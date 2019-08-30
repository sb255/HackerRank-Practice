//https://www.hackerrank.com/challenges/java-2d-array/problem

        int sum=Integer.MIN_VALUE, total=0;

        for(int height=0; height<arr.length+1-3;height++){
            for(int width=0; width<arr.length+1-3; width++){
                for(int i=height; i<height+3; i++){
                    for(int j=width; j<width+3; j++){
                        total = total + arr[i][j];  
                    }   
                }
                total = total - arr[height+1][width+0]-arr[height+1][width+2];
                if(total>=sum)
                sum=total; 
                total=0; 
            }
        }

        System.out.println(sum);
