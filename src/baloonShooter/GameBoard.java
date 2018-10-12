package baloonShooter;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class GameBoard extends JPanel implements KeyListener{
	
	
	BulletB[] bullet = new BulletB[10];
	Baloons[] baloon = new Baloons[10];
	int bulletCount = 10;
	int i ;
	static int score=0;
	
	
	public GameBoard(){
		super();
		
		super.addKeyListener(this);
		super.setFocusable(true);
		
		//Shooter shooter = new Shooter(200,50,"Images//shooter.jpg");
		int xBaloon = 1180,yBaloon = 655;//here changed
		
		for(int i = 0 ; i<baloon.length;i++){
			baloon[i] = new Baloons(xBaloon,yBaloon,true,"Images//baloon.png");
			yBaloon  = yBaloon+500;
		}
		for(int i = 0; i < bullet.length; i++){
			bullet[i] = new BulletB(343,148,"Images//bullet.png");//here changed
			
		}
		
		
		
		
		    BaloonMoving bm = new BaloonMoving(baloon[0], bullet[0], this);
			bm.start();
			BaloonMoving bm1 = new BaloonMoving(baloon[1], bullet[1], this);
			bm1.start();
			BaloonMoving bm2 = new BaloonMoving(baloon[2], bullet[2], this);
			bm2.start();
			BaloonMoving bm3 = new BaloonMoving(baloon[3], bullet[3], this);
			bm3.start();
			BaloonMoving bm4 = new BaloonMoving(baloon[4], bullet[4], this);
			bm4.start();
			BaloonMoving bm5 = new BaloonMoving(baloon[5], bullet[5], this);
			bm5.start();
			BaloonMoving bm6 = new BaloonMoving(baloon[6], bullet[6], this);
			bm6.start();
			BaloonMoving bm7 = new BaloonMoving(baloon[7], bullet[7], this);
			bm7.start();
			BaloonMoving bm8 = new BaloonMoving(baloon[8], bullet[8], this);
			bm8.start();
			BaloonMoving bm9 = new BaloonMoving(baloon[9], bullet[9], this);
			bm9.start();
			
			
			
	}
	public void paint(Graphics g){
		//I DRAW IMAGE HERE..................
		ImageIcon background = new ImageIcon("Images//background.jpg");
		g.drawImage(background.getImage(), 0, 0, null);
		ImageIcon grass = new ImageIcon("Images//grass.png");
		g.drawImage(grass.getImage(),-90,205,null);
		
		
		//I DRAW IMAGE HERE..................
		
		
	//	shooter.draw(g);
		for(int i = 0; i < baloon.length; i++){
			if(baloon[i].isAlive() == true)
				baloon[i].draw(g);
			super.repaint();
				}
		
		for(int i = 0; i < bullet.length; i++)
			bullet[i].draw(g);
		super.repaint();
		g.setColor(Color.BLUE);
		g.drawString("BULLETS = " + bulletCount, 70, 600);
		g.drawString("SCORE = "+score,70,615);
		g.drawString("HELP : Press A to J to shoot. After pressing a key you can not press that kay again",70,630);
	}



	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
         if(e.getKeyCode() == KeyEvent.VK_A){
        	 
        	 
        	 
        	 BulletFiring fire = new BulletFiring(bullet[0],baloon,this);
        	 fire.start();
        	
 			bulletCount--;
 			
         }
			
         super.repaint();
         
if(e.getKeyCode() == KeyEvent.VK_B){
        	 
        	 
        	 
        	 BulletFiring fire1 = new BulletFiring(bullet[1],baloon,this);
        	 fire1.start();
        	
 			bulletCount--;
 			
         }
			
         super.repaint();
if(e.getKeyCode() == KeyEvent.VK_C){
        	 
        	 
        	 
        	 BulletFiring fire2 = new BulletFiring(bullet[2],baloon,this);
        	 fire2.start();
        	
 			bulletCount--;
 			
         }
			
         super.repaint();
if(e.getKeyCode() == KeyEvent.VK_D){
        	 
        	 
        	 
        	 BulletFiring fire3 = new BulletFiring(bullet[3],baloon,this);
        	 fire3.start();
        	
 			bulletCount--;
 			
         }
			
         super.repaint();
if(e.getKeyCode() == KeyEvent.VK_E){
        	 
        	 
        	 
        	 BulletFiring fire4 = new BulletFiring(bullet[4],baloon,this);
        	 fire4.start();
        	
 			bulletCount--;
 			
         }
			
         super.repaint();
if(e.getKeyCode() == KeyEvent.VK_F){
        	 
        	 
        	 
        	 BulletFiring fire5 = new BulletFiring(bullet[5],baloon,this);
        	 fire5.start();
        	
 			bulletCount--;
 			
         }
			
         super.repaint();
if(e.getKeyCode() == KeyEvent.VK_G){
        	 
        	 
        	 
        	 BulletFiring fire6 = new BulletFiring(bullet[6],baloon,this);
        	 fire6.start();
        	
 			bulletCount--;
 			
         }
			
         super.repaint();
if(e.getKeyCode() == KeyEvent.VK_H){
        	 
        	 
        	 
        	 BulletFiring fire7 = new BulletFiring(bullet[7],baloon,this);
        	 fire7.start();
        	
 			bulletCount--;
 			
         }
			
         super.repaint();
if(e.getKeyCode() == KeyEvent.VK_I){
        	 
        	 
        	 
        	 BulletFiring fire8 = new BulletFiring(bullet[8],baloon,this);
        	 fire8.start();
        	
 			bulletCount--;
 			
         }
			
         super.repaint();if(e.getKeyCode() == KeyEvent.VK_J){
        	 
        	 
        	 
        	 BulletFiring fire9 = new BulletFiring(bullet[9],baloon,this);
        	 fire9.start();
        	
 			bulletCount--;
 			
         }
			
         super.repaint();
if(e.getKeyCode() == KeyEvent.VK_K){
        	 
        	 
        	 
        	 BulletFiring fire10 = new BulletFiring(bullet[10],baloon,this);
        	 fire10.start();
        	
 			bulletCount--;
 			
         }
			
         super.repaint();
	}

	//super.repaint();


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
