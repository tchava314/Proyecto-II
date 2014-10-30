package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Acerca extends JFrame implements ActionListener{
	JLabel texto, texto1, texto2, texto3;
	JButton ok;
	
	public Acerca(){
		setSize(760,530); //tamano de la ventana
		setTitle("Acerca de LigiCTec"); //titulo de la ventana
		//JTextPane area = new JTextPane();
		ok= new JButton("OK");
		ok.setBackground(new Color(5,25,255));
		ok.addActionListener(this);
		texto= new JLabel("Realizado por:"); //etiqueta
		add(ok);
		add(texto);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		if (e.getSource()==ok){
			setVisible(false);
		}
	}
}

