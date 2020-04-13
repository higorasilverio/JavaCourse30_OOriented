package entities;

public class Student {
	
	private String name;
	private double gradeFirstQuarter;
	private double gradeSecondQuarter;
	private double gradeThirdQuarter;
	
	public Student (String name, double gradeFirstQuarter, double gradeSecondQuarter, double gradeThirdQuarter) {
		this.name = name;
		this.gradeFirstQuarter = gradeFirstQuarter;
		this.gradeSecondQuarter = gradeSecondQuarter;
		this.gradeThirdQuarter = gradeThirdQuarter;
	}
		
	public String getName() {
		return this.name;
	}

	public double finalGrade() {
		return this.gradeFirstQuarter + this.gradeSecondQuarter + this.gradeThirdQuarter;
	}
	
	public void finalSituation() {
		if (finalGrade() >= 60.0) System.out.println("Pass!");
		else {
			System.out.println("Fail!");
			double pointsMissing = 60.0 - finalGrade();
			System.out.println("Missing " + String.format("%.2f", pointsMissing) + " points!");
		}
	}

}
