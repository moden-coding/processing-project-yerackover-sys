import java.util.Random;

import processing.core.*;

public class App extends PApplet{
    float shipx = 300;
    float shipy = 700;
    boolean left, up, right, down;
    boolean bullet;
    float bulletx1, bullety1;
    float bulletx2, bullety2;
    float bulletx3, bullety3;
    float bulletx4, bullety4;
    float bulletx5, bullety5;
    float bulletx6, bullety6;
    float bulletx7, bullety7;
    float bulletx8, bullety8;
    float bulletx9, bullety9;
    float bulletx10, bullety10;
    float bulletx11, bullety11;
    boolean hasrun1;
    boolean hasrun2;
    boolean hasrun3;
    boolean hasrun4;
    boolean hasrun5;
    boolean hasrun6;
    boolean hasrun7;
    boolean hasrun8;
    boolean hasrun9;
    boolean hasrun10;
    boolean hasrun11;
    public static void main(String[] args)  {
        PApplet.main("App");

    }

    public void setup(){

    
    }
    public void settings(){
    size(600, 800);    
    }

    public void draw(){
    background(0);
  for (int i = 0; i < 500; i++) {
    float x = random(width);
    float y = random(height);

    fill(255);
    noStroke();
    circle(x, y, 1);
  }    
       rect(shipx,shipy,30,80);
  if (left == true) {shipx-= 5;}
  if (up == true) {shipy-= 5;}
  if (right == true) {shipx+= 5;}
  if (down == true) {shipy+= 5;}
  if (hasrun1 == false){
  if (bullet == true) {drawbullet(bulletx1,bullety1);hasrun1= true; } 
  }if (hasrun2 == false){
  if (bullet == true) {drawbullet(bulletx2,bullety2); hasrun2= true;}
   }if (hasrun3 == false){
  if (bullet == true) {drawbullet(bulletx3,bullety3); hasrun3= true;}
   }if (hasrun4 == false){
  if (bullet == true) {drawbullet(bulletx4,bullety4); hasrun4= true;}
   }if (hasrun5 == false){
  if (bullet == true) {drawbullet(bulletx5,bullety5); hasrun5= true;}
   }if (hasrun6 == false){
  if (bullet == true) {drawbullet(bulletx6,bullety6); hasrun6= true;}
   }if (hasrun7 == false){
  if (bullet == true) {drawbullet(bulletx7,bullety7); hasrun7= true;}
  }if (hasrun8 == false){
  if (bullet == true) {drawbullet(bulletx8,bullety8); hasrun8= true;}
 }if (hasrun9 ==false){
  if (bullet == true) {drawbullet(bulletx9,bullety9); hasrun9= true;}
 }if (hasrun10 == false){
  if (bullet == true) {drawbullet(bulletx10,bullety10); hasrun10= true;}
 }if (hasrun11 == false){
  if (bullet == true) {drawbullet(bulletx11,bullety11); hasrun11= true;}
     }
    }
    public void drawbullet(float x, float y) {
    fill(255,0,0);
    x=shipx+15;
    y=shipy;
   ellipse(x, y, 4, 4);

    bullety1-=3;
    bullety2-=3;
    bullety3-=3;
    bullety4-=3;
    bullety5-=3;
    bullety6-=3;
    bullety7-=3;
    bullety8-=3;
    bullety9-=3;
    bullety10-=3;
    bullety11-=3;

    }
    public void keyPressed(){
    
    if (keyCode == UP) {up = true;}
    if (keyCode == DOWN) {down = true;}
    if (keyCode == LEFT) {left = true;}
    if (keyCode == RIGHT) {right = true;}
    if (key == 'z') {bullet = true;}
    }
    public void keyReleased(){
    if (keyCode == UP) {up = false;}
    if (keyCode == DOWN) {down = false;}
    if (keyCode == LEFT) {left = false;}
    if (keyCode == RIGHT) {right = false;} 
    if (key == 'z') {bullet = false;}
    }
  
    }

