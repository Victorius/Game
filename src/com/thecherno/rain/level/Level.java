package com.thecherno.rain.level;

import com.thecherno.rain.graphics.Screen;

public class Level {
	
	private int width,height;
	private int[] tiles;
	public Level(int width, int height){
		this.height=height;
		this.width = width;
		generateLevel();		
		
	}
	public Level(String path){
		loadLevel(path);
		
	}
	
	
	private void generateLevel(){
		
	}
	
	private void loadLevel(String path){
		
	}
	
	public void update(){
		
	}
	
	private void time(){
		
	}
	
	public void render(int xScroll, int yScroll, Screen screen){
		
	}
}
