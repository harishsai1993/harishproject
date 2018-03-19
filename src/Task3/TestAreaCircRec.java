package Task3;

public class TestAreaCircRec{
double pi=3.14; 
public static void main(String[] args){

Circle c=new Circle();
double totalArea=c.rect() + c.circ();
System.out.println("The area of cylinder is: "+totalArea);



}
}