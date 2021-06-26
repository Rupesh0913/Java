import java.util.*;

class Inheritance{
    public static void main(String[] args) {
    int l,b,h;
    Scanner obj=new Scanner(System.in);
		System.out.println("Enter the first no: ");
		l = obj.nextInt();
        System.out.println("Enter the second no: ");
		b = obj.nextInt();
		System.out.println("Enter the third no: ");
        h = obj.nextInt();        
    }
}
class Area extends Inheritance {
    void area(int l, int b){
        int Area;
        Area=l*b;
        System.out.println("The Area of the room is :"+Area);
    }
}
class Volume extends Inheritance {
    void volume(int l, int b, int h){
        int Volume;
        Volume=l*b*h;
        System.out.println("The Volume of the room is :"+Volume);
    }
}
