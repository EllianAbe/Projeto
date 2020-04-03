package game;

import java.awt.DisplayMode;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;

public class Jogo {

	static DisplayMode monitor = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode();
	
	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Space Invaders");
		//janela.setSize(1366, 768);
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
