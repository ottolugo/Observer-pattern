package main;

import java.util.Observable;

public class ConcreteSubject extends Observable {

    private int n = 0;

    public ConcreteSubject(int n) {
	this.n = n;
    }

    public void setValue(int n) {
	this.n = n;
	setChanged();
	notifyObservers();
    }

    public int getValue() {
	return n;
    }
}
