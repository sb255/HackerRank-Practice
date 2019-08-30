//https://www.hackerrank.com/challenges/java-covariance/problem


//Java Covariant return type: An overriden method of class A in class B can have a different return type from the overrriden method of class A only if the return type is a sub class of the return type class of class A!!

//Complete the classes below
class Flower {
    public String whatsYourName(){
        return "I have many names and types.";
    }
}

class Jasmine extends Flower{
    
    @Override 
    public String whatsYourName(){
        return "Jasmine";
    }
}

class Lily extends Flower{
    
    @Override
    public String whatsYourName(){
        return "Lily";
    }
}

class Region {
    public Flower yourNationalFlower(){
        return new Flower(); 
    }
}

class WestBengal extends Region {

    @Override
    public Jasmine yourNationalFlower(){
        return new Jasmine(); 
    }
}

class AndhraPradesh extends Region {

    @Override
    public Lily yourNationalFlower(){
        return new Lily(); 
    }
}
