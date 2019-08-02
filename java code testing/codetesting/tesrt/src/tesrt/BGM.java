package tesrt;
import javazoom.jl.player.*;
public class BGM {
	public static void main(String[] args) {
		String filename="C:/1/Crusade.wav";
		MyMusicPlayer wav = new MyMusicPlayer(filename);
		wav.play();
	}
}
