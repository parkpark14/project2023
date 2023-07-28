package com.example.test3.batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

public class PersonItemProcessor implements ItemProcessor<Person, Person>{

    private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

    @Override
    @Nullable
    public Person process(final Person person) throws Exception {
        // throw new UnsupportedOperationException("Unimplemented method 'process'");

        final String firstName = person.getFirstName().toUpperCase();
        final String lastName = person.getLastName().toUpperCase();

        final Person transformedPerson = Person.builder()
            .firstName(firstName)
            .lastName(lastName)
            .build();

        log.info("Converting (" + person + ") into (" + transformedPerson + ")");
        
        return transformedPerson;
    }
    
}
