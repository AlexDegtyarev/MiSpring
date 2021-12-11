package geekbrains.lesson1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HospitalApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext ("config.xml");
        Registry reg = context.getBean("registry", Registry.class);
        reg.searchCardAndRef();
    }
}
