import java.util.Scanner;

public class TimeConverter {
	
	/*
	This code takes in a number of seconds from the user and converts it into 
	an output of hours, minutes, and seconds, which are then returned to the user.
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many seconds? ");
		int sec = scan.nextInt(); 
		
		int hours = sec / 3600;        //convert seconds to hours
		int minutes = (sec%3600)/60;   //convert left over to minutes
		int seconds = (sec%3600)%60;   //what is left over after both of those
		
		System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds.");
		scan.close(); 
	}

}
