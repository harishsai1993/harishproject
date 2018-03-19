package Task3;

abstract class TotalArea{


abstract double rect();
abstract double circ();

public void circum(){
double pi=3.14;
int r=2;
double circumOfCirc=2 *pi *(double)r;
System.out.println("The circumference is " +circumOfCirc);
}


}

