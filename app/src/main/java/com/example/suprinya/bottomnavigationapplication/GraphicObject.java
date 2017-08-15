package com.example.suprinya.bottomnavigationapplication;

/**
 * Created by suprinya on 8/11/2017 AD.
 */

public abstract class GraphicObject {
    // declare fields
    // declare nonabstract methods
    abstract void draw();
    public abstract void print();
    protected abstract void chart();
    private void show(){
        System.out.println("Hello");
    }

}