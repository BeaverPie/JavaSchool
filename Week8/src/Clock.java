public class Clock {


	int hour;
	int minute;
	int second;
	int totalTimeInSeconds;

	public Clock(int hr, int min, int sec){
		hour=hr;
		minute = min;
		second = sec;
	}
		
 	public Clock(int totalTimeInSeconds) {
 		hour = totalTimeInSeconds % 3600;
 		totalTimeInSeconds= totalTimeInSeconds - (hour * 3600);
 		minute = totalTimeInSeconds % 60;}
 		
		public int getHour() {
			return hour;
		}
		
		public void setHour(int hour) {
			this.hour = hour;
		} 
		
		public int getMinute() {
			return minute;
			}
		public void setMinute(int minute) {
			this.minute = minute;
		}

		public int getSecond() {
			return second;
		}
		public void setSecond() {
			this.second=second;
		}
		
		
}
	


	



