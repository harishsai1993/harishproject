package Task2;

public class MountainBike extends Bicycle{
	 int rate;

	 MountainBike(int cadence,int speed,int gear){
	  super(cadence,speed,gear);
	  rate=150;
	  
	  
	 }
	 void Display(){
	  System.out.println("values of MoountainBike: " +" " +cadence +" " + speed+" " +gear+ " " +rate ); 
	 }
	      
	}


	 



