import java.util.Scanner;
abstract class Vehicle
{
	int year_of_manufacture;
	
	Vehicle(int year)
	{
		year_of_manufacture = year;
	}

	abstract void getData();
	abstract void putData();
}

class TwoWheeler extends Vehicle
{
	TwoWheeler(int year)
	{
		super(year);
	}
	
	void getData()
	{
		System.out.println("The Year of Manufacture of TwoWheeler is:"+year_of_manufacture);
	}
	
	void putData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the new Year of Manufacture of TwoWheeler:");
		int year = sc.nextInt();
		year_of_manufacture=year;
        System.out.println("The Changed Year of Manufacture of TwoWheeler is:"+year_of_manufacture);
	}
}

final class FourWheeler extends Vehicle
{
	FourWheeler(int year)
	{
		super(year);
	}
	
	final void getData()
	{
		System.out.println("The Year of Manufacture of FourWheeler is:"+year_of_manufacture);
	}
	
	final void putData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the new Year of Manufacture of FourWheeler:");
		int year = sc.nextInt();
		year_of_manufacture=year;
        System.out.println("The Changed Year of Manufacture of FourWheeler is:"+year_of_manufacture);
	}
}

class MyTwoWheeler extends TwoWheeler
{
	MyTwoWheeler(int year)
	{
		super(year);
	}

}

public class Demo
{
	public static void main(String []args)
	{
		Vehicle V;
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year of manufacture of TwoWheeler:");		
		year=sc.nextInt();
		V=new TwoWheeler(year);
		V.getData();
		V.putData();
		
		System.out.println("Enter year of manufacture of FourWheeler:");		
		year=sc.nextInt();
		V=new FourWheeler(year);
		V.getData();
		V.putData();
		
		System.out.println("Enter year of manufacture of MyTwoWheeler:");		
		year=sc.nextInt();
		V=new MyTwoWheeler(year);
		V.getData();
		V.putData();
        //sc.close();
    }
}