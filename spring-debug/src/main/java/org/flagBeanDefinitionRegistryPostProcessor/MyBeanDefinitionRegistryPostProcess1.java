package org.flagBeanDefinitionRegistryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.PriorityOrdered;

public class MyBeanDefinitionRegistryPostProcess1 implements BeanDefinitionRegistryPostProcessor , Ordered, ApplicationContextAware {

	private ClassPathXmlApplicationContext applicationContext;

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("invoke postProcessBeanFactory --- MyBeanDefinitionRegistryPostProcess1");
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("invoke postProcessBeanDefinitionRegistry --- MyBeanDefinitionRegistryPostProcess1");
	}

	@Override
	public int getOrder() {
		return 0;
	}


	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = (ClassPathXmlApplicationContext) applicationContext;
	}
}
