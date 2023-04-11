package edu.nyu.cs;


public class Block {
    

    private int x = 200;
    private int y = 150;
    private int xspeed = 2;
    private int yspeed = 2;
    private App app;

    public Block(int x, int y, App app){
        this.x = x;
        this.y = y;
        this.app = app;
    }

    public void draw(){
        this.app.rect(this.x, this.y, 50, 50);
    }

    public void jump(){
        this.y = y + yspeed;
        // should I do a timed loop somehow?
    }
} 
