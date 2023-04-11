package edu.nyu.cs;


public class Block {
    

    private int x = 200;
    private int y = 150;
    private App app;

    public Block(int x, int y, App app){
        this.x = x;
        this.y = y;
        this.app = app;
    }

    public void draw(){
        this.app.rect(this.x, this.y, 50, 50);
        this.x++;
        this.y++;
    }
} 
