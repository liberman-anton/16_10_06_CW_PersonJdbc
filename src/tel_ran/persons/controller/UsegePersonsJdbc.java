package tel_ran.persons.controller;

import tel_ran.persons.dao.PersonsJdbc;
import tel_ran.persons.entities.Person;
//import static tel_ran.persons.controller.interfaces.PersonsRandomJdbcConstants.*;

public class UsegePersonsJdbc {

	public static void main(String[] args) throws Exception {
		PersonsJdbc personsJdbc = new PersonsJdbc();
		Iterable<Person> personsAge = personsJdbc.getPersonsByAge(20, 30);
		displayPersons(personsAge);
		System.out.println();
		System.out.println(personsJdbc.getPerson(1554907));
		System.out.println();
		displayPersons(personsJdbc.getPersonsByName("name7"));
	}

	private static void displayPersons(Iterable<Person> persons) {
		for(Person person : persons){
			System.out.println(person);
		}
		
	}

}
