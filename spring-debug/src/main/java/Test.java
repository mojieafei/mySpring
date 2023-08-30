import org.flagEditor.CustomAddress;
import org.springframework.AService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Field;

public class Test {
	public static void main(String[] args) throws Exception {
		Class<?> aClass = Class.forName("org.flagtag.User");
		Object o = aClass.newInstance();
		Field[] fields = aClass.getFields();
		Field userName = aClass.getField("userName");
		userName.set(o,"zhangsan");
		System.out.println(o);
		System.out.println("Miho");
		System.out.println("你好");
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("tx.xml");
		MyClassApplicationContext applicationContext = new MyClassApplicationContext("editor.xml");
		System.out.println(applicationContext);
		CustomAddress bean = applicationContext.getBean(CustomAddress.class);
		System.out.println(bean);
	}
}
