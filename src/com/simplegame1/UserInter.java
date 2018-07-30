package com.simplegame1;

public interface UserInter {
	
	public void up();
	public void down();
	public void left();
	public void right();
	public void newStar(int curX,int curY);
	public boolean exit();
	public void setIndex(int index);

}
