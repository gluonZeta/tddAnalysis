package gluon.projects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class GluonCommandLineRunner implements CommandLineRunner {

    Logger logger = LoggerFactory.getLogger(GluonCommandLineRunner.class);

    @Override
    public void run(String... args) throws Exception {
        logger.info("Test Driven Devy");
    }
}
