package controller;

import view.SimpleView;
/**
 * Controller for GUI Practice Application.
 * @author htha9587
 *11-11-15
 *Version 1.0
 */

public class SimpleController 
{
	/**
	 * Reference to SimplePanel or SimpleView object of the view.
	 * Author; htha9587
	 * 11-11-15
	 */
	
	private SimpleView baseFrame;
	
	public SimpleController()
	{
		baseFrame = new SimpleView(this);
	}
	
	public void start()
	{
		
	}
}
