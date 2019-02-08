package _05_Enum_Stuff;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _00_Horoscope {

	/*
	 * _00_Horoscope() { /*JOptionPane.showMessageDialog(null,
	 * "Pick a Zodiac Sign for a Horoscope!"); JFrame mainFrame = new JFrame();
	 * JPanel mainPanel = new JPanel(); //JLabel label1 = new JLabel(); JButton
	 * AriesB = new JButton(); JButton TaurusB = new JButton(); JButton GeminiB =
	 * new JButton(); JButton CancerB = new JButton(); JButton LeoB = new JButton();
	 * JButton VirgoB = new JButton(); JButton LibraB = new JButton(); JButton
	 * ScorpioB = new JButton(); JButton SagittariusB = new JButton(); JButton
	 * CapricornB = new JButton(); JButton AquariusB = new JButton(); JButton
	 * PiscesB = new JButton(); mainFrame.add(mainPanel); //mainPanel.add(label1);
	 * mainPanel.add(AriesB); mainPanel.add(TaurusB); mainPanel.add(GeminiB);
	 * mainPanel.add(CancerB); mainPanel.add(LeoB); mainPanel.add(VirgoB);
	 * mainPanel.add(LibraB); mainPanel.add(ScorpioB); mainPanel.add(SagittariusB);
	 * mainPanel.add(CapricornB); mainPanel.add(AquariusB); mainPanel.add(PiscesB);
	 * mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 * mainFrame.setVisible(true); mainFrame.pack(); }
	 */

	// 1. Create an enum in a separate file called Zodiac that contains a category
	// for
	// all 12 zodiac signs.

	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane
	// to display
	// a different horoscope based on the Zodiac's state.

	// 3. Make a main method to test your method

	static void horoscopes(Zodiac Zodiacs) {
		// Zodiac Zodiacs = Zodiac.ARIES;
		// ARIES, TAURUS, GEMINI, CANCER, LEO, VIRGO, LIBRA, SCORPIO, SAGITTARIUS,
		// CAPRICORN, AQUARIUS, PISCES

		switch (Zodiacs) {
		case ARIES: {
			JOptionPane.showMessageDialog(null, "Your horoscope game is CounterStrike: Global Offensive!");
			break;
		}
		case TAURUS: {
			JOptionPane.showMessageDialog(null, "Your horoscope game is Terraria!");
			break;
		}
		case GEMINI: {
			JOptionPane.showMessageDialog(null, "Your horoscope game is Minecraft!");
			break;
		}
		case CANCER: {
			JOptionPane.showMessageDialog(null, "Your horoscope game is Grand Theft Auto V!");
			break;
		}
		case LEO: {
			JOptionPane.showMessageDialog(null, "Your horoscope game is Call of Duty!");
			break;
		}
		case VIRGO: {
			JOptionPane.showMessageDialog(null, "Your horoscope game is Pac-Man!");
			break;
		}
		case LIBRA: {
			JOptionPane.showMessageDialog(null, "Your horoscope game is Mass Effect!");
			break;
		}
		case SCORPIO: {
			JOptionPane.showMessageDialog(null, "Your horoscope game is Tetris!");
			break;
		}
		case SAGITTARIUS: {
			JOptionPane.showMessageDialog(null, "Your horoscope game is God of War!");
			break;
		}
		case CAPRICORN: {
			JOptionPane.showMessageDialog(null, "Your horoscope game is Mario!");
			break;
		}
		case AQUARIUS: {
			JOptionPane.showMessageDialog(null, "Your horoscope game is Halo!");
			break;
		}
		case PISCES: {
			JOptionPane.showMessageDialog(null, "Your horoscope game is Wii Sports!");
			break;
		}
		}

	}

	public static void main(String[] args) {
		String ZodiacEntered = JOptionPane.showInputDialog("Type in your zodiac for a horoscope! Only enter a zodiac!");
		switch (ZodiacEntered) {
		case "Aries": {
			horoscopes(Zodiac.ARIES);
			break;
		}
		case "Taurus": {
			horoscopes(Zodiac.ARIES);
			break;
		}
		case "Gemini": {
			horoscopes(Zodiac.GEMINI);
			break;
		}
		case "Cancer": {
			horoscopes(Zodiac.CANCER);
			break;
		}
		case "Leo": {
			horoscopes(Zodiac.LEO);
			break;
		}
		case "Virgo": {
			horoscopes(Zodiac.VIRGO);
			break;
		}
		case "Libra": {
			horoscopes(Zodiac.LIBRA);
			break;
		}
		case "Scorpio": {
			horoscopes(Zodiac.SCORPIO);
			break;
		}
		case "Sagittarius": {
			horoscopes(Zodiac.SAGITTARIUS);
			break;
		}
		case "Capricorn": {
			horoscopes(Zodiac.CAPRICORN);
			break;
		}
		case "Aquarius": {
			horoscopes(Zodiac.AQUARIUS);
			break;
		}
		case "Pisces": {
			horoscopes(Zodiac.PISCES);
			break;
		}
		}
	}
}
