
public class Room {

	
		public String block;
		public String floor;
		public int seats;
		public boolean projector;
		public int room;
		
		public Room( String bk, String fl, int se, boolean pj, int rm) {
		
			block = bk;
			floor = fl;
			seats = se;
			projector = pj;
			room = rm;
		}
	
		public String toString() {
			return block + "/" + floor + "/" + seats + "/" + projector + "/" + room;
			
		}
		
		
		
		public String getBlock() {
			return block;
		}
		public void setBlock(String block) {
			this.block = block;
		}
		public String getFloor() {
			return floor;
		}
		public void setFloor(String floor) {
			this.floor = floor;
		}
		public int getSeats() {
			return seats;
		}
		public void setSeats(int seats) {
			this.seats = seats;
		}
		public boolean isProjector() {
			return projector;
		}
		public void setProjector(boolean projector) {
			this.projector = projector;
		}
		public int getRoom() {
			return room;
		}
		public void setRoom(int room) {
			this.room = room;
		}
		
		
			
			
		}
		
		
	
	
	
	

