package function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import predicate.Person;

public class FunctionDemo {
	public static void main(String[] args) {
		List<Person> people = new ArrayList<Person>();
		people.add(new Person(5,"abc",59));
		people.add(new Person(10,"haha",500));
		people.add(new Person(100,"暗杀部队",20000));
		
		List<Car> car = new ArrayList<Car>();
		car.add(new Car(1,"宝马",15000.0));
		car.add(new Car(2,"奔驰",23000.0));
		car.add(new Car(3,"兰博基尼",46000.0));
		
		double s1 = mapSum(people,p->p.getSalary());
		System.out.println(s1);
		
		double s2 = mapSum(car , Car::getPrice);
		System.out.println(s2);
	}
//计算和
	public static <T>double mapSum(List<T> en, Function<T, Double> fun) {
		int sum = 0;
		for (T t : en) {
			sum += fun.apply(t);
		}

		return sum;
	}
	
	
	
}
//这里定义类
 class Car {
	private int id;
	private String name;
	private  double price;
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
	public  double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
