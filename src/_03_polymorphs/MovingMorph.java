package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingMorph extends Polymorph {
	
	public static int moveCalls = 20;
	
	Direction direction = Direction.LEFT;
	int calls = 0;
	
	MovingMorph(int x, int y, int width, int height) {
		super(x,y,width,height);
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.GREEN);
		g.fillRect(x, y, width, height);
	}
	
	@Override
	public void update() {
		calls++;
		if(calls >= moveCalls) {
			Random r = new Random();
			int newDirection = r.nextInt(3);
			switch(newDirection) {
			case 0:
				direction = Direction.LEFT;
				break;
			case 1:
				direction = Direction.RIGHT;
				break;
			case 2:
				direction = Direction.DOWN;
				break;
			case 3:
				direction = Direction.UP;
				break;
			}
		}
		
		switch(direction) {
		case LEFT:
			this.x--;
			break;
		case RIGHT:
			this.x++;
			break;
		case UP:
			this.y--;
			break;
		case DOWN:
			this.y++;
			break;
		}
	}
}
