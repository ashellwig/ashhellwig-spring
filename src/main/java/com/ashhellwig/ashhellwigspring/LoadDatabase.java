package com.ashhellwig.ashhellwigspring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(ExperienceRepository repository) {
        return args -> log.info("Preloading: {}", repository.save(new Experience("IBM",
                "Global Technology Services: Solutions, Del, & Transf.", "2017-07-01", "2018-03-01",
                "Level 1.5 CTS Agent, administrator rights to remote into State Street virtual desktops and physical machines after initial troubleshooting as failed on other teams. Mainly services the U.S. and India. Support Active Directory and configuration of multiple server types. Support IBM mainframe z/OS systems. Write troubleshooting and DevOps documentation and SLA status templates. Deploy and maintain Windows 10 and Ent. Server 2012-16 Deploy Microsoft Office 365 via local source and configuration manager. Development of applications for z/OS utilizing various databases")));
    }
}