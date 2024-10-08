package br.com.erudio;

import java.util.concurrent.atomic.AtomicLong;

import br.com.erudio.service.IPersonService;

public class PersonService implements IPersonService {

    @Override
    public Person createPerson(Person person) {
    	
    	if (person.getEmail() == null || person.getEmail().isBlank()) {
    		throw new IllegalArgumentException("The Person e-Mail is null or empty!");
    	}
    	var id = new AtomicLong().incrementAndGet();
    	person.setId(id);
        return person;
    }

}
