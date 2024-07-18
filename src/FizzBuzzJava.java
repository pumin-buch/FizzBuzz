
public class FizzBuzzJava {

	public static void main(String[] args) {
	
		FizzBuzz();
	
	}
	

	public static void FizzBuzz() {
		
		int firstNum = 3;
		int secondNum = 5;
		
		for(int i = 1; i <= 100; i++) {
			if(i % firstNum == 0 && i % secondNum == 0) {
				System.out.println("FizzBuzz");
			} else if(i % firstNum == 0) {
				System.out.println("Fizz");
			} else if(i % secondNum == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
		
	
	}
	
