package game;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Nave {

	private BufferedImage desenho;
	
	private int x;
	private int velocidade;
	private boolean podeAtirar;
	private int recarregando;
	
	//construtor
	public Nave() {
		
		try {
			desenho = ImageIO.read(new File("imagens/nave.png"));
		} catch (IOException e) {
			System.out.println("Não foi possível carregar a imagem da nave");
			e.printStackTrace();
		}
		
		
		x = 683;
		velocidade = 3;
		podeAtirar = true;
		recarregando = 0;
	}
	
	
	public void pintar(Graphics2D g) {
									//são para a tela				//são da imagem original
					//imagem  posX posY    tamX     tamY	//toda a imagem
		g.drawImage(
				desenho,										// a imagem a ser desenhada 
				x, Jogo.monitor.getHeight() - 150, 			// posicao x e y da imagem
				x + 100, Jogo.monitor.getHeight() - 150 + 100,  //tamanho da imagem
				0, 0, 												//canto da imagem original
				desenho.getWidth(), desenho.getHeight(), 			//tamanho da imagem original
				null);
		
	}

	
	//a nave retorna um tiro na posição em que ela está
	public Tiro atirar() {
		podeAtirar = false;
		recarregando = 0;
								//49 - é o meio da nave
		Tiro novoTiro = new Tiro(x + 49, Jogo.monitor.getHeight() - 150);
		return novoTiro;
		
	}
	
	
	public void movimenta(int valor) {
		
		//se valor for negativo <<<<
		//se for positivo  >>>>
		if (valor == 1) {
			x += velocidade;
		} else if (valor == -1) {
			x -= velocidade;
		}
		
		if (recarregando >= 10) {
			podeAtirar = true;
			recarregando = 0;
		}
		
		recarregando++;
	}
	
	
	public boolean podeAtirar() {
		return podeAtirar;
	}
	
}
