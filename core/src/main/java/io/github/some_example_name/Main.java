package io.github.some_example_name;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;

public class Main implements ApplicationListener {

	@Override
	public void create() {
		// TODO Auto-generated method stub
		System.out.println("hello world iam new there");
		System.out.println("hello world iam new there");
		System.out.println("hello world iam new there");
		System.out.println("hello world iam new there");
		System.out.println("hello world iam new there");
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		float fps = 1 / Gdx.graphics.getDeltaTime();
		System.out.println("delta time : " + fps);
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
}