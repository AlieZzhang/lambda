package stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

//IntStream的练习
public class IntStreamDemo {
	public static void main(String[] args) {
		//体验range和rangeClosed的区别
		IntStream r1 = IntStream.range(30, 50);
		r1.forEach(System.out::print);
		System.out.println();
		IntStream rc2 = IntStream.rangeClosed(30, 50);
		rc2.forEach(System.out::print);
		System.out.println();
		//一些其他方法的体验
		IntStream.of(5,6,7).forEach(System.out::print);
		System.out.println();
		
		Stream.of("1","3","5").mapToInt(Integer::parseInt).forEach(System.out::print);
		System.out.println();
		
		IntStream.builder().add(1).add(2).add(3).build().forEach(System.out::print);;
		System.out.println();
		
		IntStream.empty().forEach(System.out::print);
		System.out.println();
		
	}
}
