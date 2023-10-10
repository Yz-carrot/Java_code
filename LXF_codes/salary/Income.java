package salary;

interface Income {
	double getTax();
	default void abstractPut(){
		System.out.println("I am abstract!");
	}
}
