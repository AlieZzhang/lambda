package stream;

import java.util.function.Supplier;
import java.util.stream.Stream;

//上十级台阶的 一次一阶 或一次 两阶 一共多少方式
public class InfiniteDemo {

	// 1:1 2:2 3:3 4{1111,121,112,211,22}
	public static void main(String[] args) {
		Stream<Integer> fibonacci = Stream.generate(new SupplierDemo());
        Object[] arr = fibonacci.limit(10).toArray();
        for (Object object : arr) {
			System.out.println(object);
		}
        
	/*	for (int i = 1; i <= 10; i++) {
			System.out.println(F(i));
		}*/
	}
	
	//自定义的方法实现功能
	/*public static Integer F(int n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		int s = 0;
		s = F(n - 1) + F(n - 2);
		return s;
	}*/

}
