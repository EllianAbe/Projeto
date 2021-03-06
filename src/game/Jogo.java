package game;

import java.awt.DisplayMode;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;

public class Jogo {

	static DisplayMode monitor = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode();
	
	public void play() {
		
		JFrame janela = new JFrame("Space Invaders");
		
		janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
		janela.setUndecorated(true);
		janela.setLayout(null);
		janela.setLocationRelativeTo(null);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		SpaceInvaders invasaoAlienigena = new SpaceInvaders();
		invasaoAlienigena.setBounds(0, 0, monitor.getWidth(), monitor.getHeight());
		
		janela.add(invasaoAlienigena);
		janela.addKeyListener(invasaoAlienigena);
		
		
		janela.setVisible(true);
	}
	
	
}
