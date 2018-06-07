package predicate;

public class Person {
	private int id;
	private String name;
	private double Salary;
	
	public Person(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		Salary = salary;
	}
	
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
	}
	
	public Person() {
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	
}
