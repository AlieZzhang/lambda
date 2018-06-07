
public class Demo {
	public static void main(String[] args) {
		double d1 = integrate(x -> x, 10, 100, 1000);
		System.out.println(d1);
		double d2 = integrate(x -> x * x, 10, 100, 1000);
		System.out.println(d2);
		double d3 = integrate(x -> Math.pow(x, 3), 10, 100, 1000);
		System.out.println(d3);
		double d4 = integrate(Math::sin, 10, 100, 1000);
		System.out.println(d4);
		
		double d5 = integrate(x -> x*x, 10,20,10);
		System.out.println(d5);

	}

	public static double integrate(Integrable func, double a, double b, int numSlices) {
		if (numSlices < 1)
			numSlices = 1;
		double delta = (b - a) / numSlices;
		double start = a + delta / 2.0;
		double sum = 0.0;
		for (int i = 0; i < numSlices; i++) {
			sum += delta * func.eval(start + delta * i);
		}

		return sum;
	}

}
