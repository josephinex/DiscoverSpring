import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {
    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Knight knight = applicationContext.getBean("knight", BraveKnight.class);
        knight.embarkOnQuest();
    }
}
