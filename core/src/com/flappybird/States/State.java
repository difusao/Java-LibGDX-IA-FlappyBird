package com.flappybird.States;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.flappybird.FlappyBird;

/**
 * Created by Brent on 6/25/2015.
 */
public abstract class State {
    protected GameStateManager gsm;
    protected OrthographicCamera cam;
    protected Vector3 mouse;

    protected State(GameStateManager gsm){
        this.gsm = gsm;
        cam = new OrthographicCamera();

        //cam.setToOrtho(false, 240, 400);
        cam.setToOrtho(false, (FlappyBird.WIDTH / 1.5f) , (FlappyBird.HEIGHT / 1.5f) );
        //cam.setToOrtho(false, 0, 0);
        cam.position.set(0,0,0);
    }

    public abstract void handleInput();
    public abstract void update(float dt);
    public abstract void render(SpriteBatch sb);
}
