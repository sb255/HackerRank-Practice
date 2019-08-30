//https://www.hackerrank.com/challenges/tag-content-extractor/problem

    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();
            int capacity = line.length();
            int count = 0; 
            
            //Write your code here
            String regex = "<([\\w[\\W&&[^/<>]]]+)>([\\w[\\W&&[^<]]]+)</\\1>"; 
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(line);

            while(m.find()){
                System.out.println(m.group(2));
                count++; 
            }
            if(count==0){
                System.out.println("None");
            }
            
            testCases--;
        }
        in.close(); 
    }
