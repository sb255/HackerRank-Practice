//https://www.hackerrank.com/challenges/java-singleton/problem

    public String str = ""; 
    
    private Singleton(){
        str = "Hello I am a singleton! Let me say hello world to you";
    }
    
    static Singleton getSingleInstance(){
        return new Singleton(); 
    }
