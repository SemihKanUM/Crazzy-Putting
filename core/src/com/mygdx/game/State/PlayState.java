package com.mygdx.game.State;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.Ball.Ball;

public class PlayState extends State {

    private Ball ball;

    public PlayState(GameStateManager gsm) {
        super(gsm);
        ball = new Ball(0,0); // There is no ball png yet.
    }

    @Override
    public void handleInput() {

    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(ball.getTexture(), 50, 50 , 100 , 100);
        sb.end();

    }

    @Override
    public void dispose() {
        //ball.dispose();
    }
}
