/* Name : Jonathan Wong Siew Ho
 * Matric Number : MS2016105099
 * Practicum : K2MD5
 * Objective : To classify house number into odd, even and semi-detached and search the house number
 */

import java.util.Scanner;
public class Assignment // create class
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in); // create object
		System.out.print("Enter number of houses booked by customers : "); // Prompt user input number of houses
		int numhouses = sc.nextInt();
		int i; // initialization of index
		int [] house = new int[numhouses]; // create array
		if (numhouses>=1&&numhouses<=30) // condition in which loop is functioning only if the number of houses is in the range of 1 to 30
		{
			for (i=0;i<house.length;i=i+1)
			{
				System.out.print("\nEnter house number: ");
			    house[i] = sc.nextInt();
			    while (house[i]<1 || house[i]>30) // indicate that house number which is less than 1 or more than 30 cannot be entered
			    {
					System.out.print("Enter a valid house number: ");
					house [i] = sc.nextInt();
				}
			}
			System.out.print("\n\nOdd house number are : "); // tells user the number of odd house number
			int odd = 0; // initialization of variable odd
			for (i=0;i<house.length;i=i+1) // create a loop in showing odd house number
			{
				if (house[i]%2==1){
					System.out.print(house[i]+" ");
					odd = 1; // indicate presence of odd house number is found in program
				}
			}
			if (odd == 0){
				System.out.print("None"); // display "None" to indicate no odd house number is found in program
			}
			System.out.print("\n\nEven house number are : ");
			int even = 0; // initialization of variable even
			for (i=0;i<house.length;i=i+1)
			{
				if (house[i]%2==0){
					System.out.print(house[i]+" ");
					even = 1; // indicate presence of even house number is found in program
				}
			}
			if (even == 0){
				System.out.print("None");
			}
			System.out.print("\n\nSemi-detached house number : ");
			int semidetached = 0; // initialization of variable semidetached
			for (i=0;i<house.length;i=i+1)
			{
				if (house[i]>=6 && house[i]<=15){
					System.out.print(house[i]+" ");
					semidetached = 1; // indicate presence of semi-detached house number is found in program
				}
			}
			if (semidetached == 0){
				System.out.print("None");
			}
			System.out.print("\n\nEnter house number to search : "); // Prompt user input house number to search
			int search = sc.nextInt(); // input statement for house number to search
			int found = 0; // initialization of variable found
			for (i=0;i<house.length;i=i+1)
			{
				if (house[i]==search){
					System.out.print("House number "+search+" is present at index "+i); // display found house number and its corresponding index
					found = 1; // indicate presence of house number to search is found in program
				}
			}
				if (found == 0){
					System.out.print("House number "+search+" is not found");
				}
		}
		else if(numhouses<1||numhouses>30){
			System.out.println("Invalid");}
	}
}

















