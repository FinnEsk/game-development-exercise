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
    private O obstacle;
    private int score = 0;
    private ArrayList<O> Obstacles;
    private int numObstacles = 500;



    public int randomizer(){
        Random rand = new Random();
        return rand.nextInt(255);
    }
    
    public void settings(){
        this.size(600, 600);
    }

    public void setup(){

        this.block = new Block(300, 265, this);
        

        Obstacles = new ArrayList<O>();
        for(int i = 0; i < numObstacles; i++){
            O obstacle = new O(500, 275, this);
            this.Obstacles.add(obstacle);
        }

    }

    public void draw(){
        this.background(0, 0, 0);
        this.noFill();

        
        this.stroke(100,100,100);
        this.line(0,300,600,300);


        this.block.draw();

        int o_generator = 500;

        for(int i = 0; i < this.Obstacles.size(); i++){
            if(score <= o_generator)
            {
                O obstacle = this.Obstacles.get(i);
                obstacle.draw();
                o_generator += 400;
            }
        }

        this.fill(255,255,255);
        this.stroke(255,255,255);
        
        score ++;

        String scoreString = String.format("SCORE: %d", this.score);
        text(scoreString, this.width/2 - 20, this.height-200);

    }

    public void keyPressed(){
        block.jump();
        block.draw();
        score += 100;
    }

    public void mouseClicked(){
        block.randomColor();
    }

    public static void main(String[] args){
        PApplet.main("edu.nyu.cs.App");
    }
}
