package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public void add2() {
		ArrayList<Integer> arr = new ArrayList();
		Random rand = new Random();
		arr.add(rand.nextInt(30));
		arr.add(rand.nextInt(30));
	}
	public void add() {
		ArrayList<Integer> arr = new ArrayList();
		Random rand = new Random();
		arr.add(rand.nextInt(30));
	}
	public void tellJoke() {
		System.out.println("Why did the chicken cross the road? To get to the other side LOL!!!!!");
	}
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		
		addNumbers.addActionListener(e->add2());
		randNumber.addActionListener(e->add());
		tellAJoke.addActionListener(e->tellJoke());
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
