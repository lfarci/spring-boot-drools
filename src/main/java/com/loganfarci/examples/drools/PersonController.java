package com.loganfarci.examples.drools;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/persons")
public class PersonController {

    private KieContainer kieContainer;

    public PersonController(KieContainer kieContainer)
    {
        this.kieContainer = kieContainer;
    }
    
    @PostMapping("")
    public Person getClearance(@RequestBody Person person) {
        try {
            KieSession session = kieContainer.newKieSession();
            session.insert(person);
            session.fireAllRules();
            return person;
        } catch (RuntimeException e) {
            e.printStackTrace();
            return null;
        }
    }


}
