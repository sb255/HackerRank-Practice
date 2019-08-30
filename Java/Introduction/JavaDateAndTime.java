//https://www.hackerrank.com/challenges/java-date-and-time/problem

    public static String findDay(int month, int day, int year) {
        //Converting the given time frame into a String
        String input = Integer.toString(day)+"/"+Integer.toString(month)+"/"        +Integer.toString(year);

        String fDay = ""; 

        try{
            //SimpleDate format is an Abstract class in Java
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            //Converting a String into a Date is called Parsing 
            Date date = format.parse(input);

            //DateFormat format is an Abstract class in Java
            DateFormat dateFormat = new SimpleDateFormat("EEEE");
            //Converting a Date into a String is called Fomating
            String gDay = dateFormat.format(date);

            fDay = gDay; 
        }
        catch(Exception e){
            System.out.println("Exception occured");
        }

        return fDay.toUpperCase(); 
        
    }

