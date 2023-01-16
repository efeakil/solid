package com.efeakil.solid.all;

/**
 * @author Efe 
 * 		In this example, the Single Responsibility Principle is applied
 *         by separating the engine logic from the car logic. The Open/Closed
 *         Principle is applied by allowing for new types of cars to be added
 *         (e.g. Sedan, Truck) without modifying the Car class. The Liskov
 *         Substitution Principle is applied by allowing any implementation of
 *         PaymentService to be used in the OrderService class. The Interface
 *         Segregation Principle is applied by having multiple small interfaces
 *         for specific purposes, instead of having one large interface. The
 *         Dependency Inversion Principle is applied by depending on
 *         abstractions (Engine , PaymentService, Logger) rather than concrete
 *         implementations in the higher-level classes (Car, OrderService).
 * 
 *         It's worth noting that this is a simplified example and in a
 *         real-world scenario, the classes and interfaces may have more methods
 *         and properties, and the relationships between them may be more
 *         complex. However, this example demonstrates how the SOLID principles
 *         can be applied to improve the design and maintainability of the
 *         codebase.
 * 
 *         In this example, OrderService is depend on PaymentService and Logger,
 *         PaymentService and Logger are depend on their interfaces. Car class
 *         is depend on Engine interface and its child classes Sedan and Truck
 *         have their own implementation of honk method.
 * 
 *         All of these examples, the SOLID principles are applied to make the
 *         code more maintainable, extendable and testable. The SOLID principles
 *         help to write code that is easy to understand, change, and scale.
 */
public class SolidExample {

	// Single Responsibility Principle
	interface Engine {
		void start();
	}

	class ElectricEngine implements Engine {
		public void start() {
			// Electric engine start logic
		}
	}

	class GasEngine implements Engine {
		public void start() {
			// Gas engine start logic
		}
	}

	// Open/Closed Principle
	abstract class Car {
		private Engine engine;

		public Car(Engine engine) {
			this.engine = engine;
		}

		public void start() {
			engine.start();
		}

		public abstract void honk();
	}

	class Sedan extends Car {
		public Sedan(Engine engine) {
			super(engine);
		}

		public void honk() {
			// Sedan honking logic
		}
	}

	class Truck extends Car {
		public Truck(Engine engine) {
			super(engine);
		}

		public void honk() {
			// Truck honking logic
		}
	}

	// Liskov Substitution Principle
	interface PaymentService {
		void processPayment(double amount);
	}

	class CreditCardPaymentService implements PaymentService {
		public void processPayment(double amount) {
			// Credit card payment processing logic
		}
	}

	class PayPalPaymentService implements PaymentService {
		public void processPayment(double amount) {
			// PayPal payment processing logic
		}
	}

	// Interface Segregation Principle
	interface Logger {
		void logInfo(String message);

		void logError(String message);
	}

	class FileLogger implements Logger {
		public void logInfo(String message) {
			// Log info message to a file
		}

		public void logError(String message) {
			// Log error message to a file
		}
	}

	class DatabaseLogger implements Logger {
		public void logInfo(String message) {
			// Log info message to a database
		}

		public void logError(String message) {
			// Log error message to a database
		}
	}

	// Dependency Inversion Principle
	class OrderService {
		private PaymentService paymentService;
		private Logger logger;

		public OrderService(PaymentService paymentService, Logger logger) {
			this.paymentService = paymentService;
			this.logger = logger;
		}

		public void placeOrder(double amount, String items) {
			try {
				paymentService.processPayment(amount);
				logger.logInfo("Order placed successfully: " + items);
			} catch (Exception e) {
				logger.logError("Error placing order: " + e.getMessage());
			}
		}
	}

}
