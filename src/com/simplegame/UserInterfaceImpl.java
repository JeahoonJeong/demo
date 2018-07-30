package com.simplegame;

public class UserInterfaceImpl implements UserInterface {
	
	private int maxX, maxY;
	private int curX, curY;
	String[][] map;
	
	public void set(int maxX, int maxY){
		this.maxX = maxX;
		this.maxY = maxY;
		this.curX = 1;
		this.curY = 1;
		map = new String[maxX][maxY];
		
		
		for(int i =0 ; i<maxX; i++){
			for(int j =0; j<maxY;j++){
				map[i][j]=" ";
			}
		}
		for(int i =0; i< maxX; i++){
			map[i][0] = " ";
			map[i][maxY-1]= " ";
		}
		
		for(int i =0; i< maxY; i++){
			map[0][i] = "-";
			map[maxX-1][i]= "-";
		}
		
		map[1][1]="*";
	}
	
	@Override
	public void print(){
		
		for(int i =0;i<maxX;i++){
			for(int j =0; j<maxY;j++){
				System.out.printf("%s",map[i][j]);	
			}
			System.out.println();
		}
		
	}
	
	@Override
	public void up(){
		
		map[curX][curY]=" ";
		curX--;
		map[curX][curY] ="*";
		
		if(!colision(curX,curY)){
			
			map[curX][curY]="-";
			curX++;
			map[curX][curY] ="*";
			
		}
		
	}

	@Override
	public void down() {
		
		map[curX][curY]=" ";
		curX++;
		map[curX][curY] ="*";
		
		if(!colision(curX,curY)){
			
			map[curX][curY]="-";
			curX--;
			map[curX][curY] ="*";
			
		}
		
	}

	@Override
	public void left() {
		map[curX][curY]=" ";
		curY--;
		map[curX][curY] ="*";
		
		if(!colision(curX,curY)){
			
			map[curX][curY]=" ";
			curY++;
			map[curX][curY] ="*";
			
		}
		
	}

	@Override
	public void right() {
		
		map[curX][curY]=" ";
		curY++;
		map[curX][curY] ="*";
		
		if(!colision(curX,curY)){
			
			map[curX][curY]=" ";
			curY--;
			map[curX][curY] ="*";
			
		}
		
	}
	
	@Override
	public void clear(){
		
		for (int i=0; i<5; i++) System.out.println(); 
		System.out.println("L:a R:d U:w D:s exit:e");
		
	}
	
	@Override
	public boolean colision(int x, int y) {
		
		if( x<1 || y<1 || x>maxX-2 || y>maxY-2 ){
			return false;
		}
		return true;
	}

	@Override
	public boolean exit() {
		
		for (int i=0; i<10; i++) System.out.println();
		System.out.println("Á¾·á");
		
		return false;
	}

	
	

}
