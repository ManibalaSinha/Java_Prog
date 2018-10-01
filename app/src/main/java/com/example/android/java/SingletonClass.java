package com.example.android.java;

public class SingletonClass {
    private static SingletonClass ourInstance;
    //Lazy initialization: initialize new instance of the class in getInstace() method itself.
    public static SingletonClass getInstance() {
        //this method will check if there is any instance of that class is already created? if yes, then method will return old instance & if not then create
        if(ourInstance==null){
            ourInstance= new SingletonClass();
        }

        return ourInstance;
    }
    //private constructor not allowing other class to create new instance of the class
    private SingletonClass() {
        //prevent from reflection api
        if(ourInstance!=null)
        {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }
}
  /*  SingletonClass singletonInstance1 = SingletonClass.getInstance();
    SingletonClass singletonInstance2=SingletonClass.getInstance();
//if 2 objects are same then, their hash key have to be equal.
        System.out.println("Instance 1 hash:"+ singletonInstance1.hashCode());
                System.out.println("Instance 2 hash:"+ singletonInstance2.hashCode());*/