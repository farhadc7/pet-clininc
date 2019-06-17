package petclinic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.bind.annotation.XmlType;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = PetClinicApplicationTests.class)
public class PetClinicApplicationTests {

	@Test
	public void contextLoads() {
	}

}
