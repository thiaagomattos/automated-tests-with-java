package br.com.erudio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.erudio.service.IPersonService;

public class PersonServiceTest {

    IPersonService service;
    Person person;
    
    @BeforeEach
    void setup() {
    	service = new PersonService();
        person = new Person(
        		1L,
                "Keith",
                "Moon",
                "kmoon@erudio.com.br",
                "Wembley - UK",
                "Male"
            );
    }
    
    @DisplayName("When Create a Person with Success Should Contains Valid Fields in Returned Person Object")
    @Test
    void testCreatePerson_WhenSucess_ShouldContainsValidFieldsInReturnedPersonObject() {
        
        // Given / Arrange
        
        // When / Act
        Person actual = service.createPerson(person);
        
        // Then / Assert
        assertNotNull(person.getId(), () -> "Person ID is Missing");
        assertEquals(person.getFirstName(), actual.getFirstName(), () -> "The FistName is Incorrect!");
    	assertEquals(person.getLastName(), actual.getLastName(), () -> "The LastName is Incorrect!");
    	assertEquals(person.getAddress(), actual.getAddress(), () -> "The Address is Incorrect!");
    	assertEquals(person.getGender(), actual.getGender(), () -> "The Gender is Incorrect!");
    	assertEquals(person.getEmail(), actual.getEmail(), () -> "The Email is Incorrect!");

    }
    
    /**@DisplayName("When Create a Person with Success Should Contains FirstName in Returned Person Object")
    @Test
    void testCreatePerson_WhenSucess_ShouldContainsFirstNameInReturnedPersonObject() {
        
        // Given / Arrange
        IPersonService service = new PersonService();
        
        // When / Act
        Person actual = service.createPerson(person);
        
        // Then / Assert
        assertEquals(person.getFirstName(), actual.getFirstName(), () -> "The FistName is Different!");
    }
    
    @DisplayName("When Create a Person with Success Should Contains LastName in Returned Person Object")
    @Test
    void testCreatePerson_WhenSucess_ShouldContainsLastNameInReturnedPersonObject() {
    	
    	// Given / Arrange
    	IPersonService service = new PersonService();
    	
    	// When / Act
    	Person actual = service.createPerson(person);
    	
    	// Then / Assert
    	assertEquals(person.getLastName(), actual.getLastName(), () -> "The LastName is Different!");
    }
    
    
    
    @DisplayName("When Create a Person with Success Should Contains Address in Returned Person Object")
    @Test
    void testCreatePerson_WhenSucess_ShouldContainsAddressInReturnedPersonObject() {
    	
    	// Given / Arrange
    	IPersonService service = new PersonService();
    	
    	// When / Act
    	Person actual = service.createPerson(person);
    	
    	// Then / Assert
    	assertEquals(person.getAddress(), actual.getAddress(), () -> "The Address is Different!");
    }
    
    @DisplayName("When Create a Person with Success Should Contains Gender in Returned Person Object")
    @Test
    void testCreatePerson_WhenSucess_ShouldContainsGenderInReturnedPersonObject() {
    	
    	// Given / Arrange
    	IPersonService service = new PersonService();
    	
    	// When / Act
    	Person actual = service.createPerson(person);
    	
    	// Then / Assert
    	assertEquals(person.getGender(), actual.getGender(), () -> "The Gender is Different!");
    }
    
    @DisplayName("When Create a Person with Success Should Contains Email in Returned Person Object")
    @Test
    void testCreatePerson_WhenSucess_ShouldContainsEmailInReturnedPersonObject() {
    	
    	// Given / Arrange
    	IPersonService service = new PersonService();
    	
    	// When / Act
    	Person actual = service.createPerson(person);
    	
    	// Then / Assert
    	assertEquals(person.getEmail(), actual.getEmail(), () -> "The Email is Different!");
    }*/
    
    @DisplayName("When Create a Person with null e-Mail Should throw Exception")
    @Test
    void testCreatePerson_WithNullEMail_ShouldThrowIllegalArgumentException() {
        // Given / Arrange
        person.setEmail(null);
        
        var expectedMessage = "The Person e-Mail is null or empty!";
        // When / Act
        // Then / Assert
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> service.createPerson(person),
            () -> "Empty e-Mail should have cause an IllegalArgumentException!");
        
        // Then / Assert
        assertEquals(expectedMessage, exception.getMessage(),
        		() -> "Exception error message is incorrect!");
            
        ;
    }
}