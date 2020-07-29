package RectangleGame.desktop;

import RectangleGame.RectangleGame;
import com.badlogic.gdx.Files.FileType;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

/** Launches the desktop (LWJGL) application. */
public class DesktopLauncher
{
	public static void main (String[] args)
	{
		RectangleGame myGame = new RectangleGame();
		LwjglApplication launcher = new LwjglApplication( myGame, "Game Title", 800, 600 );
	}
}