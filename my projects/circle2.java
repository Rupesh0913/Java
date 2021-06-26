
class circle2 {
    double r;

    double cirumferance(){
        return 2*Math.PI*r;
    }
    double area(){
        return Math.PI*r*r;
    }
    public static void main(String[] args) {
        
        circle2 obj=new circle2();
        circle2 obj2=new circle2();
        obj.r=5;
        obj2.r=4;
        System.out.println("The circumference is: "+obj.cirumferance());
        System.out.println("The area is: "+obj.area());
        System.out.println("\n");
        System.out.println("The circumference is: "+obj2.cirumferance());
        System.out.println("The area is: "+obj2.area());

    }   
}
