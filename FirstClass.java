package HomeWork2;


public class FirstClass implements SecondClass {
	int a = 21;
	int b = 666;
	
	@Override
	public void method_a() {
		for (int i = a; i <= b; i++) {
			System.out.println(i);
		}
	}
	
	@Override
	public void method_b() {
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				System.out.println(i);
			}
		}
	}
	
	public int primeCheck(int x) {
		int y = 0;
		
		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				y++;
			}
		}
		
		if (y == 2) {
			return 1;
		} else {
			return 0;
		}
	}
	
	@Override
	public void method_c() {
		for (int i = 1; i <= b; i++) {
			if (b % i == 0 && primeCheck(i)) {
				System.out.println(i);
			}
		}
	}
	
	@Override
	public char method_d() {
		return 0;
	}
}