/**
 * 
 */
package inheritance;

/**
 * @author Nicola
 *
 */
/**
 * @author Nicola
 *
 */
public class Programmer extends StaffMember {

	/**
	 * @param args
	 */
	private String language;

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Programmer [language=" + language + "]";
	}
	
	

	}


