package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.CrazzyPutting;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = CrazzyPutting.WIDTH;
		config.height = CrazzyPutting.HEIGHT;
		config.title = CrazzyPutting.TITLE;
		new LwjglApplication(new CrazzyPutting(), config);
	}
}
