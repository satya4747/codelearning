package codelearning.basic.advinterface;

public interface MyInterface {
	double PI=3.14;
	String getName();
	
	public static void print() {
		System.out.println("welcome");
	}
	public static void print1() {
		System.out.println("welcome");
	}
	default void display() {
		System.out.println("display");
	}
	default void display1() {
		System.out.println("display");
	}	
}
