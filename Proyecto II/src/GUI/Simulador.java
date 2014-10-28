package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Simulador extends JFrame implements ActionListener{
	
	JMenuItem nuevo,open,salir,borrar,save,help,about;
	public Simulador(){
		JPanel panel1 = new JPanel();
		//se crea un menu de barra
		JMenuBar Barra= new JMenuBar();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(720,500);
		setTitle("LogiCTec");
		setLocationRelativeTo(null);
		setLayout(new GridLayout(0,5));
		JLabel text= new JLabel("Compuertas Logicas");
		
	    panel1.setLayout(new GridLayout(8,0,4,4));
	    panel1.add(text);
	    panel1.add(new JButton("AND"));
	    panel1.add(new JButton("NAND"));
	    panel1.add(new JButton("OR"));
	    panel1.add(new JButton("NOR"));
	    panel1.add(new JButton("NOT"));
	    panel1.add(new JButton("XOR"));
	    panel1.add(new JButton("XNOR"));
		
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
		
        

	    add(panel1);
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
