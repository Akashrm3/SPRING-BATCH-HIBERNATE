package com.learning.springbatch.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Registration {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Long age;
    private String email;

    public Registration() {
    }

    public Registration(Long id,String name,Long age,String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
	public String toString() {
		return "Registration [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + "]";
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    
    
}