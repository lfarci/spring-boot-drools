package com.loganfarci.examples.drools;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DroolsConfiguration {

    @Bean
    private static KieContainer kieContainer() {
        KieServices services = KieServices.Factory.get();
        return services.getKieClasspathContainer();
    }
    
}
