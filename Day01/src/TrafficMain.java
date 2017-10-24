import com.traffic.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@Configuration
@ComponentScan(basePackages = "com.traffic")
public class TrafficMain {
    public static void main(String[] args) {
//        ApplicationContext context =
//                new FileSystemXmlApplicationContext("classpath:com/traffic/traffic.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(TrafficMain.class);
        Person person = context.getBean("person",Person.class);
        System.out.println(person.getName());
        System.out.println(person.getCar().getModel());
        System.out.println(person.getStock());


        Person person2 = context.getBean("person",Person.class);
        System.out.println(person2);
    }
}
