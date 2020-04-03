package game;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Menu extends JPanel implements ActionListener{
	private BufferedImage imagem;
	private static JButton buttonStart;
	private static JButton buttonEnd;
	
	public Menu() {
		try {
			imagem = ImageIO.read(new File("imagens/fundo.png"));
		} catch (IOException e) {
			System.out.println("Não foi possível carregar o plano de fundo");
			e.printStackTrace();
		}
	}
	 
	public static void main(String[] args) {
		JFrame janela = new JFrame();
		JPanel menu = new JPanel();
		menu.setLayout(null);
				
		janela.add(menu);
		
		buttonEnd = new JButton("Exit");
		buttonStart = new JButton("Start");
		buttonStart.setBounds(75,90,100,30);
		buttonEnd.setBounds(75,150,100,30);
		
		menu.add(buttonStart);
		menu.add(buttonEnd);
		
		janela.setBounds(150,35,250,350);
		janela.setVisible(true);
		
		buttonStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Jogo jogo = new Jogo();
				jogo.play();
			}
		});
		
		buttonEnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				System.exit(0);
			}
		});
		
	}

	public void actionPerformed(ActionEvent e) {
				
	}
}