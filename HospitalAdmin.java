/**
 * 
 */
package inheritance;

/**
 * @author Nicola
 *
 */
public class HospitalAdmin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		StaffMember sm1 = new StaffMember();
		sm1.setFirstName("Joe");
		sm1.setLastName("Bloggs");
		System.out.println(sm1.toString());
		
		Doctor d1 = new Doctor();
		d1.setFirstName("DR");
		d1.setLastName("Scrub");
		d1.setWard(14);
		System.out.println(d1.toString());
		
		Programmer p1 = new Programmer();
		p1.setFirstName("Nicola");
		p1.setLastName("Mc Nally");
		p1.setLanguage("Java");
		System.out.println(p1.toString());
		
		
		
		
		

	}

}
