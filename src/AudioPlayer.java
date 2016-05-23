import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class AudioPlayer {
	Clip clip = null;
	public AudioPlayer(String filepath) {
		try {
	        stopPlay();
	        AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(filepath).getAbsoluteFile());
	        clip = AudioSystem.getClip();
	        clip.open(inputStream);
	        clip.start();
	    } catch (Exception e) {
	        stopPlay();
	    }
	}
	private void stopPlay() {
	    if (clip != null) {
	        clip.stop();
	        clip.close();
	        clip = null;
	    }
	}
}