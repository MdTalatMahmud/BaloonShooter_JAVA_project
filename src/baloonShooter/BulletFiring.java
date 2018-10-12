package baloonShooter;

import java.awt.Rectangle;

public class BulletFiring extends Thread{
	
	private BulletB bullet;
	private Baloons[] baloon;
	private GameBoard gameBoard;
	
	
	public BulletFiring(BulletB bullet, Baloons[] baloon, GameBoard gameBoard) {
		
		this.bullet = bullet;
		this.baloon = baloon;
		this.gameBoard = gameBoard;
	}
	
public void run(){
		
		while(bullet.getX() < 1300){
			
			
			bullet.setX(bullet.getX() + 1);
			checkCollision();
			try{
				Thread.sleep(1);//changed
			}
			catch(Exception e){}
			
			gameBoard.repaint();
		
		
			
		}
}






public void checkCollision(){
			
			Rectangle bulletRect = new Rectangle(bullet.getX(),bullet.getY(),21,5);//changed
			
			for(int i = 0; i < baloon.length; i++){
				
				Rectangle baloonRect= new Rectangle(baloon[i].getX(),baloon[i].getY(),100,129);
				
				if(bulletRect.intersects(baloonRect) == true){
					baloon[i].setAlive(false);
					baloon[i].setX(-200);
					
					GameBoard.score = GameBoard.score+10;
					break;
				}

			}	
	
}
}
