import com.intuit.Company;
import com.intuit.Door;
import com.intuit.DoorFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DoorMain {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:beans.xml");
        Company comp = context.getBean("company",Company.class);
        System.out.println(comp.getHq());
        System.out.println(comp.getSize());
//        Door door = context.getBean("door2",Door.class);
//        door.open();
//        door.close();
//        Door door = DoorFactory.getDoorWithSoundAlarm();
//        door.open();
//        door.close();
    }
}
