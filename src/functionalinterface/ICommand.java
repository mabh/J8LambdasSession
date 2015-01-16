package functionalinterface;

@FunctionalInterface
public interface ICommand<A> {
	public void execute(A a);
}
