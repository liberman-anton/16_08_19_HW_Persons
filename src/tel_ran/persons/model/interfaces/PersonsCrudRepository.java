package tel_ran.persons.model.interfaces;

import java.util.function.Predicate;

import tel_ran.persons.model.entities.Address;
import tel_ran.persons.model.entities.Person;

public interface PersonsCrudRepository extends Iterable<Person> {
	boolean addPerson(Person person);
	Person removePerson(int id);
	Person getPerson(int id);
	Iterable<Person> getPersonsBySalary(int minSalary, int maxSalary);
	Iterable<Person> getPersonsByAddress(Address address); 
	Iterable<Person> getPersonsByBirthYear(int fromYear, int toYear);
	Iterable<Person> getPersons(Predicate<Person> predicate);
	boolean updateSalary(int id, int newSalary);
	boolean updateAddress(int id, Address newAddress);
	
}
