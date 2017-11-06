package main;

public class Test {

    public static void main(String[] args) {
	ConcreteSubject ov = new ConcreteSubject(0);
	ConcreteObserver to = new ConcreteObserver(ov);
	ov.addObserver(to);
	ov.setValue(20);
    }
}
