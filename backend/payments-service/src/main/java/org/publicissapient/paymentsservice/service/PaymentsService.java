package org.publicissapient.paymentsservice.service;

import java.util.List;
import java.util.Optional;

import org.publicissapient.paymentsservice.entity.Payments;
import org.publicissapient.paymentsservice.repository.PaymentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class PaymentsService {
	@Autowired
	private PaymentsRepository paymentsRepository;
	
	@Transactional
	public Payments createPayments(String paidBy,int amount) {
		Payments payments=new Payments(paidBy,amount);
		return paymentsRepository.save(payments);
	}
	
	@Transactional(readOnly=true)
	public List<Payments> getPaymentss(){
		return paymentsRepository.findAll();
	}
	
	@Transactional(readOnly=true)
	public Payments getPayments(Integer id) {
		Optional<Payments> payments=paymentsRepository.findById(id);
		return payments.orElseThrow();
	}
}
