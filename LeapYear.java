import java.util.Scanner;

class LeapYear {
		public static void main(String[] args) {
						int year;
						System.out.println("Enter the year:");
						Scanner scanner=new Scanner(System.in);
						year=scanner.nextInt();
						if(((year %4==0)&&(year %100!=0) ||(year %400==0))) 
							System.out.println("Year is leap year");
						else 
							System.out.println("Year is non leap year");

		}

}
