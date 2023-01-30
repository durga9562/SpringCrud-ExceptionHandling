package com.ojas.entities;

import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@javax.persistence.Entity

@Table(name="travel")
public class TravelEntity {
	@Id
	@javax.persistence.GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int seats;

	public int getId() {
		return id;
	}

	public TravelEntity(int id, String name, int seats) {
		super();
		this.id = id;
		this.name = name;
		this.seats = seats;
	}

	public TravelEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

}
