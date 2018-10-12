package baloonShooter;
import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Baloons {

	private int x,y;//...............
	private boolean isAlive;
	private String imagePath;
	
	public Baloons(int x, int y, boolean isAlive, String imagePath) {
		
		this.x = x;
		this.y = y;
		this.isAlive = isAlive;
		this.imagePath = imagePath;
		
		
	}
	public int getX(){
		return x;
	}
	public void setX(int x){
		this.x = x;
	}
	public int getY(){
		return y;
	}
	public void setY(int y){
		this.y=y;
	}

	public boolean isAlive() {
		// TODO Auto-generated method stub
		return isAlive;
	}
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}


	
	public void draw(Graphics g){
		
		ImageIcon Baloon = new ImageIcon(imagePath);
		g.drawImage(Baloon.getImage(), x, y, null);
		
	}


	
}
