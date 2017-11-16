package org.ulco;

public class ID {


    private static ID instance;

    private int nextID;

    private ID(){ nextID = 1;}

    public static ID getID(){
        if (instance == null){
            instance = new ID();
        }

        return instance;
    }

    public int nextID(){
        return ++nextID;
    }
}