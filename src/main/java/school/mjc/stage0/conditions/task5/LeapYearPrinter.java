package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
		if (0 == year % 4) {
			System.out.println("leap");
		} else {
			System.out.println("not leap");
		}
    }
}
