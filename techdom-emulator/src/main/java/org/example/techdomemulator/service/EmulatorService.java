package org.example.techdomemulator.service;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmulatorService {

	private final RestTemplate restTemplate;

	public String authenticate(){
		String url = "https://jsonplaceholder.typicode.com/posts/1";
		return restTemplate.getForObject(url, String.class);
	}

	@Scheduled(fixedRate = 1000)
	public void run(){
		System.out.println(LocalDateTime.now() + "Hello World!");
	}
}
