import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= CdPlayerConfig.class)

public class CdPlayerTest {
    @Autowired
    private CompactDisk cd;

    @Test
    public void cdShouldNotBeNull(){
        TestCase.assertNotNull(cd);
    }
}
