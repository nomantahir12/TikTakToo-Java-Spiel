package zwei_dimentionales_array;

import java.util.Scanner;

public class TikTakToo_Spiel {

	public static void main(String[] args) {
		char[][] spiel = new char[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME \nThis is a TIK TAK TOK Game:\n"
							+ "Please select 'X' or 'O as your symbol'\n"
							+ "where one player will get one sign and the\n"
							+ "other will get another sign.\n" );
		System.out.println("User 01:");
		try {
			Thread.sleep(1 * 1000);
		} catch(InterruptedException e) {
			System.out.println("InterruptedException caught: "+ e);
		}
		System.out.print("Name:");
		String user_01 = sc.next();
		try {
			Thread.sleep(1 * 1000);
		} catch(InterruptedException e) {
			System.out.println("InterruptedException caught: "+ e);
		}
		System.out.print("'X' Or 'O' :");
		char zeichen_01 = sc.next().charAt(0);
		switch(zeichen_01) {
			case 'X':
				System.out.printf("%s you have choosed the Symbol %s \n ", user_01, zeichen_01);
				break;
			case 'O':
				System.out.printf("%s you have choosed the Symbol %s \n ", user_01, zeichen_01);
				break;
			default:
				System.out.println("Please select 'X' or 'O'.\n");
				break;
		}
		System.out.println(); //leer
		char default_zeichen;
		if(zeichen_01 == 'X') {
			default_zeichen = 'O';
		}
		else {
			default_zeichen = 'X';
		}
		try {
			Thread.sleep(1 * 1000);
		} catch(InterruptedException e) {
			System.out.println("InterruptedException caught: "+ e);
		}
		System.out.println("User 02:");
		try {
			Thread.sleep(1 * 1000);
		} catch(InterruptedException e) {
			System.out.println("InterruptedException caught: "+ e);
		}
		System.out.print("Name:");
		String user_02 = sc.next();
		try {
			Thread.sleep(1 * 1000);
		} catch(InterruptedException e) {
			System.out.println("InterruptedException caught: "+ e);
		}
		System.out.printf("%s You have the sign %s ,because %s has sign %s selected.\n \n",user_02, default_zeichen, user_01, zeichen_01);
		try {
			Thread.sleep(1 * 1000);
		} catch(InterruptedException e) {
			System.out.println("InterruptedException caught: "+ e);
		}
		for(int z = 0; z < 3; z++) {
			for(int s = 0; s < 3; s++) {
				char blank = '*';
				spiel[z][s] = blank;
			}
		}
		try {
			Thread.sleep(1 * 1000);
		} catch(InterruptedException e) {
			System.out.println("InterruptedException caught: "+ e);
		}
		System.out.println("INFO: \nYou have 3 Colums and 3 Rows\n"
				+ "Please select from Row 1 to 3.");
		System.out.println(); //leer
		try {
			Thread.sleep(1 * 1000);
		} catch(InterruptedException e) {
			System.out.println("InterruptedException caught: "+ e);
		}
		for(int z = 0; z < 3; z++) {
			for(int t = 0; t < 3; t++) {
				System.out.printf("%s ", spiel[z][t]);
			}
			System.out.println();
		}
		System.out.println(); //leer
		try {
			Thread.sleep(1 * 1000);
		} catch(InterruptedException e) {
			System.out.println("InterruptedException caught: "+ e);
		}
		int s = 0;
		while( s < 1 ) {
			while( s < 9 ) {
				
				System.out.println(user_01);
				System.out.printf("Your turn and your symbol ist %s \n", zeichen_01);
				try {
					System.out.println("Please select from 1 to 3.");
					System.out.println("Row number:");
					int zeile = sc.nextInt();				
					System.out.println("Please select from 1 to 3.");
					System.out.println("Column number:");
					int spalte = sc.nextInt();
					spiel[zeile-1][spalte-1] = zeichen_01;
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("Please give the number between 1 and 3!!!");
				}
				for(int z = 0; z < 3; z++) {
					for(int t = 0; t < 3; t++) {
						System.out.printf("%s ", spiel[z][t]);
					}
					System.out.println();
				}
				if(spiel[0][0] == zeichen_01 && spiel[1][0] == zeichen_01 && spiel[2][0] == zeichen_01  || spiel[0][1] == zeichen_01 && spiel[1][1] == zeichen_01 && spiel[2][1] == zeichen_01 || spiel[0][2] == zeichen_01 && spiel[1][2] == zeichen_01 && spiel[2][2] == zeichen_01  ) {
					System.out.println("You have Win the Game"
										+ "Game Over");
					break;
				}
				else if(spiel[0][0] == zeichen_01 && spiel[0][1] == zeichen_01 && spiel[0][2] == zeichen_01  || spiel[1][0] == zeichen_01 && spiel[1][1] == zeichen_01 && spiel[1][2] == zeichen_01 || spiel[2][0] == zeichen_01 && spiel[2][1] == zeichen_01 && spiel[2][2] == zeichen_01) {
					System.out.println("You have Win the Game"
										+ "Game Over");
					break;
				}
				else if(spiel[0][0] == zeichen_01 && spiel[1][1] == zeichen_01 && spiel[2][2] == zeichen_01 || spiel[0][2] == zeichen_01 && spiel[1][1] == zeichen_01 && spiel[2][0] == zeichen_01  ) {
					System.out.println("You have Win the Game"
										+ "Game Over");
					break;
				}
				System.out.println(user_02);
				System.out.printf("Your turn and your symbol is %s \n", default_zeichen);
				try {
					System.out.println("Please select from 1 to 3");
					System.out.println("Row number:");
					int zeile_02 = sc.nextInt();				
					System.out.println("Please select from 1 to 3");
					System.out.println("Column Number:");
					int spalte_02 = sc.nextInt();
					spiel[zeile_02-1][spalte_02-1] = default_zeichen;
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("Please give number between 1 and 3!!!");
				}
				
					
				for(int z = 0; z < 3; z++) {
					for(int t = 0; t < 3; t++) {
						System.out.printf("%s ", spiel[z][t]);
					}
					System.out.println();
				}
				if(spiel[0][0] == default_zeichen && spiel[1][0] == default_zeichen && spiel[2][0] == default_zeichen  || spiel[0][1] == default_zeichen && spiel[1][1] == default_zeichen && spiel[2][1] == default_zeichen || spiel[0][2] == default_zeichen && spiel[1][2] == default_zeichen && spiel[2][2] == default_zeichen  ) {
					System.out.println("You have Win the Game \n "
										+ " Game Over");
					break;
				}
				else if(spiel[0][0] == default_zeichen && spiel[0][1] == default_zeichen && spiel[0][2] == default_zeichen  || spiel[1][0] == default_zeichen && spiel[1][1] == default_zeichen && spiel[1][2] == default_zeichen || spiel[2][0] == default_zeichen && spiel[2][1] == default_zeichen && spiel[2][2] == default_zeichen) {
					System.out.println("You have Win the Game \n "
										+ " Game Over");
					break;
				}
				else if(spiel[0][0] == default_zeichen && spiel[1][1] == default_zeichen && spiel[2][2] == default_zeichen || spiel[0][2] == default_zeichen && spiel[1][1] == default_zeichen && spiel[2][0] == default_zeichen) {
					System.out.println("You have Win the Game \n "
										+ " Game Over");
					break;
				}
				s++;
			}
			
		}
		System.out.println("Remember:");
		System.out.println("Games can be played with others, "
				+ "whether it's friends, family, or online communities. "
				+ "This can provide opportunities to socialize, "
				+ "build relationships, and develop teamwork and communication skills.");
		System.out.println("So see you next Time, Bye Bye");
	}
}
