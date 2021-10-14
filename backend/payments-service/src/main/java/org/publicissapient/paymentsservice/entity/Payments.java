package org.publicissapient.paymentsservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Payments {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="paidBy", nullable=false)
	private String paidBy;
	
	@Column(name="Amount",nullable=false)
	private int amount;
	
	public Payments(String paidBy,int amount) {
		this.paidBy=paidBy;
		this.amount=amount;
	}
}
