//https://www.hackerrank.com/challenges/java-currency-formatter/problem

        // Write your code here.
        //Locale is a class and US is a Locale object for United States
        NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
        String us = nf1.format(payment);

        //We have to create a Locale object for India
        //Locale INDIA = new Locale("en", "INDIA");
        NumberFormat nf2 = NumberFormat.getCurrencyInstance(new Locale("en", "INDIA"));
        String temp = nf2.format(payment);
        String india = temp.substring(1);

        NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = nf3.format(payment);

        NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = nf4.format(payment);
        
        System.out.println("US: " +us);
        System.out.println("India: " +"Rs."+india);
        System.out.println("China: " +china);
        System.out.println("France: " + france);
