package com.Assignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.Font;
public class Screen extends JFrame implements ActionListener{
	
	//the variables for the gui
	//includes the variable from the class Files 
	//and calculate from Words which calculates the percentage of the similarity of the files
	JButton         b1,b2,b3;
	JLabel          l1,l2;
	JPanel          south,centre,north,east,west,southwest;
	JTextField      t1,t2;
	Files           f1,f2;
	Comparison      calculate;
	String     result,textField = "Enter here",checkFile = "Check";
	//the title comes from the control class in this package
	public Screen(String Title) {
		super(Title);
		//setting the size and the layout of the gui
		setSize(750,350);
		setLayout(new BorderLayout());
		//the labels for the text fields
		l1 = new JLabel("First File");
		l2 = new JLabel("Second File");
		//the buttons
		b1 = new JButton(checkFile);
		b2 = new JButton(checkFile);
		b3 = new JButton("Calculate");
		t1 = new JTextField(textField);
		t2 = new JTextField(textField);
		//sending to the action listener when the button is clicked
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		//setting font for the labels and the buttons to make then more clearer
		l1.setFont(new Font("Calibri",Font.BOLD,14));
		l2.setFont(new Font("Calibri",Font.BOLD,14));
		b1.setFont(new Font("Sans Serif", Font.PLAIN,10));
		b2.setFont(new Font("Sans Serif",Font.PLAIN,10));
		b3.setFont(new Font("Sans Serif",Font.BOLD,16));
		
		//jpanels created to the location of items
		centre = new JPanel();
		south  = new JPanel();
		north  = new JPanel();
		west   = new JPanel();
		east   = new JPanel();
		
		//adding to the screen
		west.add(l1);
		west.add(t1);
		west.add(b1);
		east.add(l2);
		east.add(t2);
		east.add(b2);
		south.add(b3);
		
		//this is for info for the user in case the name is not entered 
		t1.setToolTipText("Enter the File name");
		t2.setToolTipText("Enter the File name");
		b1.setToolTipText("Check is the first file is here");
		b2.setToolTipText("Check is the second file is here");
		b3.setToolTipText("Calculate result of the comparison of files");
		
		//setting the display of the layout to different places of the gui
		add(centre, BorderLayout.CENTER);
		add(south, BorderLayout.SOUTH);
		add(north,BorderLayout.NORTH);
		add(west, BorderLayout.WEST);
		add(east,BorderLayout.EAST);
		
		//makes it visible and closes the application once the red x button is clicked
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//this is where the button functionalities function if they are clicked
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== b1) {
			//if t1 is blank or remains the same without changing the field
			if(t1.getText().equals("") || t1.getText().equals("Enter here")) {
				JOptionPane.showMessageDialog(this,"There is nothing entered in the First box");
			}
			//creates File object and check if it exists
			else {
				f1 = new Files(t1.getText());
				f1.open();
				//checks if file does exist
				if(f1.check()) {
					JOptionPane.showMessageDialog(this, "The File exists");
				}
				else {
					JOptionPane.showMessageDialog(this, "The File does not exist. Try again!");
				}
			}
		}
		else if (e.getSource()==b2) {
			//same as for t1 above on line 91
			if(t2.getText().equals("")|| t2.getText().equals("Enter file name here")) {
				JOptionPane.showMessageDialog(this,"There is nothing entered in the Second box");
			}
			else {
				f2 = new Files(t2.getText());
				f2.open();
				if(f2.check()) {
					JOptionPane.showMessageDialog(this, "The File exists");
				}
				else {
					JOptionPane.showMessageDialog(this, "The File does not exist. Try again!");
				}
			}
		}
		else if (e.getSource()==b3) {
			//if both objects are initialized calculate and close the files
			if(f1!=null && f2!=null) {
				calculate = new Comparison();
				result    = calculate.count(f1, f2);
				JOptionPane.showMessageDialog(this, result);
				f1.close();
				f2.close();
			}
			//if one or more of the objects has not been initialized
			else if (f1!=null&& f2==null) {
				JOptionPane.showMessageDialog(this, "File 2 has not been entered please enter it again");
			}
			else if (f1==null && f2!=null) {
				JOptionPane.showMessageDialog(this, "File 1 has not been entered please try again");
			}
			else {
				JOptionPane.showMessageDialog(this, "Please enter both file names");
			}
		}
	}

}
