/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playerlayout;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author abdullam
 */
public class Main extends JFrame{
	Main(String title){
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Player player = new Player();
		add(player);
		pack();
	}                

	public static void main(String[] argv){
		SwingUtilities.invokeLater(new Runnable() {
			public void run() { 
				new Main("Lecteur multimédia VLC").setVisible(true); 
			}
		});
	}
}
