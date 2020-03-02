package com.lab5;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class Screen extends JFrame implements ActionListener,MouseListener{
	JButton b1,b2;
	JLabel l1,l2,l3;
	JRadioButton r1;
	JPanel south,centre,north,east,mousePanel;
	JTextField j1;
	
	public Screen(String Title) {
		super(Title);
		//setting the size and the layout
		setSize(450,450);
		setLayout(new BorderLayout());
		//the buttons
		b1 = new JButton("Click Me");
		b2 = new JButton("Click me too");
		//the radio button
		r1 = new JRadioButton("The button");
		//the labels
		l1 = new JLabel("My Java GUI");
		l2 = new JLabel("The one and only");
		//the follower of the mouse
		l3 = new JLabel("The LABEL");
		//the textfield
		j1 = new JTextField("Name");
		//sending to the action listener
		b1.addActionListener(this);
		b2.addActionListener(this);
		j1.addActionListener(this);
		r1.addActionListener(this);
		
		//creating the mouse and setting the color to red and adds it 
		mousePanel = new JPanel();
		mousePanel.setBackground(Color.red);
		mousePanel.addMouseListener(this);
		mousePanel.setOpaque(true);
		//creating where it will display
		centre = new JPanel();
		south = new JPanel();
		north = new JPanel();
		
		//adding to the screen
		mousePanel.add(l3);
		centre.add(l1);
		south.add(b1);
		south.add(b2);
		north.add(r1);
		centre.add(l2);
		centre.add(j1);
		centre.add(mousePanel);
		
		//this is for info for the user in case the name is not entered 
		j1.setToolTipText("Enter your name");
		
		//adding to the display in whatever format
		add(centre, BorderLayout.CENTER);
		add(south, BorderLayout.SOUTH);
		add(south, BorderLayout.SOUTH);
		add(north,BorderLayout.NORTH);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource()==b1) {
			JOptionPane.showMessageDialog(this,"You pressed The first button");
		}
		if(event.getSource()==b2) {
			JOptionPane.showMessageDialog(this, "You have pressed the second button");
		}
		if(event.getSource()==j1) {
			JOptionPane.showMessageDialog(this, "You have entered "+j1.getText());
		}
		if(event.getSource()==r1) {
			JOptionPane.showMessageDialog(this, "You have clicked the button");
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getButton() == 1) {
			l3.setText("The left side of the mouse has been clicked");
		}
		else {
			l3.setText("The right side of the mouse has been clicked");
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		l3.setText("Mouse is inside the panel");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		l3.setText("Mouse is outside the Panel");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
		
}
