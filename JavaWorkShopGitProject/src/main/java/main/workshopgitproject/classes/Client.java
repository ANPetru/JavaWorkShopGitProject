/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/
package main.workshopgitproject.classes;

import java.util.HashSet;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Client.
 * 
 * @author alux9127477l
 */
public class Client {
	/**
	 * Description of the property surname.
	 */
	private String surname = "";

	/**
	 * Description of the property invoices.
	 */
	public HashSet<Invoice> invoices = new HashSet<Invoice>();

	/**
	 * Description of the property identifier.
	 */
	private int identifier = 0;

	/**
	 * Description of the property dni.
	 */
	private String dni = "";

	/**
	 * Description of the property nom.
	 */
	private String nom = "";

	private CLientAddress data = new CLientAddress("", "", "", Integer.valueOf(0), "");

	

	// Start of user code (user defined attributes for Client)

	// End of user code

	/**
	 * The constructor.
	 */
	public Client() {
		// Start of user code constructor for Client)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Client)

	// End of user code
	/**
	 * Returns streetName.
	 * @return streetName 
	 */
	

	/**
	 * Sets a value to attribute streetName. 
	 * @param newStreetName 
	 */
	

	/**
	 * Returns village.
	 * @return village 
	 */
	

	/**
	 * Sets a value to attribute village. 
	 * @param newVillage 
	 */
	

	/**
	 * Returns surname.
	 * @return surname 
	 */
	public String getSurname() {
		return this.surname;
	}

	/**
	 * Sets a value to attribute surname. 
	 * @param newSurname 
	 */
	public void setSurname(String newSurname) {
		this.surname = newSurname;
	}

	/**
	 * Returns invoices.
	 * @return invoices 
	 */
	public HashSet<Invoice> getInvoices() {
		return this.invoices;
	}

	/**
	 * Returns country.
	 * @return country 
	 */
	
	/**
	 * Sets a value to attribute country. 
	 * @param newCountry 
	 */
	

	/**
	 * Returns identifier.
	 * @return identifier 
	 */
	public int getIdentifier() {
		return this.identifier;
	}

	/**
	 * Sets a value to attribute identifier. 
	 * @param newIdentifier 
	 */
	public void setIdentifier(int newIdentifier) {
		this.identifier = newIdentifier;
	}

	/**
	 * Returns dni.
	 * @return dni 
	 */
	public String getDni() {
		return this.dni;
	}

	/**
	 * Sets a value to attribute dni. 
	 * @param newDni 
	 */
	public void setDni(String newDni) {
		this.dni = newDni;
	}

	/**
	 * Returns streetNumber.
	 * @return streetNumber 
	 */
	

	/**
	 * Sets a value to attribute streetNumber. 
	 * @param newStreetNumber 
	 */
	

	/**
	 * Returns nom.
	 * @return nom 
	 */
	public String getNom() {
		return this.nom;
	}

	/**
	 * Sets a value to attribute nom. 
	 * @param newNom 
	 */
	public void setNom(String newNom) {
		this.nom = newNom;
	}

	public void shutDown() {
		System.out.println("Thanks for using the application");
	}

	/**
	 * Returns province.
	 * @return province 
	 */
	

	/**
	 * Sets a value to attribute province. 
	 * @param newProvince 
	 */
	

}
