package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private int age;
	private String startingYear;
	
	public Student() {
	}
	
	public Student(String name, int age, String startingYear) {
		this.name = name;
		this.age = age;
		this.startingYear = startingYear;
	}
	
	public Student(long id, String name, int age, String startingYear) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.startingYear = startingYear;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStartingYear() {
		return startingYear;
	}

	public void setStartingYear(String startingYear) {
		this.startingYear = startingYear;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", age=" + age + ", startingYear=" + startingYear + "]";
	}

}
