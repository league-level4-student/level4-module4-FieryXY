package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph {
	
	int theta = 0;
	int h;
	int k;
	int radius = 20;
	
	boolean right = true;
	CircleMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect(x, y, width, height);
	}
	
	@Override
	public void update() {
		
		
	}

}
