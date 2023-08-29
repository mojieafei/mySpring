package org.flagtag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class UserNameSpaceHandler extends NamespaceHandlerSupport {
		@Override
		public void init() {
			registerBeanDefinitionParser("user", new UserSingleBeanDefinitionParser());
		}
	}


