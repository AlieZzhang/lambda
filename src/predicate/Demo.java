package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Demo {
	public static void main(String[] args) {
		List<Person> people = new ArrayList<Person>();
		people.add(new Person(5,"abc",59));
		people.add(new Person(10,"haha",500));
		people.add(new Person(100,"暗杀部队",20000));
		 
		List<Person> p1 = findMatchPerson(people,p -> p.getId()==10);
		//lambda遍历输出  
		p1.forEach(System.out::println);
		System.out.println("-----------------");
		List<Person> p2 = findMatchPerson(people,p -> p.getName().equals("abc"));
		System.out.println(p2);
	}
	//条件查询
	//通过steam实现，steam会在之后学习
/*public static List<Person> findMatchPerson(List<Person> people,Predicate<? super Person> pred){
		return people.stream().filter(pred).collect(Collectors.toList());
	}*/
	//通常方法
	public static List<Person> findMatchPerson(List<Person> people,Predicate<Person> pred){
		List<Person> list = new ArrayList<Person>();
		for (Person person : people) {
			if(pred.test(person)) {
				list.add(person);
			}
		}
		
		return list;
	}
	
}
