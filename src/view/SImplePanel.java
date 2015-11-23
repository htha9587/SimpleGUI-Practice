package view;

import java.awt.event.*;
import javax.swing.JPanel;
import java.awt.event.MouseListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import controller.SimpleController;
import java.awt.Color;
/**
 * 11-11-15
 * @author htha9587
 *
 */


public class SImplePanel extends JPanel
{
	
	private SimpleController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	
	public SImplePanel (SimpleController baseController)
	{
	
	this.baseController = baseController;
	baseLayout = new SpringLayout();
	firstButton = new JButton("Don't touch me!");
	firstTextField = new JTextField("Type in here!");
	
	
	
	setUpPanel();
	setUpLayout();
	setUpListeners();
	}
	/**
	 * Loads content into panel.
	 */
	
	private void setUpPanel()
	{
		this.setLayout(baseLayout); // Needs to be first line of setup.
		this.add(firstButton);
		this.add(firstTextField);
		
		JButton btnNewButton_1 = new JButton("New button");
		baseLayout.putConstraint(SpringLayout.WEST, btnNewButton_1, 34, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_1, -48, SpringLayout.SOUTH, this);
		add(btnNewButton_1);
		
		
	}
	
	private void setUpLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 63, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 129, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 154, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstTextField, -6, SpringLayout.NORTH, firstButton);
	}
	
	
	private void setUpListeners()
	{
		firstButton.addActionListener(new ActionListener()
		
		
		{
			public void actionPerformed(ActionEvent click)
			{
				firstTextField.setText("Don't click me!");
			}
		
		});
		
		
		
		this.addMouseListener(new MouseListener()
		{
			public void mouseClicked(MouseEvent clicked)
			{
//				changeRandomColor();
			}
			
			public void mouseReleased(MouseEvent released)
			{
				changeRandomColor();
			}
			
			public void mousePressed(MouseEvent pressed)
			{
				
			}
			public void mouseEntered(MouseEvent entered)
			{
//				changeRandomColor();
			}
			
			public void mouseExited(MouseEvent exited)
			{
//				changeRandomColor();
			}
		});
	
	
	this.addMouseMotionListener(new MouseMotionListener()
	{
		public void mouseMoved(MouseEvent moved)
		{
			
		}
		
		public void mouseDragged(MouseEvent dragged)
		{
			
		}
	});
}
	private void changeRandomColor()
	{
		int red, green, blue;
		
		red = (int) (Math.random() * 256);
		green = (int) (Math.random() * 256);
		blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
	}
}
