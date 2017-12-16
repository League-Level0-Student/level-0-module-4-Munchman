//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nic = JOptionPane.showInputDialog("how many nickles do you have?");
		// Convert their answer to an int using Integer.parseInt()
		int ni = Integer.parseInt(nic);
		// Ask the user how many dimes they have, and convert their answer
		String dim = JOptionPane.showInputDialog("how many dimes do you have?");
		int di = Integer.parseInt(dim);
		// Ask the user how many quarters they have, and convert their answer
		String qua = JOptionPane.showInputDialog("how many quarters do you have?");
		int qu = Integer.parseInt(qua);
		// Calculate how much money the user has and save it in a double variable
		double q = qu * 0.25;
		double d = di * 0.10;
		double n = ni * 0.05;
		double answer = ni + qu + ni;
		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, "you have " + answer + " dollars!");
	}
}
