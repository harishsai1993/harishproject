package Task2;

public class TestBicycle {
public static void main(String[] args) {
	MountainBike m=new MountainBike(10,20,30);
	m.Display();
	RoadBike r=new RoadBike(10,20,30);
	r.Display();
	TandemBike t=new TandemBike(10,20,30);
	t.Display();
}
}

