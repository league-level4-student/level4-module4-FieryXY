package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph {

	int radius = 50;
	int h;
	int k;
	double theta = 0;
	
	
	CircleMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		h = this.x-radius;
		k = this.y;
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect(x, y, width, height);
	}
	
	@Override
	public void update() {
		if(theta >= 360) {
			theta = 0;
		}
		
		double tempX = Math.sin(theta)*radius+k;
		double tempY = Math.sin(theta)*radius+h;
		
		this.y = (int) tempY;
		this.x = (int) tempX;
		System.out.println("Theta:"+theta+", X:"+this.x+", Y:"+this.y+"\n"+"--------------");
		theta++;
	}

}
