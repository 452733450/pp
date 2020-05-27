package com.pp.pp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PpApplication {
    private static final Logger logger = LoggerFactory.getLogger(PpApplication.class);

    public static void main(String[] args) {
        logger.info("test");
        SpringApplication.run(PpApplication.class, args);
    }

}
