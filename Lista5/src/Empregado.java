
public class Empregado {
	private int id;
	private String firstName, lastName;
	private double salary;
	private boolean workDay[] = new boolean[30];

	public Empregado(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Empregado(String firstName, String lastName, int id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}

	public int calcWorkDay(boolean workDay[]) {
		int worked=0;
		for (int i = 0; i < workDay.length; i++) {
			if (workDay[i] == true) {
				worked += 1;
			}
		}
		return worked;
	}

	public double newSalary() {
		int worked = calcWorkDay(workDay);
		if (worked == 30) {
			return salary * 1.01;
		} else if (worked >= 25 && worked <= 27) {
			double desconto = (30 - worked) * (salary * 2 / 100);
			return salary - desconto;
		} else if (worked >= 20 && worked <= 24) {
			double desconto = (30 - worked) * (salary * 3 / 100);
			return salary - desconto;
		} else if (worked < 20) {
			return salary*20/100;
		} else
			return salary;

	}

	public void setWorkDay(boolean workDay, int i) {
		this.workDay[i] = workDay;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return "ID:"+ id+ " Empregado: " + firstName + " " + lastName + ", " + "dias trabalhados: " + calcWorkDay(workDay)
				+ ", Salario novo(R$): " + newSalary();
	}

}
