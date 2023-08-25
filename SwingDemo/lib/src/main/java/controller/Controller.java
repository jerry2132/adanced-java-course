package controller;
import gui.MainFrame;
import gui.MainPanel;
public class Controller {
	private MainFrame mainFrame;
	private MainPanel mainPanel;
	
	public Controller ()
	{
		mainPanel = new MainPanel();
		mainPanel.setFormListener((username, pass) ->
		{
			System.out.println(username +pass);
		});
		mainFrame = new MainFrame();
		mainFrame.setContentPane(mainPanel);
	}
}
