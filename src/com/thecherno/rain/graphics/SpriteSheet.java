package com.thecherno.rain.graphics;

public class SpriteSheet {
	private String path;
	private final int SIZE;
	public int[] pixels;
	
	public SpriteSheet(String aPath, int size){
		this.path=aPath;
		SIZE=size;
		pixels = new int[SIZE*SIZE];
	}
	
	private void load(){
		
	}
}
