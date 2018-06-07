package stream;

import java.util.stream.IntStream;

public class IntStreamDemo {
	public static void main(String[] args) {
		//体验range和rangeClosed的区别
		IntStream r1 = IntStream.range(30, 50);
		r1.forEach(System.out::print);
		System.out.println();
		IntStream rc2 = IntStream.rangeClosed(30, 50);
		rc2.forEach(System.out::print);
		
		
	}
}
