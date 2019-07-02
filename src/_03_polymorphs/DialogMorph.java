package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JOptionPane;

public class DialogMorph extends Polymorph {
	
	
	DialogMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		super.clickable = true;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect(x, y, width, height);
	}
	
	@Override
	public void update() {
		
	}
	
	@Override
	public void clickFunc() {
		JOptionPane.showMessageDialog(null, "You have clicked a DialogMorph!");
	}
}
