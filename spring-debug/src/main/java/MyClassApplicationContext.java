import org.flagAware.MyAware;
import org.flagBeanDefinitionRegistryPostProcessor.MyBeanDefinitionRegistryPostProcess;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClassApplicationContext extends ClassPathXmlApplicationContext {

	public MyClassApplicationContext(String... configLocations) {
		super(configLocations);
	}

	@Override
	protected void initPropertySources() {
		System.out.println("加载资源");
//		getEnvironment().getPropertySources().addLast();
		getEnvironment().getRequiredProperty("username");
	}

	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
//		beanFactory.addBeanPostProcessor(new MyAware());
		// BeanFactoryPostProcessor注册 第二种方式
		super.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());
		super.addBeanFactoryPostProcessor(new MyBeanDefinitionRegistryPostProcess());
		super.setAllowBeanDefinitionOverriding(false);
		super.setAllowCircularReferences(false);
		super.customizeBeanFactory(beanFactory);
	}

	@Override
	protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
		System.out.println("扩展实现postProcessBeanFactory");
		beanFactory.addBeanPostProcessor(new MyAware());
		super.postProcessBeanFactory(beanFactory);
	}
}
