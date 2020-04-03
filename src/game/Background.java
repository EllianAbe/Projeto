package game;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Background {

	private BufferedImage imagem;
	private int y; 
	
	public Background() {
	
		try {
			imagem = ImageIO.read(new File("imagens/fundo.png"));
		} catch (IOException e) {
			System.out.println("Não foi possível carregar o plano de fundo");
			e.printStackTrace();
		}
		 y = 0;
	}
	
	
	public void pinta(Graphics2D g) {
		int altura = Jogo.monitor.getHeight();
		
		g.drawImage(imagem, 0, y - altura * 2, imagem.getWidth(), imagem.getHeight(), null);
		
		g.drawImage(imagem, 0, y, imagem.getWidth(), -imagem.getHeight(), null);
		
		g.drawImage(imagem, 0, y, imagem.getWidth(), imagem.getHeight(), null);
		
		y += 3;
		
		if (y >=  altura * 2)
			y = 0;
		
	}
}
