package com.example.todo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity 
@Table(name = " todo1")
public class todoModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private String work ;
	
	public todoModel(Long id, String work) {
		super();
		this.id = id;
		this.work = work;
	}
	

	public todoModel() {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getWork() {
		return work;
	}


	public void setWork(String work) {
		this.work = work;
	}
	
	


}

