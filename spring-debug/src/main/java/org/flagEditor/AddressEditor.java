package org.flagEditor;

import java.beans.PropertyEditorSupport;

public class AddressEditor extends PropertyEditorSupport {

	public AddressEditor() {
	}

	public AddressEditor(Object source) {
		super(source);
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] s = text.split("_");
		Address address = new Address();
		address.setProvince(s[0]);
		address.setCity(s[1]);
		address.setStreet(s[2]);
		this.setValue(address);
	}
}
