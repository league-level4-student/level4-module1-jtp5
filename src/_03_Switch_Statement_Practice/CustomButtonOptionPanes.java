package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Saturday", "Friday", "Thursday", "Wednesday", "Tuesday", "Monday", "Sunday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];

		// use a switch statement to do something cool for each option
		switch (choice) {
		case "Sunday":
			System.out.println("That's Today!");
			break;
		case "Monday":
			System.out.println("Ew Mondays suck.");
			break;
		case "Tuesday":
			System.out.println("Tuesday's aight.");
			break;
		case "Wednesday":
			System.out.println("Hump day!");
			break;
		case "Thursday":
			System.out.println("It's the home stretch");
			break;
		case "Friday":
			System.out.println("FINALLY!!");
			break;
		case "Saturday":
			System.out.println("EZ Clap");
			break;
		}
	}
}
