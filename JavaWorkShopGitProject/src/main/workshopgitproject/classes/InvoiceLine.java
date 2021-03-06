/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/
package main.workshopgitproject.classes;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of InvoiceLine.
 * 
 * @author alux9127477l
 */
public class InvoiceLine {
	/**
	 * Description of the property invoices.
	 */
	public Invoice invoices = null;
	
	/**
	 * Description of the property quantity.
	 */
	private int quantity = 0;
	
	/**
	 * Description of the property invoiceLineAmount.
	 */
	private EDouble invoiceLineAmount = null;
	
	/**
	 * Description of the property number.
	 */
	private int number = 0;
	
	/**
	 * Description of the property products.
	 */
	public Product products = null;
	
	// Start of user code (user defined attributes for InvoiceLine)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public InvoiceLine() {
		// Start of user code constructor for InvoiceLine)
		super();
		// End of user code
	}
	
	// Start of user code (user defined methods for InvoiceLine)
	
	// End of user code
	/**
	 * Returns invoices.
	 * @return invoices 
	 */
	public Invoice getInvoices() {
		return this.invoices;
	}
	
	/**
	 * Sets a value to attribute invoices. 
	 * @param newInvoices 
	 */
	public void setInvoices(Invoice newInvoices) {
	    this.invoices = newInvoices;
	}

	/**
	 * Returns quantity.
	 * @return quantity 
	 */
	public int getQuantity() {
		return this.quantity;
	}
	
	/**
	 * Sets a value to attribute quantity. 
	 * @param newQuantity 
	 */
	public void setQuantity(int newQuantity) {
	    this.quantity = newQuantity;
	}

	/**
	 * Returns invoiceLineAmount.
	 * @return invoiceLineAmount 
	 */
	public EDouble getInvoiceLineAmount() {
		return this.invoiceLineAmount;
	}
	
	/**
	 * Sets a value to attribute invoiceLineAmount. 
	 * @param newInvoiceLineAmount 
	 */
	public void setInvoiceLineAmount(EDouble newInvoiceLineAmount) {
	    this.invoiceLineAmount = newInvoiceLineAmount;
	}

	/**
	 * Returns number.
	 * @return number 
	 */
	public int getNumber() {
		return this.number;
	}
	
	/**
	 * Sets a value to attribute number. 
	 * @param newNumber 
	 */
	public void setNumber(int newNumber) {
	    this.number = newNumber;
	}

	/**
	 * Returns products.
	 * @return products 
	 */
	public Product getProducts() {
		return this.products;
	}
	
	/**
	 * Sets a value to attribute products. 
	 * @param newProducts 
	 */
	public void setProducts(Product newProducts) {
	    this.products = newProducts;
	}



}
