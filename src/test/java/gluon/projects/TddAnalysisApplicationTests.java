package gluon.projects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.assertj.ApplicationContextAssertProvider;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.AUTO_CONFIGURED)
class TddAnalysisApplicationTests {

	@Test
	void contextLoads(ApplicationContext context) {
		Assertions.assertNotNull(context);
		/*
		String[] beanNames = context.getBeanDefinitionNames();
		Arrays.stream(beanNames).filter(x -> !x.contains("org.springframework")).forEach(System.out::println);
		 */
	}

}
