import org.flagAutoWired.Home;
import org.flagEditor.CustomAddress;
import org.springframework.AService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Field;

public class Test {
	public static void main(String[] args) throws Exception {
		System.out.println("你好");
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("tx.xml");
		MyClassApplicationContext applicationContext = new MyClassApplicationContext("tx.xml");
		System.out.println(applicationContext);
		Home bean = applicationContext.getBean(Home.class);
		System.out.println(bean);
	}
}
