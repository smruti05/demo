package com.assignmentondesignpattern.singletonpattern;

public class SingletonInstance {
    private static SingletonInstance instance = new SingletonInstance();
    private SingletonInstance() {
    }
    public static SingletonInstance getInstance(){
        return instance;
    }
    public String showMessage(){
        return "This is call from singleton instance";
    }
}
