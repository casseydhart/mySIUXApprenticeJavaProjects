package com.ust;
import java.util.Scanner;

public class Ex12GradeReport {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Student Name:");
		String name = in.nextLine();
		System.out.println("Enter Grade in Subject 1:");
		String grade_s1 = in.nextLine();
		int subject1 = Integer.parseInt(grade_s1);
		System.out.println("Enter Grade in Subject 2:");
		String grade_s2 = in.nextLine();
		int subject2 = Integer.parseInt(grade_s2);
		System.out.println("Enter Grade in Subject 3:");
		String grade_s3 = in.nextLine();
		int subject3 = Integer.parseInt(grade_s3);
		if (subject1<70){
		System.out.println("Subject1"+ subject1 +"Failed");
		}
		else 
			if(subject1>=70)
			System.out.println("Subject 1" + subject1 + "Passed");	
		if (subject2<70){
			System.out.println("Subject2"+ subject2 +"Failed");
			}
			else 
				if(subject2>=70)
				System.out.println("Subject 2" + subject2 + "Passed");
		if (subject3<70){
			System.out.println("Subject3"+ subject3 +"Failed");
			}
			else 
				if(subject3>=70)
				System.out.println("Subject 3" + subject3 + "Passed");
		int gradeTotal = 85 + 66 + 70;
		double averageGrade = gradeTotal/3;
		System.out.println("Grade total is" + gradeTotal + "Average grade is" + averageGrade);
	}
}