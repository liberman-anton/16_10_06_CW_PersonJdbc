package tel_ran.persons.controller;

import tel_ran.persons.dao.PersonsJdbc;
import static tel_ran.persons.controller.interfaces.PersonsRandomJdbcConstants.*;
import tel_ran.persons.entities.Person;

import java.util.*;
public class RandomPersonsCreation {

	public static void main(String[] args) throws Exception {
		PersonsJdbc personsJdbc = new PersonsJdbc();
		List<Person> persons = createRandomPersons();
		for(Person person : persons){
			personsJdbc.addPerson(person);
		}
	}

	private static List<Person> createRandomPersons() {
		List<Person> res = new ArrayList<>();
		
		for(int i = 0; i < N_PERSONS; i++){
			res.add(createOneRandomPerson());
		}
		return res;
	}

	private static Person createOneRandomPerson() {
		int id = getRandomNumber(MIN_ID,MAX_ID);
		int birthYear = getRandomNumber(MIN_BIRTH_YEAR,MAX_BIRTH_YEAR);
		String name = "name" +  getRandomNumber(0,N_NAMES);
		
		return new Person(id,birthYear,name);
	}

	private static int getRandomNumber(int min, int max) {
		
		return (int) (Math.random() * (max - min + 1) + min);
	}

}
