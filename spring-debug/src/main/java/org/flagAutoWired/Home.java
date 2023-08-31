package org.flagAutoWired;

import org.flagtag.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Home {

	@Autowired
	private User user;


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Home{" +
				"user=" + user +
				'}';
	}
}
