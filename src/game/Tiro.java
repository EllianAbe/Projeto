package game;

import java.awt.Color;
import java.awt.Graphics2D;

public class Tiro {

	private int x;
	private int y;
	private int velocidade;
	private int tamX = 3;
	private int tamY = 15;
	private Audio shotsound = new Audio("audios/SWShot.wav");
	
	public Tiro(int inicioX, int inicioY) {
		shotsound.som(0);
		this.x = inicioX;
		this.y = inicioY;
		velocidade = 10;
	}
	
	
	public void pintar(Graphics2D g) {
		
		g.setColor(Color.red);
		g.fillRect(x, y, tamX, tamY);
		
	}


	public void atualiza() {
		y -= velocidade;
	}
	
	
	public boolean destroy() {
		
		return y < 0; //retornar verdadeiro ou falso
		
	}


	public boolean colideCom(Inimigo inimigo) {
		
		if ( x >= inimigo.getX() && x + tamX <= inimigo.getX() + inimigo.getTam() ) {
			
			if (y <= inimigo.getY() + inimigo.getTam()) {
				return true;
			}
			
		}
		
		return false;
	}
	
}
