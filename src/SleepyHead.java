
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		/*
		 * Ask the user for these values using JOptionPane.showConfirmDialog(null,
		 * "is it a weekday?", "", JOptionPane.YES_NO_OPTION);
		 */
		int yesno = JOptionPane.showConfirmDialog(null, "is it a weekday?", "", JOptionPane.YES_NO_OPTION);
		int noyes = JOptionPane.showConfirmDialog(null, "is it vacation?", "", JOptionPane.YES_NO_OPTION);
		System.out.println(noyes);
		System.out.println(yesno);
		if (noyes == 1) {
			JOptionPane.showMessageDialog(null, "sleep in");}
		else if (noyes==0) {
			JOptionPane.showMessageDialog(null, "WAKE UP! Your late!");
		}
		if (yesno==1) {
			JOptionPane.showMessageDialog(null, "sleep in");}
		}
		
		else if (yesno == 0) {
			JOptionPane.showMessageDialog(null, "WAKE UP! Your late!");
		}
		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday, print
		 * “get up lazybones!” If it is a weekday, and we are on vacation, print “sleep
		 * in”.
		 */
	}}
