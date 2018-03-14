
public class MyDateEx902 {

	public class TheMyDate

	{
		private int day;
		private int month;
		private int year;

		TheMyDate(int day, int month, int year) {

		}

		public String toString() {
			return day + "/" + month + "/" + year;
		}

		public TheMyDate() {
		}

		public void setDay(int d) {
			day = d;

		}

		public void setMonth(int m) {
			month = m;
		}

		public void setyear(int y) {
			year = y;
		}

		public int getDay() {

			return day;

		}

		public int getMonth() {
			return month;
		}

		public int getYear() {
			return year;
		}

		public String displaydate() {
			return day + "/" + month + "/" + year;
		}

		public boolean isLeapYear() {
			if (year % 4 == 0 && year % 100 != 0) {
				return true;
			} else if (year % 400 == 0) {
				return true;
			} else {
				return false;
			}
		}

		public int daysInMonth() {
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				return 31;
			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				return 30;
			} else if (month == 2) {
				if (isLeapYear())
					return 29;
				else
					return 28;
			} else {
				return 0;
			}
		}

		public String getMonthName() {

			switch (month) {
			case 1:
				return " january";
			case 2:
				return "february";
			case 3:
				return "march";
			case 4:
				return "april";
			case 5:
				return "may";
			case 6:
				return "june";
			case 7:
				return "july";
			case 8:
				return "august";
			case 9:
				return "september";
			case 10:
				return "october";
			case 11:
				return "november";
			case 12:
				return "december";
			default:
				return "blabla ";

			}
		}

		public String getAstroSign() {
			if (month == 1 && day >= 20 || month == 2 && day <= 18)
				return ("Aquarius");
			else if (month == 2 && day >= 19 || month == 3 && day <= 29)
				return "Pisces";
			if (month == 3 && day >= 20 || month == 4 && day <= 19)
				return ("Aries");
			else if (month == 4 && day >= 19 || month == 5 && day <= 20)
				return ("Taurus");
			if (month == 5 && day >= 21 || month == 6 && day <= 20)
				return ("Gemini");
			else if (month == 6 && day >= 21 || month == 7 && day <= 22)
				return ("Cancer");
			if (month == 7 && day >= 23 || month == 8 && day <= 22)
				return ("Leo");
			else if (month == 8 && day >= 23 || month == 9 && day <= 22)
				return ("Virgo");
			if (month == 9 && day >= 23 || month == 10 && day <= 22)
				return ("Libra");
			else if (month == 10 && day >= 23 || month == 11 && day <= 21)
				return ("Scorpio");
			if (month == 11 && day >= 22 || month == 12 && day <= 21)
				return ("Sagittarius");
			else if (month == 12 && day >= 22 || month == 1 && day <= 19)
				return ("Capricorn");
			return "In what world do you live ? ";
		}
		
		
	}

}

