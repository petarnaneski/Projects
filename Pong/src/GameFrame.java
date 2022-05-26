import java.awt.*;
import javax.swing.*;

public class GameFrame extends JFrame{

	GamePanel panel;
	
	GameFrame(){
		panel = new GamePanel();
		this.add(panel);
		this.setTitle("Pong Game");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack(); //window frame is actually going to adjust to fit the size of the game panel
		this.setVisible(true);
		this.setLocationRelativeTo(null); //it appears in the middle of the window
	}
}
