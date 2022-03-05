package geometrija;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class Trougao {
	Tacka t1,t2,t3;

	public Trougao(Tacka t1, Tacka t2, Tacka t3) {
		super();
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
	}
	public void iscrtaj(Graphics g) {
		
		Tacka.crtajLiniju(t1, t2, g);
		Tacka.crtajLiniju(t1, t3, g);
		Tacka.crtajLiniju(t2, t3, g);
		
	}
	public List<Trougao> generisiPodTrouglove(){
		ArrayList<Trougao> trouglovi= new ArrayList<>();
		trouglovi.add(new Trougao(t1,Tacka.centarLinije(t1, t2),Tacka.centarLinije(t1, t3)));
		trouglovi.add(new Trougao(Tacka.centarLinije(t2, t1),t2,Tacka.centarLinije(t2, t3)));
		trouglovi.add(new Trougao(Tacka.centarLinije(t3, t1),Tacka.centarLinije(t3, t2),t3));
		return trouglovi;
	}
	public void crtajSierpinski(Graphics g,int dubina) {
		if(dubina==0)return;
		iscrtaj(g);
		List<Trougao> trouglovi= generisiPodTrouglove();
		for(Trougao t: trouglovi) {
			t.crtajSierpinski(g, dubina-1);
		}
	}
	
	
}
