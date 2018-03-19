package Task2;

public class TandemBike extends Bicycle {
	int rate;
	public TandemBike(int cadence, int speed, int gear) {
		super(cadence, speed, gear);
		rate=250;
		// TODO Auto-generated constructor stub
	}
	void Display(){
		  System.out.println("values of TademBike:"+" " +cadence+" " + speed+" " +gear+" "  +rate); 
		 }
		    

}
