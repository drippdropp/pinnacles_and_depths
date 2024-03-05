package com.pad.game;

import com.pad.game.screens.TitleScreen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

public class PinnaclesAndDepths extends Game {
    public SpriteBatch batch;
    public ShapeRenderer shapeRenderer;
    public BitmapFont font;
    public Texture img;

    int currentLevel = 1;
    int totalPoints = 0;

    @Override
    public void create () {
        batch = new SpriteBatch();
        img = new Texture("darkwoodlands.jpg");
        shapeRenderer = new ShapeRenderer();
        font = new BitmapFont();
        setScreen(new TitleScreen(this));
    }

//	@Override
//	public void render () {
//
//        // Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//		ScreenUtils.clear(0, 0, 0, 1);
//        batch.begin();
//        batch.draw(img, 0, 0);
//        batch.end();
//	}

    @Override
    public void dispose () {
        batch.dispose();
        img.dispose();
        font.dispose();
        shapeRenderer.dispose();
    }
}
