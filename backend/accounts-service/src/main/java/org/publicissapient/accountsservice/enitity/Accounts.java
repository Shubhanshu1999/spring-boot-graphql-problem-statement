package org.publicissapient.accountsservice.enitity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Accounts {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "Account holder", nullable = false)
	private String accountHolder;

	public Accounts(String name) {
		this.accountHolder=accountHolder;
	}
}
