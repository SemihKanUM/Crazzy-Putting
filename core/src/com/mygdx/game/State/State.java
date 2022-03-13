package com.mygdx.game.State;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.PerspectiveCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g3d.Environment;
import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.ModelBatch;
import com.badlogic.gdx.graphics.g3d.ModelInstance;
import com.badlogic.gdx.graphics.g3d.utils.ModelBuilder;
import com.badlogic.gdx.math.Vector3;

public abstract class State {

    protected PerspectiveCamera cam;
    protected Vector3 mouse;
    protected GameStateManager gsm;
    private ModelBatch modelBatch;
    private ModelBuilder modelBuilder;
    private Model box;
    private ModelInstance modelInstance;
    private Environment environment;


    protected State(GameStateManager gsm){
        this.gsm = gsm;
        cam = new PerspectiveCamera(75, Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        mouse = new Vector3();

        cam.position.set(0f ,0f , 3f);
        cam.lookAt(0f , 0f, 0f);
        cam.near = 0.1f;
        cam.far = 300f;

        modelBatch = new ModelBatch();
        modelBuilder = new ModelBuilder();



    }



    public abstract void handleInput();
    public abstract void update(float dt);
    public abstract void render(SpriteBatch sb);
    public abstract void dispose();

}
