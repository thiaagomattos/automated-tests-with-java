package br.com.erudio;

import br.com.erudio.service.IPersonService;

public class PersonService implements IPersonService {

    @Override
    public Person createPerson(Person person) {
        return person;
    }

}
