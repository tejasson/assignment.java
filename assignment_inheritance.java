import java.util.*;

class Person{
	public String name;
	public int mobNum;
}

class AcademicPerformance extends Person{
	public String degree;
	public float percentage;
	
	public void AcademsicPerformance1(){
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter name: ");
		name = input.nextLine();
		System.out.print("\nenter mobile number: ");
		mobNum = input.nextInt();
		System.out.print("\nenter degree: ");
		degree = input.next();
		System.out.print("\nenter percentage: ");
		percentage = input.nextFloat();
		
		System.out.println("Name:       "+name);
		System.out.println("Mobile no:  "+mobNum);
		System.out.println("Degree:     "+degree);
		System.out.println("Percentage: "+percentage);
	}
}

class SportsPerformance extends Person{
	public String sportsName;
	public int sportScore;
	
	public void SportsPerformance1(){
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nenter sports name: ");
		sportsName = input.next();
		System.out.print("\nenter sports score: ");
		sportScore = input.nextInt();
		
		System.out.println("Sports:     "+sportsName);
		System.out.println("Score:      "+sportScore);
	}
}

class assignment_inheritance{
	public static void main(String[] args){
		AcademicPerformance obj1 = new AcademicPerformance();
		obj1.AcademicPerformance1();
		SportsPerformance obj2 = new SportsPerformance();
		obj2.SportsPerformance1();
	}
}		
