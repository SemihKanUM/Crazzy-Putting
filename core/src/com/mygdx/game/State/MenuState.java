package com.mygdx.game.State;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.CrazzyPutting;

public class MenuState extends State{

    private Texture background;
    private Texture playBtn;


    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("Background.png");
        playBtn = new Texture("HuaJuly_04.jpg");
    }

    @Override
    public void handleInput() {
        if(Gdx.input.justTouched()){
            gsm.set(new PlayState(gsm));
            dispose();
        }
    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background, 0,0, CrazzyPutting.WIDTH,CrazzyPutting.HEIGHT);
        sb.draw(playBtn,50,100,CrazzyPutting.WIDTH-100,CrazzyPutting.HEIGHT-300) ;
        sb.end();
    }

    @Override
    public void dispose() {
        background.dispose();
        playBtn.dispose();
    }
}