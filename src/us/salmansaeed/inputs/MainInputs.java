package us.salmansaeed.inputs;

import java.util.Scanner;

public class MainInputs {

	public static void main(String[] args) {
		System.out.println("Please Enter your Name? ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		while(!name.matches("[a-z A-Z]+")){
		    System.out.println("Please enter a valid name!");
		    name = sc.nextLine();
		}
		System.out.println("Your Name is " + name);
		sc.close();
	}

}
