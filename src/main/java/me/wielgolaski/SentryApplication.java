package me.wielgolaski;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SentryApplication {

    private final static Logger logger = LoggerFactory.getLogger(SentryApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SentryApplication.class, args);
    }

    @RequestMapping(method = RequestMethod.GET)
    public String generateErrors() {
        logException(new NullPointerException("NPE"));
        logException(new IllegalArgumentException("Illegal"));
        return "Exceptions generated";
    }

    private void logException(Exception ex) {
        logger.error("Logger message for " + ex.getClass().getSimpleName(), ex);
    }
}
