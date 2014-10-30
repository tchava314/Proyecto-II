package GUI;

import java.awt.*;
import java.awt.event.*;
import java.net.URL;

import javax.swing.*;


public class Simulador extends JFrame implements ActionListener{
	
	JMenuItem nuevo,open,salir,borrar,save,help,about;
	JButton and,nand,or,nor,not,xor,xnor;
	ImageIcon imagen;
	Icon icono;
	public Simulador(){
		//se crea un menu de barra
		JMenuBar Barra= new JMenuBar();
		setResizable(false);
		setTitle("LogiCTec");
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel text= new JLabel("Compuertas Logicas");
		
		//se crea el boton and
		JButton and=new JButton();
		and.setBounds(0,0,140,60);
		imagen= new ImageIcon("and.png");
		icono=new ImageIcon(imagen.getImage().getScaledInstance(and.getWidth(),and.getHeight(),Image.SCALE_DEFAULT));
		and.setIcon(icono);
		
		//se crea el boton nand
		JButton nand=new JButton();
		nand.setBounds(0,70,140,60);
		imagen= new ImageIcon("nand.jpg");
		icono=new ImageIcon(imagen.getImage().getScaledInstance(and.getWidth(),and.getHeight(),Image.SCALE_DEFAULT));
		nand.setIcon(icono);
		
		//se crea el boton or
		JButton or=new JButton();
		or.setBounds(0,140,140,60);
		imagen= new ImageIcon("or.jpg");
		icono=new ImageIcon(imagen.getImage().getScaledInstance(and.getWidth(),and.getHeight(),Image.SCALE_DEFAULT));
		or.setIcon(icono);
				
		//se crea el boton nor
		JButton nor=new JButton();
		nor.setBounds(0,210,140,60);
		imagen= new ImageIcon("nor.png");
		icono=new ImageIcon(imagen.getImage().getScaledInstance(and.getWidth(),and.getHeight(),Image.SCALE_DEFAULT));
		nor.setIcon(icono);
		
		//se crea el boton not
		JButton not=new JButton();
		not.setBounds(0,280,140,60);
		imagen= new ImageIcon("not.jpeg");
		icono=new ImageIcon(imagen.getImage().getScaledInstance(and.getWidth(),and.getHeight(),Image.SCALE_DEFAULT));
		not.setIcon(icono);
				
		//se crea el boton xor
		JButton xor=new JButton();
		xor.setBounds(0,350,140,60);
		imagen= new ImageIcon("xor.jpg");
		icono=new ImageIcon(imagen.getImage().getScaledInstance(and.getWidth(),and.getHeight(),Image.SCALE_DEFAULT));
		xor.setIcon(icono);
		
		//se crea el boton xnor
		JButton xnor=new JButton();
		xnor.setBounds(0,420,140,60);
		imagen= new ImageIcon("xnor.jpg");
		icono=new ImageIcon(imagen.getImage().getScaledInstance(and.getWidth(),and.getHeight(),Image.SCALE_DEFAULT));
		xnor.setIcon(icono);
			
		/*
		JPanel panel1= new JPanel();
		imagen= new ImageIcon("cuadricula.jpg");
		icono=new ImageIcon(imagen.getImage().getScaledInstance(300,100,Image.SCALE_DEFAULT));
		*/
		
	    //se crean submenus 
        JMenu fileMenu = new JMenu("Archivo");
        JMenu opcMenu = new JMenu("Opciones");
        Barra.add(fileMenu);
        Barra.add(opcMenu);
        
        //todas las opciones
        nuevo = new JMenuItem("Nuevo");
        nuevo.addActionListener(this);
        open = new JMenuItem("Abrir");
        open.addActionListener(this);
        salir = new JMenuItem("Salir");
        salir.addActionListener(this);
        borrar = new JMenuItem("Borrar");
        borrar.addActionListener(this);
        save = new JMenuItem("Guardar");
        save.addActionListener(this);
        help = new JMenuItem("Ayuda");
        help.addActionListener(this);
        about = new JMenuItem("Acerca de...");
        about.addActionListener(this);
        
        //crea la opcion con un cuadrito
        JCheckBoxMenuItem revisar = new JCheckBoxMenuItem("Revisar");
        
        //anade las opciones a ambos submenus
        fileMenu.add(nuevo);
        fileMenu.add(open);
        fileMenu.add(revisar);
        fileMenu.addSeparator();
        fileMenu.add(salir);
        opcMenu.add(borrar);
        opcMenu.add(save);
        opcMenu.addSeparator();
        opcMenu.add(help);
        opcMenu.add(about);
	    fondoMenu fondo= new fondoMenu();
	    
	    
	    
        add(text);
	    add(and);
	    add(nand);
	    add(or);
	    add(nor);
	    add(not);
	    add(xor);
	    add(xnor);
	    setJMenuBar(Barra);
	    add(fondo);
	    
	    
	    
		setVisible(true);

	}
	public class fondoMenu extends JPanel{ //se crea un panel para la imagen
		public Image imagenFondo;
		public URL fondo;
		
		public fondoMenu(){
			setSize(800,530);
		}
		public void paintComponent(Graphics g){
		    ImageIcon imagenFondo= new ImageIcon(getClass().getResource("cuadricula.jpg")); 
			g.drawImage(imagenFondo.getImage(), 160, 0, getWidth(), getHeight(), this); //ubica la imagen
		}
	}
	

	public static void main(String[] args) {
		Simulador game= new Simulador();
		game.pack();
		game.setSize(760,530);
	}

	public void actionPerformed(ActionEvent e) {//sobreescribimos el metodo del listener
		if(e.getSource()==nuevo){
			System.out.println("preciosa");
			
		}
		if(e.getSource()==salir){
			System.exit(0);
		}
		if (e.getSource()==about){
			Acerca acerca= new Acerca();
			
			
		}
		
	}

}
