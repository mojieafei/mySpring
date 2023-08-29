import org.springframework.AService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		System.out.println("Miho");
		System.out.println("你好");
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("tx.xml");
		MyClassApplicationContext applicationContext = new MyClassApplicationContext("tx.xml");
		System.out.println(applicationContext);
		AService bean = applicationContext.getBean(AService.class);
		System.out.println(bean.getName());
	}
}
