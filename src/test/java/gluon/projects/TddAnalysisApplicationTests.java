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

	@Autowired
	EtudiantService etudiantService;

	@Test
	void whenRequestMean_thenReturnAllEtudiantMean(){
		Map<String, Float> etudiantMean = etudiantService.getEveryOneMean();
		assertNotNull(etudiantMean);
		assertEquals(49, etudiantMean.size());
		System.out.println("----------------------------------------------------------------");
		for(Map.Entry<String, Float> etudiantMeanValue: etudiantMean.entrySet()){
			System.out.println(etudiantMeanValue.getKey() + " ---- " + etudiantMeanValue.getValue());
		}
		System.out.println("----------------------------------------------------------------");
	}

	@Test
	void contextLoads(ApplicationContext context) {
		assertNotNull(context);
		/*
		String[] beanNames = context.getBeanDefinitionNames();
		Arrays.stream(beanNames).filter(x -> !x.contains("org.springframework")).forEach(System.out::println);
		 */
	}

}
