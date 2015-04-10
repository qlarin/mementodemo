
public class MementoTest {

	public static void main(String[] args) {
		
		Originator o = new Originator();
		CareTaker c = new CareTaker();
		
		o.setState("State 1");
		o.setState("State 2");
		c.add(o.saveStateToMemento());
		o.setState("State 3");
		c.add(o.saveStateToMemento());
		System.out.println("Current state: " + o.getState());
		
		o.getStateFromMemento(c.get(0));
		System.out.println("First saved state: " + o.getState());

	}

}
