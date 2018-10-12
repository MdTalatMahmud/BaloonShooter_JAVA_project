package baloonShooter;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
		GameBoard gb = new GameBoard();
		
		JFrame gameFrame = new JFrame();
		gameFrame.setTitle("BaloonShooter");
		gameFrame.setSize(1300, 700);
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.add(gb);
		gameFrame.setVisible(true);
		
		

	}

}
