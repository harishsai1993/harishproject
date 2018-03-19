package Task2;

public class RoadBike extends Bicycle{
	int rate;
	public RoadBike(int cadence, int speed, int gear) {
		super(cadence, speed, gear);
		rate=200;
		// TODO Auto-generated constructor stub
	}
	void Display(){
		  System.out.println("values of RoadBike:"+" " + cadence+" "+speed+" "  + gear+" " + rate ); 
		 }
		    

}
