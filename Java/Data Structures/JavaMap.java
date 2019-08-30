//https://www.hackerrank.com/challenges/phone-book/problem

	Scanner in = new Scanner(System.in);
	int n=in.nextInt();
	in.nextLine();
     
        HashMap<String, Integer> contacts = new HashMap<>(); 

	for(int i=0;i<n;i++){
		String name=in.nextLine();
		int phone=in.nextInt();
            	contacts.put(name,phone); 
		in.nextLine();
	}
	while(in.hasNext()){
		String s=in.nextLine();
            	try{
                int number = contacts.get(s); 
                System.out.println(s+"="+number); 
            	}
            	catch(Exception e){
                	System.out.println("Not found");
            	}
            
	}
