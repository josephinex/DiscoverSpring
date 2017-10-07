import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        Candidate candidate = new Candidate();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext");
        VotingBooth votingBooth = applicationContext.getBean("votingBooth", VotingBooth.class);
        votingBooth.vote(candidate);
    }
}
