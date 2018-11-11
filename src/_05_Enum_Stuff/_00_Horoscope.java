package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category
	// for
	// all 12 zodiac signs.

	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane
	// to display
	// a different horoscope based on the Zodiac's state.
	public static void horoscope(Zodiac z) {
		switch (z) {
		case ARIES:
			JOptionPane.showMessageDialog(null, "Horoscopes are dumb but u Aries");
			break;
		case TAURUS:
			JOptionPane.showMessageDialog(null, "Bullsh*t");
			break;
		case GEMINI:
			JOptionPane.showMessageDialog(null, "I remember this from Beyblade");
			break;
		case CANCER:
			JOptionPane.showMessageDialog(null, "Lmao");
			break;
		case LEO:
			JOptionPane.showMessageDialog(null, "I think this one's me");
			break;
		case VIRGO:
			JOptionPane.showMessageDialog(null, "More like virgin pepeD xddd");
			break;
		case LIBRA:
			JOptionPane.showMessageDialog(null, "What do you call an offspring between a library and a zebra?");
			break;
		case SCORPIO:
			JOptionPane.showMessageDialog(null, "This little guy's scary");
			break;
		case SAGITTARIUS:
			JOptionPane.showMessageDialog(null, "I also remember this from Beyblade");
			break;
		case CAPRICORN:
			JOptionPane.showMessageDialog(null, "More like candycorn lul");
			break;
		case AQUARIUS:
			JOptionPane.showMessageDialog(null, "Aquaman?");
			break;
		case PISCES:
			JOptionPane.showMessageDialog(null, "Why tf u saying fish");
			break;
		}
	}

	// 3. Make a main method to test your method
	public static void main(String[] args) {
		Zodiac z = Zodiac.PISCES;
		horoscope(z);
	}
}
