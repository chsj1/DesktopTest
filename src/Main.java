import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.example.hellolibgdx.MyGame;


public class Main {
	public static void main(String[] args) {
		LwjglApplication lwjg = new LwjglApplication(new MyGame(), "Game",320,480,false);
//		LwjglApplication lwjg = new LwjglApplication(new MyGame(), "Game",480,640,false);
	}
}
