package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseListener {
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
  ArrayList<Polymorph> morphs;
    
    public static void main(String[] args) {
   	 PolymorphWindow win = new PolymorphWindow();
   	 win.buildWindow();
   	 win.addMouseListener(win);
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 
   	 morphs = new ArrayList<Polymorph>();
   	 morphs.add(new BluePolymorph(50,50,50,50));
   	 morphs.add(new RedMorph(50, 150, 50, 50));
   	 morphs.add(new MovingMorph(400, 400, 50, 50));
   	 morphs.add(new MouseMorph(100, 100, 50, 50));
   	 morphs.add(new CircleMorph(200, 200, 5, 5));
   	 morphs.add(new DialogMorph(300, 300, 50, 50));
   	 morphs.add(new ImageMorph(350, 350, 50, 50));
   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	for(Polymorph p : morphs) {
   		p.draw(g);
   	}
   	 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	for(Polymorph p : morphs) {
    		p.update();
    	}
   	 repaint();
   
    }
    
    boolean checkMorphClick(Polymorph target, double x, double y) {
    	
    	if(x > target.x && x < target.x+target.width) {
    		if(y > target.y && y < target.y+target.height) {
    			return true;
    		}
    	}
    	
    	return false;
    }

	@Override
	public void mouseClicked(MouseEvent e) {
	
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Debug");
		for(Polymorph p : morphs) {
			if(p.clickable) {
				if(checkMorphClick(p, e.getX(), e.getY())) {
					p.clickFunc();
				}
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
