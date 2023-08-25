package Application;

import javax.swing.SwingUtilities;

import controller.Controller;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//System.out.println("hello");
		SwingUtilities.invokeLater(Controller::new);
	}

}
