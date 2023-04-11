package edu.nyu.cs;


public class Obstacle {

    private int x = 200;
    private int y = 150;
    private App app;
    private int r;
    private int g;
    private int b;

    // constructor
    public Obstacle(int x, int y, App app){
        this.x = x;
        this.y = y;
        this.app = app;
        this.r = 100;
        this.g = 0;
        this.b = 100;
    }


    public void draw(){
        this.app.fill(this.r, this.g, this.b);
        this.app.rect(this.x, this.y, 25, 25);
        this.x--;
    }


}