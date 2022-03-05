package main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GreskaPoruka extends Frame {

	
	public GreskaPoruka(String info,String naslov){
		super();
		setSize(100,150);
		setLocation(700,200);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				dispose();
			}
		});
		Dialog d = new Dialog(this,naslov,true);
		d.setLocation(700,200);
		
		d.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				dispose();
			}
		});
		
		d.setLayout(new GridLayout(2,1));
		Label Msg = new Label(info);
		Button okB = new Button("OK");
		d.add(Msg);
		d.add(okB);
		d.setSize(100,100);
		okB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				GreskaPoruka.this.dispose();
			}
			
		});
		 d.setVisible(true); 
		
	}
}
