package com.bitstobytes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("kafka")
public class KafkaController {

	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	static final String producer="DEMO_PRODUCER_TOPIC";
	
	
	@GetMapping("sendKakfaMessage")
	public String sendMessage() {
		kafkaTemplate.send(producer,"Message received");
		
		return "test";
	}

	@KafkaListener(topics = producer)
	public String consumeMessage(String message) {
		System.out.println(" Message received : "+message);
		
		return "test";
	}
}
