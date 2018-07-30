package com.simplegame;

public interface UserInterface {
	public void up();
	public void down();
	public void left();
	public void right();
	public void print();
	public boolean colision(int x , int y);
	public boolean exit();
	public void clear();
}
