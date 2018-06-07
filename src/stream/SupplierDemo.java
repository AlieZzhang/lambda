package stream;

import java.util.function.Supplier;

//自定义的supplier实现
public class SupplierDemo implements Supplier<Integer> {
	Integer a = 1;
	Integer b = 1;
	public Integer get() {
		Integer x = a + b;
	        a = b;
	        b = x;
	       
	        
	        return a;
		}
}