package org.example;


public class Singleton {
    private String name;
    private static Singleton instance ;

    private Singleton(String name){
        this.name = name;
        instance = this;
    }

    public static Singleton getInstance(String name){
        if(instance == null){
            Singleton sg = new Singleton(name);
            return  sg;
        }else {
            return instance;
        }
    }
}
