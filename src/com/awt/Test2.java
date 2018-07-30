package com.awt;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Test2  extends Frame implements WindowListener {
	
	@Override
	public void windowActivated(WindowEvent arg0) {
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
	}

	private static final long serialVersionUID = 1L;
	
	public Test2(){
		
		setTitle("자바윈도우");
		setSize(200,300);
		setVisible(true);
		
		addWindowListener(this);
		
	}

	public static void main(String[] args) {
		
		Test2 ob = new Test2();
		
		
	}

}
