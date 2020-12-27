import java.lang.Math;
import java.util.Scanner;
class Circle
{
	float r;
	
	Circle(float rad)
	{
		r=rad;
	}
	
	float Area_Circle()
	{
		return(22*r*r/7);
	}
}

class Sector extends Circle
{
	float tita;
	
	Sector(float rad,float T)
	{
		//r=rad;
		super(rad);		
		tita=T;
	}

	float Area_Sector()
	{
		return(r*r*tita/2);
	}
}

class Segment extends Circle
{
	float h;
	
	Segment(float rad,float l)
	{
		//r=rad;
		super(rad);
		h=l;
	}

	double Area_Segment()
	{
		double A = r*r*((r-h)/r)-Math.sqrt(2*r*h-h*h);
		return A;
	}
}

class Test
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		float rad,T,l;
		System.out.println("Enter Radius of Circle:");
		rad = sc.nextFloat();
		Circle c = new Circle(rad);
		System.out.println("The area of the Circle of Radius:"+rad+" is: "+c.Area_Circle());
		
		System.out.println("Enter Radius of Sector:");
		rad=sc.nextFloat();
		System.out.println("Enter Angle of Sector in Radian:");
		T=sc.nextFloat();
		Sector s = new Sector(rad,T);
		System.out.println("The area of the Sector is: "+s.Area_Sector());
		
		System.out.println("Enter Radius of Segment:");
		rad=sc.nextFloat();
		System.out.println("Enter the length of Segment:");
		l=sc.nextFloat();
		Segment st = new Segment(rad,l);
		System.out.println("The area of the Segment is: "+st.Area_Segment());		
	}
}