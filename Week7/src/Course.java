
public class Course {
	
		public String name;
		public int numberOfStudents;
		public boolean electiveCourse;
		
		
		
		public Course(String na, int nos, boolean ec)
		{
			name = na;
			numberOfStudents = nos;
			electiveCourse = ec;			
		}

		public Course(String name, boolean electiveCourse) {
			name = name;
			electiveCourse = true;
		}
		
		public String toString() {
			return name + numberOfStudents + electiveCourse;
			
		}
		
		
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getNumberOfStudents() {
			return numberOfStudents;
		}

		public void setNumberOfStudents(int numberOfStudents) {
			this.numberOfStudents = numberOfStudents;
		}


		public boolean isElectiveCourse() {
			return electiveCourse;
		}

		public void setElectiveCourse(boolean electiveCourse) {
			this.electiveCourse = electiveCourse;
		}
		
		
		
		
}
