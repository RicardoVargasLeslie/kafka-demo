package com.imricki.mesage.kafkademo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.imricki.mesage.kafkademo.producer.Producer;

@RestController
public class DemoController {

	@Autowired
	private Producer messageProducer;
	
	@PostMapping("/publish")
	public void messageToTopic(@RequestParam("message") String message) {
		
		this.messageProducer.send(message);
	}
}
