import java.util.Scanner;
/*
 * Fire Force Quiz
 * Developed by Ayan Cooper
 * Last updated October 27th, 2022
 * Testing for first commit
 */

public class runFFQuiz {
	 public static void main(String[] args) 
	 {
		 String input;
		 char choice;
		 char spoil;
		 
		 Scanner keyboard = new Scanner(System.in);
		 
		 
		 System.out.println("Welcome to the Fire Force Quiz!");
		 System.out.println("This program can either quiz you on your knowledge of the anime or "
		 		+ "the manga (which has finished).");
		 System.out.println("--------------------------------");
		 
		 for (int r = 0; r <=1; r++) {
			 
			 System.out.println("Please choose which quiz you'd like to take:");
			 System.out.println("A:		Anime Only");
			 System.out.println("B:		Manga");
			 
			 input = keyboard.nextLine();
			 choice = input.charAt(0);
			 
			 if (choice == 'A' || choice == 'a') {
				 System.out.println("Let's begin the anime only version of the Fire Force Quiz!");
				 System.out.println("--------------------------------");
				 animeOnlyQuiz();
				 break;
			 }
			 else if (choice == 'B' || choice == 'b') {
				 System.out.println("WARNING: This version of the Fire Force Quiz is based off the manga "
				 		+ "and will contain spoilers.");
				 System.out.println("Are you sure you want to continue (Y/N)?");
				 
				 input = keyboard.nextLine();
				 spoil = input.charAt(0);
				 if (spoil == 'Y' || spoil == 'y') {
					 System.out.println("Let's begin the manga version of the Fire Force Quiz!");
					 System.out.println("--------------------------------");
					 mangaQuiz();
					 break;
				 }
				 else if (spoil == 'N' || spoil == 'n') {
					 System.out.println("--------------------------------");
					 continue;
				 }
			 }	 
		 }
	 }
	 
