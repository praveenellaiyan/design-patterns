/**
 * 
 */

/**
 Demonstrate Builder design pattern
 * @author Praveen Ellaiyan
 *
 */
public class Main {

	/**
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		
		// Instantiate SuperHero using builder
		SuperHero superHero = new SuperHero.SuperHeroBuilder("Thanos", false)
								.withSpecialPower("balance humanity")
								.withWeapon(new String[] {"Infinity Stones"})
								.withSuit("Armored")
								.build();
		
		// Ouput super hero instance built using builder
		System.out.println(superHero.toString());

	}

}
