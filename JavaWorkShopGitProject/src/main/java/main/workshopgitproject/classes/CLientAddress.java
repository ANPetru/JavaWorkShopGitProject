package main.workshopgitproject.classes;

public class CLientAddress {
	/**
	 * Description of the property streetName.
	 */
	private String streetName;
	/**
	 * Description of the property village.
	 */
	private String village;
	/**
	 * Description of the property country.
	 */
	private String country;
	/**
	 * Description of the property streetNumber.
	 */
	private Integer streetNumber;
	/**
	 * Description of the property province.
	 */
	private String province;

	public CLientAddress(String streetName, String village, String country, Integer streetNumber, String province) {
		this.streetName = streetName;
		this.village = village;
		this.country = country;
		this.streetNumber = streetNumber;
		this.province = province;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(Integer streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}
}