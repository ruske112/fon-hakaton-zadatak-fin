package main;

import java.awt.Canvas;
import java.awt.Graphics;

import geometrija.*;

public class Crtac extends Canvas {
	private int dubina;
	
	public Crtac(int dubina) {
		this.dubina=dubina;
		//setSize(100, 200);
		this.setSize(800, 800);
	}
	
	public int getDubina() {
		return dubina;
	}

	public void setDubina(int dubina) {
		this.dubina = dubina;
	}

	@Override
	public void paint(Graphics g) {
		Trougao t = new Trougao( new Tacka(this.getWidth()/2,0), new Tacka(0,this.getHeight()), 
				new Tacka(this.getWidth(),this.getHeight()) );
		t.crtajSierpinski(g, dubina);
	}
}
