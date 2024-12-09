package main;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

//Help from https://www.youtube.com/watch?v=Yemr-z4ZcYk
public class RatingFrame extends JFrame{
	
	JLabel rateLabel = new JLabel();
	JTextField rateInputField;
	JButton submitRating;
	
	public RatingFrame() {
		//setup for rate JFrame
		setTitle("Rate");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		rateLabel.setText("Please rate your experience on a scale of 1 - 5:");
		//
		rateInputField = new JTextField(15);
		submitRating = new JButton("Submit");
		//Setup for button click
		submitRating.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//gets user input from text field and validates it
				if(ratingValidation(rateInputField.getText())) {
					JOptionPane.showMessageDialog(null, "Thank you for the feedback!", "Rating Result", JOptionPane.INFORMATION_MESSAGE);
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "Invalid Rating, rating must be between 1 and 5.", "Rating Result", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		add(rateLabel);
		add(rateInputField);
		add(submitRating);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	//retrieves a string and converts it to an integer, if successful return true
	private boolean ratingValidation(String input) {
		int rating = Integer.parseInt(input);
		return rating >= 1 && rating <= 5;
	}

}
