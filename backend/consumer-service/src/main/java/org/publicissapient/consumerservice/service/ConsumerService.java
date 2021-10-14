package org.publicissapient.consumerservice.service;

import java.util.List;
import java.util.Optional;

import org.publicissapient.consumerservice.enitity.Consumer;
import org.publicissapient.consumerservice.repository.ConsumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ConsumerService {
	@Autowired
	private ConsumerRepository consumerRepository;
	
	@Transactional
	public Consumer createConsumer(String name) {
		Consumer consumer=new Consumer(name);
		return consumerRepository.save(consumer);
	}
	
	@Transactional(readOnly=true)
	public List<Consumer> getConsumers(){
		return consumerRepository.findAll();
	}
	
	@Transactional(readOnly=true)
	public Consumer getConsumer(Integer id) {
		Optional<Consumer> Consumer=consumerRepository.findById(id);
		return Consumer.orElseThrow();
	}
}
