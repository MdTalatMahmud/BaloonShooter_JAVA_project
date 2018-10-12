package baloonShooter;

import java.awt.Rectangle;

public class BaloonMoving extends Thread{
	
	private BulletB bullet;
	private Baloons baloon;
	private GameBoard gameBoard;
	

	public BaloonMoving(Baloons baloon,BulletB bullet ,GameBoard gameBoard ){
		this.bullet=bullet;
		this.baloon=baloon;
		this.gameBoard=gameBoard;
		
	}
	
	public void run(){
		
		while (baloon.getY()>0){
			baloon.setY(baloon.getY() - 1 );
			try{
				Thread.sleep(6);
			}
			catch(Exception o){};
			gameBoard.repaint();
			
		}
	
		}
	
	
	
	
}
