package layers;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class bitmappane extends JFrame implements Runnable, MouseListener{
bitmap b;
boolean gui = false;
	public bitmappane() {
		setSize(500, 500);
		setVisible(true);
		addMouseListener(this);
	}
	public void paint(Graphics g){
		for(int d = 0; d<500; d++){
			for(int f = 0; f < 500; f++){
				g.setColor(b.pixs[d][f]);
				g.drawRect(d, f, 1, 1);
			}
		}
	}
	public static void main(String[] args){
		bitmappane f = new bitmappane();
	}

	public void run() {
		for(;;){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			repaint();
		}
	}
	public void mouseClicked(MouseEvent e) {
		for(int s = 300;s<401; s++){
			for(int q = 300; q <401; q++){
				if(gui){
			
		b.setcol(s, q, Color.black);
		gui = false;
		}
		else{
		b.setcol(s, q, Color.white);
		gui = true;
		}	
			}
			
			}
		
	}
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
