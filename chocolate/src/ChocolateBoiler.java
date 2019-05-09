//package multithread;
//package com.mkyong;


public class ChocolateBoiler {
    private static Object mutex =new Object();
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler instance;
    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance(){
        synchronized(mutex) {
            if (instance == null) {
                System.out.println("creando intancia");
                instance = new ChocolateBoiler();

            } else {
                System.out.println("Ya existe");
            }
        }
        return instance;
    }

    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    public void drain(){
        if(isEmpty() && isBoiled()){
            //drain the boiled milk and chocolate
            empty = true;
        }
    }

    public void boil(){
        if(!isEmpty() && isBoiled()){
            //bring the contents to a boil
            boiled = true;
        }
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }

   /* public static void main(String[] args) {

        ChocolateBoiler instance2= ChocolateBoiler.getInstance();
    }*/
}


