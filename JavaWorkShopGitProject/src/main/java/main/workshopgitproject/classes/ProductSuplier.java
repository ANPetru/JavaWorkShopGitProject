package main.workshopgitproject.classes;

public class ProductSuplier {
	/**
	 * Description of the property suplierID.
	 */
	private String suplierID;
	/**
	 * Description of the property suplierName.
	 */
	private String suplierName;

	public ProductSuplier(String suplierID, String suplierName) {
		this.suplierID = suplierID;
		this.suplierName = suplierName;
	}

	public String getSuplierID() {
		return suplierID;
	}

	public void setSuplierID(String suplierID) {
		this.suplierID = suplierID;
	}

	public String getSuplierName() {
		return suplierName;
	}

	public void setSuplierName(String suplierName) {
		this.suplierName = suplierName;
	}
}