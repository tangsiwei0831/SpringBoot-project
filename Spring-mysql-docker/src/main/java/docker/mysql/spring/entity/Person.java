package docker.mysql.spring.entity;

import jakarta.persistence.*;

@Entity
@Table(name="person")
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@Column
	private String name;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(int id, String name) {
		super();
		Id = id;
		this.name = name;
	}

	public Person() {
		super();
	}
	
	
	

}
