package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    
    Polymorph(int x, int y, int width, int height){
   	 this.x = x;
   	 this.y = y;
   	 this.width = width;
   	 this.height = height;
    }
    
    //Getters and Setter
    public int getX() {
    	return x;
    }
    public int getY() {
    	return y;
    }
    public void setX(int v) {
    	this.x = v;
    }
    public void setY(int v) {
    	this.y = v;
    }
    public int getWidth() {
    	return width;
    }
    public void setWidth(int v) {
    	this.width = v;
    }
    public int getHeight() {
    	return height;
    }
    public void setHeight(int v) {
    	height = v;
    }
    
    //Update Function and Abstract Method Draw
    public void update(){
   
    }
    
    public abstract void draw(Graphics g);
}
