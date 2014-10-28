import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Simulador extends JFrame implements ActionListener{
	
	JMenuItem nuevo,open,salir,borrar,save,help,about;
	JButton and,nand,or,nor,not,xor,xnor;
	ImageIcon imagen;
	Icon icono;
	public Simulador(){
		//se crea un menu de barra
		JMenuBar Barra= new JMenuBar();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(720,500);
		setBounds(100,100,100,100);
		setResizable(false);
		setTitle("LogiCTec");
		setLocationRelativeTo(null);
		setLayout(null);
		JLabel text= new JLabel("Compuertas Logicas");
		
		//se crea el boton and
		JButton and=new JButton();
		and.setBounds(0,0,130,50);
		imagen= new ImageIcon("and.png");
		icono=new ImageIcon(imagen.getImage().getScaledInstance(and.getWidth(),and.getHeight(),Image.SCALE_DEFAULT));
		and.setIcon(icono);
		
		//se crea el boton nand
		JButton nand=new JButton();
		nand.setBounds(0,50,130,50);
		imagen= new ImageIcon("nand.jpg");
		icono=new ImageIcon(imagen.getImage().getScaledInstance(and.getWidth(),and.getHeight(),Image.SCALE_DEFAULT));
		nand.setIcon(icono);
		
		//se crea el boton or
		JButton or=new JButton();
		or.setBounds(0,100,130,50);
		imagen= new ImageIcon("or.jpg");
		icono=new ImageIcon(imagen.getImage().getScaledInstance(and.getWidth(),and.getHeight(),Image.SCALE_DEFAULT));
		or.setIcon(icono);
				
		//se crea el boton nor
		JButton nor=new JButton();
		nor.setBounds(0,150,130,50);
		imagen= new ImageIcon("nor.png");
		icono=new ImageIcon(imagen.getImage().getScaledInstance(and.getWidth(),and.getHeight(),Image.SCALE_DEFAULT));
		nor.setIcon(icono);
		
		//se crea el boton not
		JButton not=new JButton();
		not.setBounds(0,200,130,50);
		imagen= new ImageIcon("not.jpeg");
		icono=new ImageIcon(imagen.getImage().getScaledInstance(and.getWidth(),and.getHeight(),Image.SCALE_DEFAULT));
		not.setIcon(icono);
				
		//se crea el boton xor
		JButton xor=new JButton();
		xor.setBounds(0,250,130,50);
		imagen= new ImageIcon("xor.jpg");
		icono=new ImageIcon(imagen.getImage().getScaledInstance(and.getWidth(),and.getHeight(),Image.SCALE_DEFAULT));
		xor.setIcon(icono);
		
		//se crea el boton xnor
		JButton xnor=new JButton();
		xnor.setBounds(0,300,130,50);
		imagen= new ImageIcon("xnor.jpg");
		icono=new ImageIcon(imagen.getImage().getScaledInstance(and.getWidth(),and.getHeight(),Image.SCALE_DEFAULT));
		xnor.setIcon(icono);
			
		
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
		
        add(text);
	    add(and);
	    add(nand);
	    add(or);
	    add(nor);
	    add(not);
	    add(xor);
	    add(xnor);
	    setJMenuBar(Barra);
		
		setVisible(true);

	}
	
	public static void main(String[] args) {
		Simulador game= new Simulador();
		game.pack();
	}

	public void actionPerformed(ActionEvent e) {//sobreescribimos el metodo del listener
		if(e.getSource()==nuevo){
			System.out.println("preciosa");
			
		}
		if(e.getSource()==salir){
			System.exit(0);
		}
		
	}

}
