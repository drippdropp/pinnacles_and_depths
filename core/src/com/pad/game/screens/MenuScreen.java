package com.pad.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.pad.game.PinnaclesAndDepths;

public class MenuScreen extends ScreenAdapter {

    PinnaclesAndDepths game;

    public MenuScreen(PinnaclesAndDepths game) {
        this.game = game;
    }

    @Override public void show() {
        Gdx.input.setInputProcessor(new InputAdapter() {
            @Override public boolean keyDown(int keyCode) {
                if (keyCode == Input.Keys.SPACE) {
                    game.setScreen(new MenuScreen(game));
                }
                return true;
            }

        });
    }

    @Override public void render(float delta) {
        Gdx.gl.glClearColor(0, .25f, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        game.batch.begin();

        // game.batch.draw(img, 0, 0);
//        game.font.draw(game.batch, "Title Screen", Gdx.graphics.getWidth() * 0.25f, Gdx.graphics.getHeight() * 0.75f);
//        game.font.draw(game.batch, "Click circle to win", Gdx.graphics.getWidth() * 0.25f, Gdx.graphics.getHeight() * 0.5f);
//        game.font.draw(game.batch, "Press space to play", Gdx.graphics.getWidth() * 0.25f, Gdx.graphics.getHeight() * 0.25f);


        game.batch.end();
    }

    @Override public void hide() {
        Gdx.input.setInputProcessor(null);
    }
}
