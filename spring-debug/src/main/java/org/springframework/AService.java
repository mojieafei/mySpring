package org.springframework;

public class AService {

	private String name;

	public AService() {
	}

	public AService(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
