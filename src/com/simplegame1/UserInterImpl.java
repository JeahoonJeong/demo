package com.simplegame1;

import java.util.ArrayList;
import java.util.List;

public class UserInterImpl implements UserInter, GameUtil {

	private List<ObjectVO> starList = new ArrayList<ObjectVO>();
	private GameVO gvo = new GameVO();
	private int index = 0;

	public void setGame(int maxX, int maxY) {

		String[][] map = new String[maxX][maxY];

		for (int i = 0; i < maxX; i++) {
			for (int j = 0; j < maxY; j++) {
				map[i][j] = " ";
			}
		}
		for (int i = 0; i < maxX; i++) {
			map[i][0] = " ";
			map[i][maxY - 1] = " ";
		}

		for (int i = 0; i < maxY; i++) {
			map[0][i] = "-";
			map[maxX - 1][i] = "-";
		}

		gvo.setMaxX(maxX);
		gvo.setMaxY(maxY);
		gvo.setMap(map);

	}

	public void setIndex(int index) {
		this.index = index;
	}

	@Override
	public void newStar(int curX, int curY) {

		ObjectVO vo = new ObjectVO();
		vo.setCurX(curX);
		vo.setCurY(curY);

		starList.add(vo);

		index = starList.size() - 1;

	}

	public void print() {

		String[][] map = gvo.getMap();

		for (int i = 0; i < gvo.getMaxX(); i++) {
			for (int j = 0; j < gvo.getMaxY(); j++) {
				System.out.printf("%s", map[i][j]);
			}
			System.out.println();
		}

	}

	@Override
	public void up() {

		String[][] map = gvo.getMap();
		int curX = starList.get(index).getCurX();
		int curY = starList.get(index).getCurY();
		
		
		if (!colision(--curX, curY)) {

			map[curX][curY] = "-";
			starList.get(index).setCurX(++curX);
			map[curX][curY] = "*";

			gvo.setMap(map);

		}else{
			map[curX][curY] = "*";
			starList.get(index).setCurX(curX);
			curX++;
			map[curX][curY] = " ";
			gvo.setMap(map);
			
		}

	}

	@Override
	public void down() {

		String[][] map = gvo.getMap();
		int curX = starList.get(index).getCurX();
		int curY = starList.get(index).getCurY();
		
		
		if (!colision(++curX, curY)) {

			map[curX][curY] = "-";
			starList.get(index).setCurX(--curX);
			map[curX][curY] = "*";

			gvo.setMap(map);

		}else{
			map[curX][curY] = "*";
			starList.get(index).setCurX(curX);
			curX--;
			map[curX][curY] = " ";
			gvo.setMap(map);
			
		}

	}

	@Override
	public void left() {
		
		String[][] map = gvo.getMap();
		int curX = starList.get(index).getCurX();
		int curY = starList.get(index).getCurY();
		
		
		if (!colision(curX, --curY)) {

			map[curX][curY] = " ";
			starList.get(index).setCurY(++curY);
			map[curX][curY] = "*";

			gvo.setMap(map);

		}else{
			map[curX][curY] = "*";
			starList.get(index).setCurY(curY);
			curY++;
			map[curX][curY] = " ";
			gvo.setMap(map);
			
		}
	}

	@Override
	public void right() {
		
		String[][] map = gvo.getMap();
		int curX = starList.get(index).getCurX();
		int curY = starList.get(index).getCurY();
		
		
		if (!colision(curX, ++curY)) {

			map[curX][curY] = " ";
			starList.get(index).setCurY(--curY);
			map[curX][curY] = "*";

			gvo.setMap(map);

		}else{
			map[curX][curY] = "*";
			starList.get(index).setCurY(curY);
			curY--;
			map[curX][curY] = " ";
			gvo.setMap(map);
			
		}

		
	}

	public boolean colision(int x, int y) {

		if (x < 1 || y < 1 || x > gvo.getMaxX() - 2 || y > gvo.getMaxY() - 2) {
			return false;
		}
		return true;
	}

	public void clear() {

		for (int i = 0; i < 5; i++)
			System.out.println();
		System.out.println("L:a R:d U:w D:s exit:e changeObject:c createObject:o ");

	}

	public boolean exit() {

		for (int i = 0; i < 10; i++)
			System.out.println();
		System.out.println("Á¾·á");

		return false;
	}

}
