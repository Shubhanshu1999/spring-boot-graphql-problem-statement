package org.publicissapient.trip.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Trip {
	@Id
	@Column(name = "id", nullable = false)
	private String id;
	@Column(name = "description", nullable = false)
	private String description;
	@Column(name = "duration", nullable = false)
	private Integer numberOfDays;

	public Trip() {
	}

	public Trip(String description, Integer numberOfDays) {
		this.description = description;
		this.numberOfDays = numberOfDays;
	}

}
