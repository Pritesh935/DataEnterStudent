/*
 * Redevelop above program to store dynamic number of Student objects in the array
 * as many students user wants to store 
 */

//ArrayOfClassObjects_DynamicWay.java
import java.util.Arrays;
import java.util.Scanner;

public class Test08_ArrayOfClassObjects_DynamicWay {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("How many students do you want to enter?: ");
		int numberOfStudents = scn.nextInt(); scn.nextLine();
		
		Student[] sa = new Student[numberOfStudents];  //dynamic memory
		for(int i=0; i<numberOfStudents; i++) { //dynamic code for creating, initializing and storing student objects

			System.out.println("\nEnter student"+(i+1)+" details") ;
			
			Student s1 = new Student();			//creating new Student object
			
			System.out.print("  sno\t\t: ");				//reading its values 
			s1.setSno(scn.nextInt()); scn.nextLine();		//and storing in this 	
															//Student instance
			System.out.print("  sname\t\t: ");	
			s1.setSname(scn.nextLine());

			System.out.print("  course\t: ");	
			s1.setCourse(scn.nextLine());

			System.out.print("  fee\t\t: ");	
			s1.setFee(scn.nextDouble());
			
			sa[i] = s1;							//Storing this Student object in array
			
		}//for loop end							//iterating for reading another Student data 				
		
		System.out.println("\nStudent details are");
		System.out.println(Arrays.toString(sa));    //printing all Students from array
		
		
	}
}









