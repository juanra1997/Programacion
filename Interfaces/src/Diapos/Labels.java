package Diapos;

import javax.swing.*;

public class Labels {

	public Labels(/*JLabel label, */String titulo, int x, int y/*, int w, int h*/) {
		JLabel label=new JLabel();
		label.setText(titulo);
		label.setBounds(x,y,70,20);
		JTextField texto=new JTextField();
		texto.setBounds((100+x),y,100,20);
	}
}
