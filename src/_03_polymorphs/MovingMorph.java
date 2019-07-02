package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingMorph extends Polymorph {
	
	public static int moveCalls = 100;
	
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
			int newDirection = r.nextInt(4);
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
			calls = 0;
		}
		
		switch(direction) {
		case LEFT:
			if(this.x > 0) {
				this.x--;
			}
			else {
				calls = moveCalls;
			}
			break;
		case RIGHT:
			if(this.x+this.width < PolymorphWindow.WIDTH) {
				this.x++;
			}
			else {
				calls = moveCalls;
			}
			break;
		case UP:
			if(this.y > 0) {
				this.y--;
			}
			else {
				calls = moveCalls;
			}
			break;
		case DOWN:
			if(this.y+this.height < PolymorphWindow.HEIGHT) {
				this.y++;
			}
			else {
				calls = moveCalls;
			}
			break;
		}
	}
}
