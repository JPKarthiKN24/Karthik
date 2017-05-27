
class Test {

	public static void main(String args[]) {
		AdderSingleton adder = AdderSingleton.getInstance();
		int result = adder.addOne(5);
		
		AdderSingleton adder = new AdderSingleton();
		
		
		if(result == 6) System.out.println("OK");
		else System.out.println("FAIL!");
		
		AdderSingleton adder2 = AdderSingleton.getInstance();
		result = adder2.addOne(7);
		
		if(result == 8) System.out.println("OK");
		else System.out.println("FAIL!");
		
	}
}
