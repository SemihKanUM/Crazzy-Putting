package com.mygdx.game.Ball;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;

public class Ball {

    private Vector3 position;
    private Vector3 velocity;
    public Texture ball;
    private String picLocation = "Golf_ball.svg.png";

    public Ball(int x, int y){
        position = new Vector3(x,y,0);
        velocity = new Vector3(0,0,0);
        ball = new Texture(picLocation);
    }

    public void update(float dt){ // "dt" is Delta Time.
    }

    public Texture getTexture(){
        return new Texture(picLocation);
    }

}
