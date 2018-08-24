
public class Date {
	private int day,month,year;
	
	public void display() {
		System.out.println(day+"/"+month+"/"+year);
	}
	
	public Date() {
		day=1;
		month=8;
		year=2018;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public Date(int d, int m, int y) {
		day=d;
		month=m;
		year=y;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
}