	 public static void animeOnlyQuiz() {
			String input;
			int score = 0;
			char option;
			
			
			Scanner keyboard = new Scanner(System.in);
			
			// Question 1:
			System.out.println("--------------------------------");
			System.out.println("Question 1: What pyrokinetics generation is Shinmon Benimaru?");
			System.out.println("A: 2nd Gen");
			System.out.println("B: 3rd Gen");
			System.out.println("C: 2nd & 3rd Gen Hybrid");
			System.out.println("D: 4th Gen");
			
			input = keyboard.nextLine();
			option = input.charAt(0);
			
			if (option == 'C' || option == 'c') {
				score++;
			}
			
			// Question 2:
			System.out.println("--------------------------------");
			System.out.println("Question 2: In the Asakusa Arc, who did Shinra receive an Adolla Link from?");
			System.out.println("A: Benimaru");
			System.out.println("B: Konro");
			System.out.println("C: Arthur");
			System.out.println("D: Obi");
			
			input = keyboard.nextLine();
			option = input.charAt(0);
			
			if (option == 'B' || option == 'b') {
				score++;
			}
			
			// Question 3:
			System.out.println("--------------------------------");
			System.out.println("Question 3: Who is the engineer in Company 8?");
			System.out.println("A: Tamaki");
			System.out.println("B: Hinawa");
			System.out.println("C: Viktor");
			System.out.println("D: Vulcan");
						
			input = keyboard.nextLine();
			option = input.charAt(0);
			
			if (option == 'D' || option == 'd') {
				score++;
			}
			
			// Question 4:
			System.out.println("--------------------------------");
			System.out.println("Question 4: What hand sign does Shinra use to move faster?");
			System.out.println("A: Corna");
			System.out.println("B: Tora Hishigi");
			System.out.println("C: Rapid");
			System.out.println("D: Hellfire");
						
			input = keyboard.nextLine();
			option = input.charAt(0);
			
			if (option == 'B' || option == 'b') {
				score++;
			}
			
			// Question 5:
			System.out.println("--------------------------------");
			System.out.println("Question 5: Why did Hibana fall in love with Shinra?");
			System.out.println("A: He beat her fair and square");
			System.out.println("B: She likes men who fight back");
			System.out.println("C: He promised to be her hero");
			System.out.println("D: To better cooperate with Company 8");
						
			input = keyboard.nextLine();
			option = input.charAt(0);
			
			if (option == 'C' || option == 'c') {
				score++;
			}
			
			// Question 6:
			System.out.println("--------------------------------");
			System.out.println("Question 6: Why did Inca initially join the White Clads?");
			System.out.println("A: She saw the dangerous life as entertainment");
			System.out.println("B: She believed it was her fate");
			System.out.println("C: The White Clads threatened to kill her friends");
			System.out.println("D: Company 8 denied accepting her");
						
			input = keyboard.nextLine();
			option = input.charAt(0);
			
			if (option == 'B' || option == 'b') {
				score++;
			}
			
			// Question 7:
			System.out.println("--------------------------------");
			System.out.println("Question 7: Who taught Shinra the meaning of the Corna?");
			System.out.println("A: Obi");
			System.out.println("B: Benimaru");
			System.out.println("C: Hinawa");
			System.out.println("D: Himself");
						
			input = keyboard.nextLine();
			option = input.charAt(0);
			
			if (option == 'A' || option == 'a') {
				score++;
			}
			
			// Question 8:
			System.out.println("--------------------------------");
			System.out.println("Question 8: What technique did Ogun use to fight the demon infernal?");
			System.out.println("A: Press Of Death");
			System.out.println("B: Fire Tattoo");
			System.out.println("C: Flamy Ink");
			System.out.println("D: Flame Buff");
						
			input = keyboard.nextLine();
			option = input.charAt(0);
			
			if (option == 'C' || option == 'c') {
				score++;
			}
			
			// Question 9:
			System.out.println("--------------------------------");
			System.out.println("Question 9: Which of these characters has a crush on Tamaki?");
			System.out.println("A: Shinra");
			System.out.println("B: Vulcan");
			System.out.println("C: Ogun");
			System.out.println("D: Assault");
						
			input = keyboard.nextLine();
			option = input.charAt(0);
			
			if (option == 'D' || option == 'd') {
				score++;
			}
			
			// Question 10:
			System.out.println("--------------------------------");
			System.out.println("Question 10: What was teased at the end of season 2?");
			System.out.println("A: The next villain");
			System.out.println("B: Shinra's inevitable death");
			System.out.println("C: The moon");
			System.out.println("D: Season 3's release date");
						
			input = keyboard.nextLine();
			option = input.charAt(0);
			
			if (option == 'C' || option == 'c') {
				score++;
			}
			
			
			
			System.out.println("--------------------------------");
			System.out.println("Your final score is: " + score);
			if (score == 10) {
				System.out.println("Wow! You're a true Fire Force fan! Awesome job!");
			}
			else if (score == 9 || score == 8) { 
				System.out.println("Great! I can tell you enjoyed watching Fire Force!");
			}
			else if (score == 7 || score == 6) {
				System.out.println("Good work! Wait till you see what happens in the next seasons!");
			}
			else if (score == 5 || score == 4) {
				System.out.println("Nice try! Rewatching Fire Force should give you a higher score!");
			}
			else if (score == 3 || score == 2) {
				System.out.println("You didn't do so well. You should rewatch the anime, it's great!");
			}
			else if (score == 1 || score == 0) {
				System.out.println("Have you even watched the show?");
			}
			
		}
	 
