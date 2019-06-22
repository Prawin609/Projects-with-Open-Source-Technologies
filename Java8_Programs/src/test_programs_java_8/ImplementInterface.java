package test_programs_java_8;

public class ImplementInterface implements DefaultInterface {

	public static void main(String[] args) {
		DefaultInterface def = new ImplementInterface();
		def.load();
		def.run();
	}

	@Override
	public void run() {
		System.out.println("custom implemented run method");
	}
	
	
	


}
