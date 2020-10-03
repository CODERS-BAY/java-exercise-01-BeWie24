package geo;
public class Geometrics1 {
	
public static double doublezahl (double a, double b) {
	return (a*b);
}
public static int intzahl (int a, int b) {
	return (a*b);
}
public static double doubleplus (double a, double b) {
	return (a+b);
}
public static int intplus (int a, int b) {
	return (a+b);
}
	public static void main(String[] args) {
		// area ... Fläche
		
double x = 10.0, y = 5.0, z = 3.0;
int x1 = 8, y1 = 7, z1 = 10, x2 = 100, y2 = 57, z2 = 129, x3 = 45, y3 = 89, z3 = 69;

 System.out.println("Square area");
 System.out.println("x * x = " + doublezahl(x,x));
 System.out.println("x1 * x1 = " + intzahl(x1,x1));
 System.out.println("x2 * x2 = " + intzahl(x2,x2));
 System.out.println("y * y = " + doublezahl(y,y));
 //perimeter ... Umfang
 System.out.println("Square perimeter");
 System.out.println("4 * x = " + doublezahl(4,x));
 System.out.println("4 * x1 = " + intzahl(4,x1));
 System.out.println("4 * x2 = " + intzahl(4,x2));
 System.out.println("4 * y = " + doublezahl(4,y));
 
 System.out.println("Rectangle area");
 System.out.println("x * y = " + doublezahl(x,y));
 System.out.println("x1 * y1 = " + intzahl(x1,y1));
 System.out.println("x2 * y2 = " + intzahl(x2,y2));
 System.out.println("x3 * y3 = " + intzahl(x3,y3));
 
 System.out.println("Rectangle perimeter");
 System.out.println("x + y = " + doubleplus(x,y));
 System.out.println("x1 + y1 = " + intplus(x1,y1));
 System.out.println("x2 + y2 = " + intplus(x2,y2));
 System.out.println("x3 + y3 = " + intplus(x3,y3));
 
 System.out.println("We can also calculate some volumes");
		/*
		 * z is our height y is our radius
		 */ 
 System.out.println("Zone of a sphere");
 double v = (Math.PI * z * (3 * Math.pow(y, 2) + 3 * Math.pow(x, 2) + Math.pow(z, 2))) / 6;
 System.out.println(v);

 System.out.println("Sphere with cylinder");
 System.out.println(Math.PI * Math.pow(z, 3) / 6);

 System.out.println("Ungula");
 System.out.println((double) (2 * x3 * z3) / 3);
	}
}
