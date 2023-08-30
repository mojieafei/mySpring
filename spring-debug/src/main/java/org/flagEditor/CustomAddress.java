package org.flagEditor;

public class CustomAddress {
	private String name;
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "CustomAddress{" +
				"name='" + name + '\'' +
				", address=" + address +
				'}';
	}
}
