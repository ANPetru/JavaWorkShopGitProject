/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/
package main.workshopgitproject.classes;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Product.
 * 
 * @author alux9127477l
 */
public class Product {
	/**
	 * Description of the property stock.
	 */
	private EInt stock = null;
	
	/**
	 * Description of the property price.
	 */
	private EDouble price = null;
	
	/**
	 * Description of the property suplierID.
	 */
	private EString suplierID = null;
	
	/**
	 * Description of the property identifier.
	 */
	private int identifier = 0;
	
	/**
	 * Description of the property invoiceLines.
	 */
	public HashSet<InvoiceLine> invoiceLines = new HashSet<InvoiceLine>();
	
	/**
	 * Description of the property description.
	 */
	private EString description = null;
	
	/**
	 * Description of the property suplierName.
	 */
	private EString suplierName = null;
	
	// Start of user code (user defined attributes for Product)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public Product() {
		// Start of user code constructor for Product)
		super();
		// End of user code
	}
	
	// Start of user code (user defined methods for Product)
	
	// End of user code
	/**
	 * Returns stock.
	 * @return stock 
	 */
	public EInt getStock() {
		return this.stock;
	}
	
	/**
	 * Sets a value to attribute stock. 
	 * @param newStock 
	 */
	public void setStock(EInt newStock) {
	    this.stock = newStock;
	}

	/**
	 * Returns price.
	 * @return price 
	 */
	public EDouble getPrice() {
		return this.price;
	}
	
	/**
	 * Sets a value to attribute price. 
	 * @param newPrice 
	 */
	public void setPrice(EDouble newPrice) {
	    this.price = newPrice;
	}

	/**
	 * Returns suplierID.
	 * @return suplierID 
	 */
	public EString getSuplierID() {
		return this.suplierID;
	}
	
	/**
	 * Sets a value to attribute suplierID. 
	 * @param newSuplierID 
	 */
	public void setSuplierID(EString newSuplierID) {
	    this.suplierID = newSuplierID;
	}

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
	 * Returns invoiceLines.
	 * @return invoiceLines 
	 */
	public HashSet<InvoiceLine> getInvoiceLines() {
		return this.invoiceLines;
	}

	/**
	 * Returns description.
	 * @return description 
	 */
	public EString getDescription() {
		return this.description;
	}
	
	/**
	 * Sets a value to attribute description. 
	 * @param newDescription 
	 */
	public void setDescription(EString newDescription) {
	    this.description = newDescription;
	}

	/**
	 * Returns suplierName.
	 * @return suplierName 
	 */
	public EString getSuplierName() {
		return this.suplierName;
	}
	
	/**
	 * Sets a value to attribute suplierName. 
	 * @param newSuplierName 
	 */
	public void setSuplierName(EString newSuplierName) {
	    this.suplierName = newSuplierName;
	}



}
