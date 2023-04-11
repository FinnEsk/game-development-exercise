package edu.nyu.cs;

import java.util.Random;

public class Block {

    

    private int x = 300;
    private int y = 300;
    private App app;
    private int r;
    private int g;
    private int b;
    private boolean isJumping;

    public Block(int x, int y, App app){
        this.x = x;
        this.y = y;
        this.app = app;
        this.r = 0;
        this.g = 150;
        this.b = 150;
    }

    public void draw(){
        this.app.rect(this.x, this.y, 35, 35);
        this.app.stroke(this.r, this.g, this.b);
        
        
        if(isJumping == true){
            y-=2;
            if(y < 150){
                isJumping = false;
            }
        }
        else if(this.y < 265){
            y+=2;
        }
        
    }

    public void jump(){
        isJumping = true;
        // should I do a timed loop somehow?
    }

    public int randomizer(){
        Random rand = new Random();
        return rand.nextInt(255);
    }

    public void randomColor(){
        this.r = randomizer();
        this.g = randomizer();
        this.b = randomizer();
    }
} 
