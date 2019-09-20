import java.util.Scanner;

public class Distance
{

	public static void main(String [] args)
	{

	double x1, y1, x2, y2;

	Scanner scan = new Scanner(System.in);

	System.out.println("Enter the coordinates of the first point with a space between them:");
	
	x1 = scan.nextDouble();
	y1 = scan.nextDouble();
	

	System.out.println("Enter the coordinates of the second point, again with a space inbetween:");
	
	x2 = scan.nextDouble();
	y2 = scan.nextDouble();

	double distance = Math.pow((Math.pow((x2-x1),2) + Math.pow((y2-y1),2)),.5);
	
	}//end main method

}//end class
