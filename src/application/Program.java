package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Student name: ");
		String name = scanner.nextLine();
		System.out.print("Grade in first quarter (0 - 30): ");
		double gradeFirstQuarter = scanner.nextDouble();
		System.out.print("Grade in second quarter (0 - 35): ");
		double gradeSecondQuarter = scanner.nextDouble();
		System.out.print("Grade in third quarter (0 - 35): ");
		double gradeThirdQuarter = scanner.nextDouble();
		Student student = new Student(name, gradeFirstQuarter, gradeSecondQuarter, gradeThirdQuarter);
		System.out.println();
		
		System.out.println(student.getName() + " - Final grade = " + String.format("%.2f", student.finalGrade()));
		student.finalSituation();
		
		scanner.close();
	}

}
