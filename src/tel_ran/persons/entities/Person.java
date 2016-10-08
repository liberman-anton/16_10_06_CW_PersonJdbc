package tel_ran.persons.entities;

public class Person {
	private int id;
	private int birthYear;
	private String name;
	public int getId() {
		return id;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public String getName() {
		return name;
	}
	public Person(int id, int birthYear, String name) {
		super();
		this.id = id;
		this.birthYear = birthYear;
		this.name = name;
	}
	public Person(){}
	@Override
	public String toString() {
		return "Person [id=" + id + ", birthYear=" + birthYear + ", name=" + name + "]";
	}
	
}
