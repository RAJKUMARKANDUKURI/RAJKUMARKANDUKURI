package manage_commands;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.peer.RobotPeer;
import java.io.IOException;

public class Robo_open_notepad {
	
	
	public static void main(String[] args) throws IOException, Exception {
		
		Runtime.getRuntime().exec("notepad.exe");
		
		Thread.sleep(2000);
		
		Robot robo=new Robot();
		
		robo.setAutoDelay(3000);
		
		robo.keyPress(KeyEvent.VK_H);
		robo.keyPress(KeyEvent.VK_E);
		robo.keyPress(KeyEvent.VK_L);
		robo.keyPress(KeyEvent.VK_L);
		robo.keyPress(KeyEvent.VK_O);
		robo.keyPress(KeyEvent.VK_1);
		robo.keyPress(KeyEvent.VK_4);
		robo.keyPress(KeyEvent.VK_3);
		
		
		
		
		
		
		
	}
	

}
