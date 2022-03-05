package geometrija;

import java.awt.Graphics;

public class Tacka {
	private int x,y;
	
	public Tacka(int x, int y) {
		this.x = x;
		this.y = y;
	}


	public static void crtajLiniju(Tacka t1,Tacka t2, Graphics g) {
		g.drawLine(t1.x, t1.y, t2.x, t2.y);
	}
	public static Tacka centarLinije(Tacka t1,Tacka t2) {
		return new Tacka((int)((t1.x+t2.x)/2),(int)((t1.y+t2.y)/2));
	}
}