	 public static void mangaQuiz() {
			String input;
			int score = 0;
			char option;
			boolean correct = false;
			
			
			Scanner keyboard = new Scanner(System.in);
			
			// Question 1:
			System.out.println("--------------------------------");
			System.out.println("Question 1: At the end of the Obi's Rescue Arc, who helps Company 8 escape?");
			System.out.println("A: Benimaru");
			System.out.println("B: Moonlight");
			System.out.println("C: Moonlight Mask");
			System.out.println("D: Company 4");
			
			input = keyboard.nextLine();
			option = input.charAt(0);
			
			if (option == 'C' || option == 'c') {
				score++;
			}
			
			// Question 2:
			System.out.println("--------------------------------");
			System.out.println("Question 2: Who is the 7th pillar?");
			System.out.println("A: Sumire");
			System.out.println("B: Shinra");
			System.out.println("C: Arthur");
			System.out.println("D: Iris");
			
			input = keyboard.nextLine();
			option = input.charAt(0);
			
			if (option == 'A' || option == 'a') {
				score++;
			}
			
			// Question 3:
			System.out.println("--------------------------------");
			System.out.println("Question 3: Who does Benimaru fight in the Asakusa Showdown Arc?");
			System.out.println("A: His doppelgänger");
			System.out.println("B: Hibachi's doppelgänger");
			System.out.println("C: Dragon");
			System.out.println("D: A giant infernal");
						
			input = keyboard.nextLine();
			option = input.charAt(0);
			
			if (option == 'B' || option == 'b') {
				score++;
			}
			
			// Question 4:
			System.out.println("--------------------------------");
			System.out.println("Question 4: Who is Shinra's father?");
			System.out.println("A: Obi");
			System.out.println("B: Unamed demon infernal");
			System.out.println("C: Benimaru");
			System.out.println("D: No one");
						
			input = keyboard.nextLine();
			option = input.charAt(0);
			
			if (option == 'D' || option == 'd') {
				score++;
			}
			
			// Question 5:
			System.out.println("--------------------------------");
			System.out.println("Question 5: After Shinra beat the Raffles doppelgänger, what happened?");
			System.out.println("A: Shinra was called a hero");
			System.out.println("B: The Eveangelist appeared");
			System.out.println("C: The world was set on fire");
			System.out.println("D: Shinra was called a devil and disappeared");
						
			input = keyboard.nextLine();
			option = input.charAt(0);
			
			if (option == 'D' || option == 'd') {
				score++;
			}
			
			// Question 6:
			System.out.println("--------------------------------");
			System.out.println("Question 6: What happened to the original Earth?");
			System.out.println("A: It became the current sun");
			System.out.println("B: It got destroyed");
			System.out.println("C: It was altered and became the current Earth");
			System.out.println("D: It became Mars");
						
			input = keyboard.nextLine();
			option = input.charAt(0);
			
			if (option == 'A' || option == 'a') {
				score++;
			}
			
			// Question 7:
			System.out.println("--------------------------------");
			System.out.println("Question 7: Where do Arthur and Dragon have their final fight?");
			System.out.println("A: In Asakusa");
			System.out.println("B: In space");
			System.out.println("C: On the moon");
			System.out.println("D: In a wasteland");
						
			input = keyboard.nextLine();
			option = input.charAt(0);
			
			if (option == 'C' || option == 'c') {
				score++;
			}
			
			// Question 8:
			System.out.println("--------------------------------");
			System.out.println("Question 8: How did Faerie originally meet his end?");
			System.out.println("A: Sho killed him");
			System.out.println("B: Suicide");
			System.out.println("C: He burned with the Earth");
			System.out.println("D: He overheated");
						
			input = keyboard.nextLine();
			option = input.charAt(0);
			
			if (option == 'B' || option == 'b') {
				score++;
			}
			
			// Question 9:
			System.out.println("--------------------------------");
			System.out.println("Question 9: What is the name of the Hero of Hope?");
			System.out.println("A: Shinra");
			System.out.println("B: God");
			System.out.println("C: Shinrabanshō-Man");
			System.out.println("D: Jesus");
						
			input = keyboard.nextLine();
			option = input.charAt(0);
			
			if (option == 'C' || option == 'c') {
				score++;
			}
			
			// Question 10:
			System.out.println("--------------------------------");
			System.out.println("Question 10: What is the last thing the Hero of Hope does with his powers?");
			System.out.println("A: He creates Death");
			System.out.println("B: He eradicates despair");
			System.out.println("C: He rebuilds the world");
			System.out.println("D: He changes history");
						
			input = keyboard.nextLine();
			option = input.charAt(0);
			
			if (option == 'A' || option == 'a') {
				score++;
			}
			
			// Bonus:
			System.out.println("--------------------------------");
			System.out.println("Bonus! Can Shinra at his peak beat Luffy at his peak?");
			System.out.println("A: Yes");
			System.out.println("B: No");
						
			input = keyboard.nextLine();
			option = input.charAt(0);
			
			if (option == 'A' || option == 'a') {
				score++;
				correct = true;
			}
			
			System.out.println("--------------------------------");
			System.out.println("Your final score is: " + score);
			if (score == 11) {
				System.out.println("OUTSTANDING! You know the manga AND you can power scale!");
			}
			else if (score == 10 && correct == false) {
				System.out.println("Wow! You really read the manga! Gotta work on power scaling though...");
			}
			else if (score == 10 && correct == true) {
				System.out.println("Wow! You really read the manga!");
			}
			else if (score == 9 || score == 8) { 
				System.out.println("Great! I can tell you enjoyed reading Fire Force!");
			}
			else if (score == 7 || score == 6) {
				System.out.println("Good work! Ōkubo's next work should be exciting, make sure to read it!");
			}
			else if (score == 5 || score == 4) {
				System.out.println("Nice try! Rereading Fire Force should give you a higher score!");
			}
			else if (score == 3 || score == 2) {
				System.out.println("You didn't do so well. You should reread the anime, it's great!");
			}
			else if (score == 1 || score == 0) {
				System.out.println("Have you even read the manga?");
			}
			else if (score == 1 && correct == true) {
				System.out.println("How'd you miss every question, but know that Shinra > Luffy???");
			}
			else if (score == 0 && correct == false) {
				System.out.println("You don't know anything...");
			}
			
		}
}
