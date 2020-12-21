import java.util.Arrays;

/**
 * 
 */

/**
 * @author Praveen Ellaiyan
 *
 */
public final class SuperHero {

	/**
	 * Name of the super hero
	 */
	private String name;

	/**
	 * Tells whether super hero is life saver or not
	 */
	private boolean isLifeSaver;

	/**
	 * Power the super hero contains
	 */
	private String specialPower;

	/**
	 * Weapon used by super hero
	 */
	private String[] weapon;

	/**
	 * Name of the suit super hero wears
	 */
	private String suit;

	/**
	 Construct super hero using builder
	 * @param builder super hero builder instance with all props
	 */
	private SuperHero(SuperHeroBuilder builder) {
		super();
		this.name = builder.name;
		this.specialPower = builder.specialPower;
		this.weapon = builder.weapon;
		this.suit = builder.suit;
		this.isLifeSaver = builder.isLifeSaver;
	}

	/**
	 Builder to construct super hero
	 * @author Praveen Ellaiyan
	 *
	 */
	public static class SuperHeroBuilder {

		/**
		 * Name of the super hero
		 */
		private String name;

		/**
		 * Tells whether super hero is life saver or not
		 */
		private boolean isLifeSaver;

		/**
		 * Power the super hero contains
		 */
		private String specialPower;

		/**
		 * Weapon used by super hero
		 */
		private String[] weapon;

		/**
		 * Name of the suit super hero wears
		 */
		private String suit;

		/**
		 * @param name Name of the super hero
		 * @param isLifeSaver Tells whether super hero is life saver or not
		 */
		public SuperHeroBuilder(String name, boolean isLifeSaver) {
			super();
			this.name = name;
			this.isLifeSaver = isLifeSaver;
		}

		/**
		 Add special power to super hero
		 * @param specialPower the specialPower to set
		 * @return instance of super hero built using builder
		 */
		public SuperHeroBuilder withSpecialPower(String specialPower) {
			this.specialPower = specialPower;
			return this;
		}

		/**
		 Define weapon used by super hero
		 * @param weapon the weapon to set
		 * @return instance of super hero built using builder
		 */
		public SuperHeroBuilder withWeapon(String[] weapon) {
			this.weapon = weapon;
			return this;
		}

		/**
		 Define suit for super hero
		 * @param suit the suit to set
		 * @return instance of super hero built using builder
		 */
		public SuperHeroBuilder withSuit(String suit) {
			this.suit = suit;
			return this;
		}

		/**
		 Instantiate super hero
		 * @return returns instance of super hero built using builder
		 */
		public SuperHero build() {
			return new SuperHero(this);
		}

	}

	/**
	 Super Hero info
	 * @return Return super hero details
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SuperHero > ").append(name).append(" has an ability to ").append(specialPower)
				.append(" using his ").append(Arrays.toString(weapon));
		return builder.toString();
	}

}
