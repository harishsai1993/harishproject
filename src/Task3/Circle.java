package Task3;


class Circle extends Rectangle{


public double  circ(){
double pi=3.14;
int r=2;
double areaOfCirc=(pi * (double)r * (double)r)*2;
//System.out.println("Area of circle " +areaOfCirc);
return areaOfCirc;
}
  public double rect()   {
int h=6,r=2;double pi=3.14;
double areaOfRect=2*pi*(double)r*h;
//System.out.println("Area of rectangle" + areaOfRect);

  
return areaOfRect;}
}