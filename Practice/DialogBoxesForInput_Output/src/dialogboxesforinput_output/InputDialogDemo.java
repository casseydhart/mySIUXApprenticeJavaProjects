package dialogboxesforinput_output;

import javax.swing.JOptionPane;
public class InputDialogDemo 
{

	public static void main(String[] args) 
	{
		String name;
		
		//	Get the user's name.
		name = JOptionPane.showInputDialog("What is your name? ");
		
		//	Display message
		JOptionPane.showMessageDialog(null, "Hello "+ name);
	}

}
