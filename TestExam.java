import java.util.Scanner;

public class TestExam {
	static Scanner sc;
	int choice, totalScore,bonusPoint;
	String answer;
	boolean aptiFlag,engFlag,mathsFlag,gkFlag;
	
	public void optionMenu() {
		System.out.println("***** Examination Subject Menu *****\n");
		System.out.println("\t1. Aptitude");
		System.out.println("\t2. English");
		System.out.println("\t3. Maths");
		System.out.println("\t4. GK");
		System.out.println("\t5. Exit");
		
		System.out.println("\nEnter your choice between(1-5):");
		choice = sc.nextInt();
		operation(choice);
	}
	
	public void operation(int ch) {
		if(ch==1) {
			if(!aptiFlag) {
				System.out.println("How many weeks are in an Year ?");
				answer = sc.next();
				if(answer.equals("52")) {
					totalScore+=10;
				}
			aptiFlag = true;
			}else {
				System.out.println("Sorry...You have already attempted this subject. Try another !!!");
			}
			optionMenu();
		}
		else if(ch==2) {
			if(!engFlag) {
				System.out.println("How many vowels are in english alphabets ?");
				answer = sc.next();
				if(answer.equals("5")) {
					totalScore+=10;
				}
			engFlag = true;
			}else {
				System.out.println("Sorry...You have already attempted this subject. Try another !!!");
			}
			optionMenu();
		}
		else if(ch==3) {
			if(!mathsFlag) {
				System.out.println("Find the area of a triangle whose sides measures 13 cm, 14 cm and 15 cm ?");
				answer = sc.next();
				if(answer.equals("84")) {
					totalScore+=10;
				}
			mathsFlag = true;
			}else {
				System.out.println("Sorry...You have already attempted this subject. Try another !!!");
			}
			optionMenu();
		}
		else if(ch==4) {
			if(!gkFlag) {
				System.out.println("Which animal is known as the 'Ship of the Desert' ?");
				answer = sc.next();
				if(answer.toLowerCase().equals("camel")) {
					totalScore+=10;
				}
			gkFlag = true;
			}else {
				System.out.println("Sorry...You have already attempted this subject. Try another !!!");
			}
			optionMenu();
		}
	
		else if(ch==5) {
			switch(totalScore) {
				case 20:
					bonusPoint=2;
					break;
				case 30:
					bonusPoint=5;
					break;
				case 40:
					bonusPoint=10;
					break;
			}
			totalScore+=bonusPoint; //final score
			System.out.println("\n===========================================\n");
			System.out.println("Bonus points earned   : "+bonusPoint);
			System.out.println("Total score out of 50 : "+totalScore);
			if(totalScore>=40)
				System.out.println("You are a Genius.");
			else if(totalScore>=30)
				System.out.println("You are intelligent");
			else if(totalScore>=20)
				System.out.println("Your IQ level is average");
			else if(totalScore>=10)
				System.out.println("Your IQ level is below average");
			else
				System.out.println("You need to re-appear the test");
			System.out.println("\n===========================================\n");
		}
	}

	public static void main(String[] args) {
		TestExam testObj = new TestExam();
		sc = new Scanner(System.in);
		System.out.println("***** Welcome to Howell Univeristy Examination System *****\n");
		System.out.println("Enter no. of attempt :");
		int nAttempt = sc.nextInt();
		
		if(nAttempt > 1) {
			System.out.println("Sorry....you have already attempted this exam.");
			System.out.println("Good-Bye !!!");
		}else {
			testObj.optionMenu();
		}
	}
}
