import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {

	public static void main(String[] args) {
		
		System.out.println("Rock(0), Paper(1), Scissor(2)");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your number");
		int UserInput = sc.nextInt();
	
		Random rd = new Random();
		//System.out.println("Computer Input");
		int ComputerInput = rd.nextInt(3); 
		
		if(ComputerInput==0) {
			System.out.println("Computer chooses Rock");
		}else if(ComputerInput==1) {
			System.out.println("Computer chooses Paper");
		}else {
			System.out.println("Computer chooses Scissor");
		}
		
		if(UserInput==0 && ComputerInput==0 || UserInput==1 && ComputerInput==1 || UserInput==2 && ComputerInput==2) {
			System.out.println("Draw❌");
		}
		
		else if(UserInput==0 && ComputerInput==1 || UserInput==1 && ComputerInput==2 || UserInput==2 && ComputerInput==0) 
		{
			  	System.out.println("Computer wins🎉");
		
		}else if(UserInput==0 && ComputerInput==2 || UserInput==1 && ComputerInput==0 || UserInput==2 && ComputerInput==1)
	     {
		System.out.println("User Wins,,Woohoo!!🎉");
		
	     }else {
	    System.out.println("Invalid Input");
	}
		

  }
	
}
