package com.imricki.mesage.kafkademo.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	
	@KafkaListener(topics = "topic",groupId = "group_id")
	public void consumeMessage(String message) {
		
		System.out.println("Message been consumed "+ message);
	}
}
