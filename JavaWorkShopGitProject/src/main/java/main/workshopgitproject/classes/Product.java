/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/
package main.workshopgitproject.classes;

import java.util.HashSet;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Product.
 * 
 * @author alux9127477l
 */
public class Product {
	/**
	 * Description of the property invoiceLines.
	 */
	public HashSet<InvoiceLine> invoiceLines = new HashSet<InvoiceLine>();

	/**
	 * Description of the property description.
	 */
	private String description = null;

	/**
	 * Description of the property identifier.
	 */
	private int identifier = 0;

	/**
	 * Description of the property stock.
	 */
	private int stock = 0;

	private ProductSuplier suplierProduct = new ProductSuplier(null, null);

	/**
	 * Description of the property price.
	 */
	private double price = 0;

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
	public String getDescription() {
		return this.description;
	}

	/**
	 * Sets a value to attribute description. 
	 * @param newDescription 
	 */
	public void setDescription(String newDescription) {
		this.description = newDescription;
	}

	/**
	 * Returns suplierID.
	 * @return suplierID 
	 */
	

	/**
	 * Sets a value to attribute suplierID. 
	 * @param newSuplierID 
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
	 * Returns stock.
	 * @return stock 
	 */
	public int getStock() {
		return this.stock;
	}

	/**
	 * Sets a value to attribute stock. 
	 * @param newStock 
	 */
	public void setStock(int newStock) {
		this.stock = newStock;
	}

	/**
	 * Returns suplierName.
	 * @return suplierName 
	 */
	

	/**
	 * Sets a value to attribute suplierName. 
	 * @param newSuplierName 
	 */
	

	/**
	 * Returns price.
	 * @return price 
	 */
	public double getPrice() {
		return this.price;
	}

	/**
	 * Sets a value to attribute price. 
	 * @param newPrice 
	 */
	public void setPrice(double newPrice) {
		this.price = newPrice;
	}

}
