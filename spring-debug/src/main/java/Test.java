public class Test {
	public static void main(String[] args) {
		System.out.println("Miho");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("tx.xml");
	}
}
