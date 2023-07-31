
public class Application {

	public static void main(String[] args) {
		
		Wizard bob = new Wizard("Bob");
		bob.setHealth(30);
		System.out.println("The Wizard's name is: " + bob.getName());
		System.out.println("The wizard's Health is currently: "+ bob.getHealth());
		
		bob.takeDamage(10);
		
		System.out.println("The Wizard's health is now: " + bob.getHealth()); // should return 20 hp
		
		
		bob.setKey(43456);
		bob.lock(4);
		bob.takeDamage(5);
		
		System.out.println("The Wizard's health is now: " + bob.getHealth()); //should return 15 hp
		
		bob.lock(43456);
		bob.takeDamage(10);
		
		System.out.println("The Wizard's health is now: " + bob.getHealth()); //should return 15 hp
		
		bob.unlock(43456);
		bob.takeDamage(5);
		
		System.out.println("The Wizard's health is now: " + bob.getHealth()); //should return 10 hp
		
		bob.setKey(100);
		System.out.print("The key is: " + bob.getKey()); //should return original key "43456"
	}

}
