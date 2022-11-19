package us.salmansaeed.swing;

import java.awt.HeadlessException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class MySwing extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MySwing() {

		setSize(300, 200);
		setTitle("Simple");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		}

		public static void main(String[] args) throws HeadlessException {

			MySwing mySwing = new MySwing();
			mySwing.setVisible(true);
			mySwing.setSize(800, 400);
			mySwing.setTitle("Salman Saeed");
			
			//Create a file chooser
			final JFileChooser fc = new JFileChooser();
			//In response to a button click:
			try {
				int returnVal = fc.showOpenDialog(null);
				System.out.println(returnVal);
			} catch (HeadlessException e) {
				
				e.printStackTrace();
			}
			
		}
	
}
