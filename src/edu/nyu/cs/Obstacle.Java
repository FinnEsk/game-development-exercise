package edu.nyu.cs;


public class Obstacle {

    private int x = 200;
    private int y = 150;
    private App app;

    // constructor
    public Obstacle(int x, int y, App app){
        this.x = x;
        this.y = y;
        this.app = app;
    }


    public void draw(){
        this.app.rect(this.x, this.y, 100, 100);
    }


}