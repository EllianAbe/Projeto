package game;

import java.io.File;
import javax.sound.sampled.*;

public class Audio {
	String path;
	
	public Audio(String audiopath) {
		this.path = audiopath;
	};
        public void som(int count) {
        	try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(this.path).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            clip.loop(count);
        } catch (Exception ex) {
            System.out.println("Erro ao executar SOM!");
            ex.printStackTrace();
        }
    }
}