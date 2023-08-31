package org.flagBeanDefinitionRegistryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.PriorityOrdered;

public class MyBeanDefinitionRegistryPostProcess implements BeanDefinitionRegistryPostProcessor , PriorityOrdered, ApplicationContextAware {

	private ClassPathXmlApplicationContext applicationContext;

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("invoke postProcessBeanFactory --- MyBeanDefinitionRegistryPostProcess");
		// 此方法 不开放新增BeanDefinition的功能！！
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("invoke postProcessBeanDefinitionRegistry --- MyBeanDefinitionRegistryPostProcess");
		// 方式1
//		registry.registerBeanDefinition("MyBeanDefinitionRegistryPostProcess1", new RootBeanDefinition(MyBeanDefinitionRegistryPostProcess1.class));
		// 方式2
		BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(MyBeanDefinitionRegistryPostProcess1.class);
		registry.registerBeanDefinition("MyBeanDefinitionRegistryPostProcess1", builder.getBeanDefinition());
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
