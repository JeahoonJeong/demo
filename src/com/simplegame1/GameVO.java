package com.simplegame1;

public class GameVO {
	
	
	private int maxX;
	private int maxY;
	private String[][] map;
	
	public String[][] getMap() {
		return map;
	}
	public void setMap(String[][] map) {
		this.map = map;
	}
	public int getMaxX() {
		return maxX;
	}
	public void setMaxX(int maxX) {
		this.maxX = maxX;
	}
	public int getMaxY() {
		return maxY;
	}
	public void setMaxY(int maxY) {
		this.maxY = maxY;
	}

}
