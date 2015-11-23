package view;

import javax.swing.JFrame;
import controller.SimpleController;
/**
 * Creates JFrame for practice app.
 * Version 1.0
 * @author htha9587
 *11-11-15 Added GUI reference.
 */


public class SimpleView extends JFrame
{
	private SimpleController baseController;
	private SImplePanel basePanel;
	
	public SimpleView(SimpleController baseFrame)
	{
		this.baseController = baseFrame; // Assign data member parameter.
		basePanel = new SImplePanel(baseFrame); // Creates SimplePanel instance with controller reference.
		setUpFrame();
	}
	/**
	 * Helper method to setup frame and its structures.
	 */
	
	private void setUpFrame()
	{
		this.setContentPane(basePanel);	// Required for GUIFrame.
		this.setResizable(false);		// Optional.
		this.setTitle("GUI Practice App"); // Sets title.
		this.setSize(400,400);			// Sets size.
		this.setVisible(true);			// Must be last line in SetupFrame method.
	}
	
	public SimpleController getBaseController()
	{
		return baseController;
	}
}
