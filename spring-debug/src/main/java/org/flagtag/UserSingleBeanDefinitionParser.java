package org.flagtag;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.w3c.dom.Element;

public class UserSingleBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
	@Override
	protected Class<?> getBeanClass(Element element) {
		return User.class;
	}

	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		if(element.hasAttribute("userName")){
			builder.addPropertyValue("userName",element.getAttribute("userName"));
		}
		if(element.hasAttribute("email")){
			builder.addPropertyValue("email",element.getAttribute("email"));
		}
		if(element.hasAttribute("phone")){
			builder.addPropertyValue("phone",element.getAttribute("phone"));
		}
	}
}
