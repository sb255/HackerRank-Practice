//https://www.hackerrank.com/challenges/pattern-syntax-checker/problem

      try{
          Pattern p=Pattern.compile(pattern);
          System.out.println("Valid");
      } 
      catch(Exception e){
          System.out.println("Invalid");
      }
      testCases--; 
