package gluon.projects;

import gluon.projects.service.servicemetiers.EtudiantService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.AUTO_CONFIGURED)
class TddAnalysisApplicationTests {

	@Test
	void contextLoads(ApplicationContext context) {
		assertNotNull(context);
		/*
		String[] beanNames = context.getBeanDefinitionNames();
		Arrays.stream(beanNames).filter(x -> !x.contains("org.springframework")).forEach(System.out::println);
		 */
	}

}
