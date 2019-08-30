//https://www.hackerrank.com/challenges/java-stack/problem

            /*
             * Author: Samarth Bais
             * GitHub; github.com/sb255
             */

            //Complete the code
            Stack<Character> stack = new Stack<>();
            boolean balancedString = false; 

            for(char c : input.toCharArray()){
                if(c == '(' || c == '{' || c == '[')
                    stack.push(c);

                else if(c == ')' && !stack.isEmpty()){
                    if(stack.peek()=='('){
                        stack.pop(); 
                        balancedString = true;
                    }
                    else{
                        balancedString = false;
                        break; 
                    }
                }

                else if(c == '}' && !stack.isEmpty()){
                    if(stack.peek()=='{'){
                        stack.pop();
                        balancedString = true; 
                    }
                    else{
                        balancedString = false;
                        break; 
                    }

                }

                else if(c == ']' && !stack.isEmpty()){
                    if(stack.peek()=='['){
                        stack.pop();
                        balancedString = true; 
                    }
                    else{
                        balancedString = false;
                        break; 
                    }

                }
                else{
                    balancedString = false;
                    break;  
                }
            }

            if(stack.isEmpty() && balancedString)
                System.out.println("true");
            
            else
                System.out.println("false");
