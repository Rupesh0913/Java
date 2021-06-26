interface Area{
final static int side=5;
abstract void area();
}
interface Perimeter{,
abstract void perimeter();
}
class Square implements Area,Perimeter{
int area,perimeter;
public void area(){
System.out.println("Uploading the value of area--------");
area=side*side;
}
public void perimeter(){
System.out.println("Uploading the value of perimeter--------");
perimeter=4*side;
}
void display(){
System.out.println("Now the value of the area is--------\n"+area);
System.out.println("Now the value of perimeter is--------\n"+perimeter);
}
public static void main(String args[]){
Square obj = new Square();
obj.area();
obj.perimeter();
obj.display();
}
}
