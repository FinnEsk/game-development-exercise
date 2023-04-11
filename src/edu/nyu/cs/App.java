package edu.nyu.cs;

import java.util.Random;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.apache.commons.lang3.SystemUtils;

import processing.core.PApplet;
//import processing.core.*; 
//import processing.sound.*;





public class App extends PApplet {


    private Block block;
    
private Obstacle obstacle;
    
    public void settings(){
        this.size(600, 600);
    }

    public void setup(){

        this.block = new Block(300, 250, this);
        this.obstacle = new Obstacle(500, 275, this);

    }

    public void draw(){
        this.background(0, 0, 0);
        this.noFill();

        
        this.stroke(100,100,100);
        this.line(0,300,600,300);

        this.block.draw();
        this.obstacle.draw();

    }

    public void keyPressed(){
        block.jump();
        block.draw();
    }

    public void mouseClicked(){
        block.randomColor();
    }

    public static void main(String[] args){
        PApplet.main("edu.nyu.cs.App");
    }
}
