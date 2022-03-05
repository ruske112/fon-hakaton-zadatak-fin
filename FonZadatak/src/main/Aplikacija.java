package main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Aplikacija extends Frame {
TextField unos= new TextField();
Button potvrda = new Button("Crtaj");
Crtac crtac = new Crtac(1);
	public Aplikacija() {
		
		Panel unosPanel = new Panel();
		unosPanel.setBackground(Color.cyan);
		unosPanel.add(new Label("Unesite dubinu rekuzije "));
		unos.setColumns(15);
		unosPanel.add(unos);
		potvrda.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String tekst=unos.getText();
				try {
				int dubina = Integer.parseInt(tekst);
				if(dubina<0)throw new Exception("Dubina ne sme biti manja od nule");
				crtac.setDubina(dubina);
				crtac.repaint();
				}
				catch(Exception err) {
					new GreskaPoruka(err.toString(),"Greska");
				}
			}
		});
		unosPanel.add(potvrda);
		
		this.add(unosPanel,BorderLayout.NORTH);
		this.add(crtac,BorderLayout.CENTER);
		setLocation(700,200);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				dispose();
			}
		});
		this.setName("Sierpinski-FON-MIRIN");
		this.setSize(800, 800);
		this.setResizable(true);
		pack();
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new Aplikacija();
		
	}

}
