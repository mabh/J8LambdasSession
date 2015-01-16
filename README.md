About Java 8 Lambdas

Agenda:

Agenda:

1. About Lambdas
	Functional theory
		Von Neumann
		Church
	Need for lambdas
		Increasing need for parameterization of behaviour
		Concurrency concerns
			Mutable state prevention
			Composition of behaviour
				Groovy - curry!!
					Returns a method - so we see method (behaviour) is returned
		Functional style of programming
			Clojure state and identities
2. JVM ecosystem languages provided these 
	JVM itself has byte code instructions supporting it
		invoke instructions
		invokedynamic example - lambdas
	JVM has, now need in Java language 
		Other dynamic languages are implemented in Java itself
		Lambdas

3. Java Lambda programming
	Representing behaviour as objects
		Passed around, returned
	Iterative style loop
	Better iterative style loop
	Functional style loop
	Functional interfaces
		Examples

4. Streams
	New type of iterator implementation in JDK
	Methods
		Non Terminal intermediate operations
		Terminal
		Lazy evaluation
	Stream methods - Non terminal and Terminal
		Filter, Map, Reduce, OrElse!
	Example
		process stock prices! 
		Iterative
		Functional


		
		