package com.efeakil.solid.i;

/**
 * @author Efe 
 * 			The Interface Segregation Principle (ISP) states that a class
 *         should not be forced to implement interfaces it does not use. In
 *         other words, a class should only be required to implement the methods
 *         that are relevant to its behavior.
 * 
 *         class Robot implements Worker { 
 *         public void work() { // robot works }
 *         public void eat() { // robots don't eat, so this method is not implemented } 
 *         }
 * 
 *         In the example above, the Robot class is only required to implement
 *         the work() method because it doesn't eat. This adheres to the ISP
 *         because it is not forced to implement methods that are not relevant
 *         to its behavior.
 * 
 *         To fix the code example above to adhere to the Interface Segregation
 *         Principle (ISP), you can create separate interfaces for each
 *         behavior. In this case, you could create an Eater interface and a
 *         Worker interface. The HourlyWorker and SalariedWorker classes would
 *         implement both interfaces, while the Robot class would only implement
 *         the Worker interface.
 * 
 *         By separating the interfaces in this way, the Robot class is only
 *         required to implement the methods that are relevant to its behavior
 *         (in this case, just the work() method), which adheres to the ISP.
 */
public class InterfaceSegregationPrinciple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
