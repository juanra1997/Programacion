package Ejercicio29;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.regex.*;
import javax.swing.*;

public class Ejercicio29 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	/********************************************************************Parte Izquierda*********************************************************************************/
	JLabel info=new JLabel("Guardar persona");
	JLabel nombre=new JLabel("Nombre");
	JLabel apellidos=new JLabel("Apellidos");
	JLabel telefono=new JLabel("Telefono");
	JLabel nif=new JLabel("NIF");
	JTextField inombre=new JTextField();
	JTextField iapellidos=new JTextField();
	JTextField itelefono=new JTextField();
	JTextField inif=new JTextField();
	JButton save=new JButton("Guardar");
	JButton limpiar=new JButton("Limpiar");
	/********************************************************************Parte Derecha*********************************************************************************/
	JLabel rinfo=new JLabel("Recuperar persona");
	JLabel rnombre=new JLabel("Nombre");
	JLabel rapellidos=new JLabel("Apellidos");
	JLabel rtelefono=new JLabel("Telefono");
	JLabel rnif=new JLabel("NIF");
	JTextField rinombre=new JTextField();
	JTextField riapellidos=new JTextField();
	JTextField ritelefono=new JTextField();
	JTextField rinif=new JTextField();
	JButton recuperar=new JButton("Recuperar");
	JButton rlimpiar=new JButton("Limpiar");
	
	JButton borrar=new JButton("Borrar archivo");
	
	public static void main(String[] args) {
		
		File archivo =new File("persona");
		if(!archivo.exists()) {
			try {
				archivo.createNewFile();
			} catch (IOException e) {
				System.out.println("Algo ha salido mal");
			}
		}
		Ejercicio29 obj=new Ejercicio29();
		obj.miVentana();
	}
	
	public static void guardar(Persona per) {
		File archivo =new File("persona");
		/*No compruebo si existe o no el fichero ya que al ser unicamente un objeto persona puede crear el
		 archivo a la misma vez que el objeto persona, ya que no se van a guardar mas objetos persona*/
		
		try(ObjectOutputStream fs = new ObjectOutputStream(new FileOutputStream(archivo))){
			fs.writeObject(per);
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: Archivo no encontrado");
		} catch (IOException e) {
			System.out.println("ERROR: Problema en la escritura");
		}
	}

	public static Persona recuperar() {
		
		try(ObjectInputStream fs = new ObjectInputStream(new FileInputStream("persona"))){
			
			Persona leido=new Persona();
			leido=(Persona) fs.readObject();
			/*do {
				System.out.println(leido.toString());
				leido= (Persona) fs.readObject();
			}while(true);*/
			return leido;
		} catch (EOFException eof){
			//System.out.println("Algo ha salido mal");
			return new Persona();
		} catch (ClassNotFoundException e) {
			//System.out.println("ERROR: Problema al leer objeto");
			return new Persona();
		} catch (FileNotFoundException e1) {
			//System.out.println("ERROR: Archivo no encontrado");
			return new Persona();
		} catch (IOException e1) {
			//System.out.println("ERROR: Problema en la lectura");
			return new Persona();
		}
		
	}
	
	public void miVentana() {
		
		setLayout(null);
		setSize(350, 480);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		getContentPane().setBackground(Color.WHITE);
		
		/********************************************************************Parte Izquierda*********************************************************************************/
		
		//JLabel info=new JLabel("Guardar persona");
		
		info.setBounds(20, 20, 100, 20);
		add(info);
		
		//JLabel nombre=new JLabel("Nombre");
		
		nombre.setBounds(20, 50, 100, 20);
		add(nombre);
		
		//JLabel apellidos=new JLabel("Apellidos");
		
		apellidos.setBounds(20, 110, 100, 20);
		add(apellidos);
		
		//JLabel telefono=new JLabel("Telefono");
		
		telefono.setBounds(20, 170, 100, 20);
		add(telefono);
		
		//JLabel nif=new JLabel("NIF");
		
		nif.setBounds(20, 230, 100, 20);
		add(nif);
		
		//JTextField inombre=new JTextField();
		
		inombre.setBounds(20, 80, 100, 20);
		inombre.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		add(inombre);
		
		//JTextField iapellidos=new JTextField("Apellidos");
		
		iapellidos.setBounds(20, 140, 100, 20);
		iapellidos.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		add(iapellidos);
		
		//JTextField itelefono=new JTextField("Telefono");
		
		itelefono.setBounds(20, 200, 100, 20);
		itelefono.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		add(itelefono);
		
		//JTextField inif=new JTextField("NIF");
		
		inif.setBounds(20, 260, 100, 20);
		inif.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		add(inif);
		
		//JButton save=new JButton("Guardar");
		
		save.setBounds(20, 300, 100, 30);
		save.addActionListener(this);
		add(save);
		
		//JButton limpiar=new JButton("Limpiar");
		
		limpiar.setBounds(20, 350, 100, 30);
		limpiar.addActionListener(this);
		add(limpiar);
		
		
		/********************************************************************Parte Derecha*********************************************************************************/
		
		//JLabel rinfo=new JLabel("Guardar persona");
		
		rinfo.setBounds(220, 20, 120, 20);
		add(rinfo);
			
		//JLabel rnombre=new JLabel("Nombre");
				
		rnombre.setBounds(220, 50, 100, 20);
		add(rnombre);
				
		//JLabel rapellidos=new JLabel("Apellidos");
		
		rapellidos.setBounds(220, 110, 100, 20);
		add(rapellidos);
				
		//JLabel rtelefono=new JLabel("Telefono");
			
		rtelefono.setBounds(220, 170, 100, 20);
		add(rtelefono);
				
		//JLabel rnif=new JLabel("NIF");
				
		rnif.setBounds(220, 230, 100, 20);
		add(rnif);
				
		//JTextField rinombre=new JTextField();
				
		rinombre.setBounds(220, 80, 100, 20);
		rinombre.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		rinombre.setEditable(false);
		rinombre.setBackground(Color.WHITE);
		add(rinombre);
				
		//JTextField riapellidos=new JTextField("Apellidos");
				
		riapellidos.setBounds(220, 140, 100, 20);
		riapellidos.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		riapellidos.setEditable(false);
		riapellidos.setBackground(Color.WHITE);
		add(riapellidos);
				
		//JTextField ritelefono=new JTextField("Telefono");
				
		ritelefono.setBounds(220, 200, 100, 20);
		ritelefono.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		ritelefono.setEditable(false);
		ritelefono.setBackground(Color.WHITE);
		add(ritelefono);
				
		//JTextField rinif=new JTextField("NIF");
				
		rinif.setBounds(220, 260, 100, 20);
		rinif.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		rinif.setEditable(false);
		rinif.setBackground(Color.WHITE);
		add(rinif);
				
		//JButton recuperar=new JButton("Recuperar");
				
		recuperar.setBounds(220, 300, 100, 30);
		recuperar.addActionListener(this);
		add(recuperar);
			
		//JButton rlimpiar=new JButton("Limpiar");
				
		rlimpiar.setBounds(220, 350, 100, 30);
		rlimpiar.addActionListener(this);
		add(rlimpiar);
		
		//JButton borrar=new JButton("Borrar archivo");
		
		borrar.setBounds(110, 400, 120, 30);
		borrar.addActionListener(this);
		add(borrar);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==limpiar) {
			inombre.setText("");
			iapellidos.setText("");
			itelefono.setText("");
			inif.setText("");
		}
		
		if(e.getSource()==rlimpiar) {
			rinombre.setText("");
			riapellidos.setText("");
			ritelefono.setText("");
			rinif.setText("");
		}
		
		if(e.getSource()==save) {
			//DNI
			Pattern dnic=Pattern.compile("[0-9]{8}[A-HJ-NP-TV-Za-hj-np-tv-z]");
			Matcher dnim=dnic.matcher(inif.getText());
			//TELEFONO
			Pattern fijoc=Pattern.compile("^(8|9|7|6)\\d{8}");
			Matcher fijom=fijoc.matcher(itelefono.getText());
			//NOMBRE
			Pattern nombrec=Pattern.compile("[a-zA-Z\\s]*");
			Matcher nombrem=nombrec.matcher(inombre.getText());
			//APELLIDO
			Pattern apellidoc=Pattern.compile("[a-zA-Z\\s]*");
			Matcher apellidom=apellidoc.matcher(iapellidos.getText());
			if(inombre.getText().length()==0) {
				JOptionPane.showMessageDialog(null, "Introduce un nombre");
			}else if(inombre.getText().length()>10) {
				JOptionPane.showMessageDialog(null, "Nombre demasiado largo");
			}else if(!nombrem.matches()) {
				JOptionPane.showMessageDialog(null, "Introduce un nombre valido");
			}else if(iapellidos.getText().length()==0) {
				JOptionPane.showMessageDialog(null, "Introduce un apellido");
			}else if(iapellidos.getText().length()>20) {
				JOptionPane.showMessageDialog(null, "Apellido demasiado largo");
			}else if(!apellidom.matches()) {
				JOptionPane.showMessageDialog(null, "Introduce un apellido valido");
			}else if(itelefono.getText().length()==0) {
				JOptionPane.showMessageDialog(null, "Introduce un telefono");
			}else if(!fijom.matches()) {
				JOptionPane.showMessageDialog(null, "Introduce un telefono valido");
			}else if(inif.getText().length()==0) {
				JOptionPane.showMessageDialog(null, "Introduce un NIF");
			}else if(!dnim.matches()) {
				JOptionPane.showMessageDialog(null, "Introduce un NIF valido");
			}else {
				Persona per=new Persona(inombre.getText(), iapellidos.getText(), Integer.parseInt(itelefono.getText()), inif.getText());
				guardar(per);
			}
		}
		
		if(e.getSource()==recuperar) {
			rinombre.setText(recuperar().getNombre());
			riapellidos.setText(recuperar().getApellidos());
			ritelefono.setText(String.valueOf(recuperar().getTelefono()));
			rinif.setText(recuperar().getNif());
		}
		
		if(e.getSource()==borrar) {
			File archivo=new File("persona");
			if(!archivo.exists()) {
				JOptionPane.showMessageDialog(null, "El archivo no existe");
			}else {
				archivo.delete();
				JOptionPane.showMessageDialog(null, "El archivo ha sido borrado");
			}
		}
	}
}