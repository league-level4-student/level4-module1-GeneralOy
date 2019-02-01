package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		switch(choice) {
		case "Sunday":
			System.out.println("Sundays aren't good D:");
			break;
		case "Monday":
			System.out.println("Mondays are terrible ):<");
			break;
		case "Tuesday":
			System.out.println("Tuesdays suck ):");
			break;
		case "Wednesday":
			System.out.println("Wednesdays are meh |:");
			break;
		case "Thursday":
			System.out.println("Thursdays are okay :|");
			break;
		case "Friday":
			System.out.println("Fridays are great :)");
			break;
		case "Saturday":
			System.out.println("Saturdays are amazing :D");
			break;
		}
		
		//use a switch statement to do something cool for each option
		
	}
}
