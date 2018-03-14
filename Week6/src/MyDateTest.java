import java.util.Scanner;

public class MyDateTest {

	public static void main(String[] args) {
		/*System.out.println("Please select the month");*/
		Scanner src = new Scanner(System.in);
		
		TheMyDate info = new TheMyDate(11,5,1992);
		
		/*int Start;
		int End;
		
		System.out.println("Please select the starting year");
		Start= src.nextInt();
		
		System.out.println("Please select the end year");
		End = src.nextInt();*/
		
		
		
		int day =0;
		
		
		while (!(info.getDay()==26 && info.getMonth()== 2 && info.getYear()==2018)) {
			info.nextDay();
			day++;
			System.out.println(info);
		}
		
		System.out.println("days" + day);
		System.out.println(day * 86400 + " Seconds");
		
		
		
		
		
	/*	int count=0;
		for (int LeapYear = Start; LeapYear <= End; LeapYear++)
		{
			info.setyear(LeapYear);
			
			if(info.isLeapYear())
			{
			count++;
			}
		}
		System.out.println(count);
		
		System.out.println(info.daysInMonth());
		System.out.println(info.getAstroSign());
		System.out.println(info.getMonthName());
		
		src.close();*/
	}
}
