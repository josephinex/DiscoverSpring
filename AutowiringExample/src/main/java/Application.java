import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        CompactDisk compactDisk = new SgtPeppers();
        compactDisk.play();
    }
}
