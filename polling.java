package Desai_project3;

import java.util.Scanner;

public class polling {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner (System.in);
		String [] topics = {"Food", "Fortnite", "Friends", "Flights", "Family"};
		int [][] array = new int [5][10];
		int i = 0, j;
		int users, responses;
		
		System.out.print("How many people will be taking the survey? ");
		users = scnr.nextInt();
		
		for(i=0; i<5; i++) {
			for(j=0; j<10;j++) {
				array[i][j] = scnr.nextInt();
				System.out.println(array[i][j]);
			}
		}
		
		while(i<users) {
			for(j=0; j<5; j++) {
				System.out.println(array[i][j]+ " ");
				int x = scnr.nextInt();
			}
		}

	}

}
