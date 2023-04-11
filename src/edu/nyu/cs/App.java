package edu.nyu.cs;

import java.nio.file.Paths;
import java.util.ArrayList;

import org.apache.commons.lang3.SystemUtils;

import processing.core.*; 
import processing.sound.*;





public class App extends PApplet {


    private Block block;
    private Obstacle obstacle;

    
    public void settings(){
        this.size(600, 600);
    }

    public void setup(){

        this.block = new Block(100, 100, this);
        this.obstacle = new Obstacle(100, 100, this);

    }

    public void draw(){
        this.background(0, 0, 0);
        this.noFill();
        this.line(0,150,600,150);

        this.block.draw();
        this.obstacle.draw();

    }

    public void keyPressed(){
        block.jump();
        block.draw();
    }

    public static void main(String[] args){
        PApplet.main("edu.nyu.cs.App");
    }
}
