package test_programs_java_8;

public interface DefaultInterface {
	
	public void run();
	
	default void load() {
		System.out.println("This is a default interface");
	}
	

}
