package _03_polymorphs;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageMorph extends Polymorph{

	Image img;
	
	ImageMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		try {
			loadImage();
		}
		catch(IOException e) {
			
		}
		if(img != null) {
			g.drawImage(img, x, y, width, height, null);
		}
		
	}
	
	 void loadImage() throws IOException {
		 img = ImageIO.read(this.getClass().getResourceAsStream("snipper.PNG"));
	}

}
