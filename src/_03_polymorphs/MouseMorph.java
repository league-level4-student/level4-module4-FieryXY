package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;

public class MouseMorph extends Polymorph {

	MouseMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.PINK);
		g.fillRect(x, y, width, height);
	}
	
	@Override
	public void update() {
		this.x = MouseInfo.getPointerInfo().getLocation().x-(this.width/2);
		this.y = MouseInfo.getPointerInfo().getLocation().y-(this.height);
	}
	
}
