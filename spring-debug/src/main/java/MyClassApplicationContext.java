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
		super.setAllowBeanDefinitionOverriding(false);
		super.setAllowCircularReferences(false);
		super.customizeBeanFactory(beanFactory);
	}
}
