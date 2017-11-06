package main;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observer {

    private ConcreteSubject ov = null;

    public ConcreteObserver(ConcreteSubject ov) {
	this.ov = ov;
    }

    @Override
    public void update(Observable o, Object arg) {
	if (o == ov) {
	    System.out.println(ov.getValue());
	}
    }

}
