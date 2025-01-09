package org.example.techdomemulator.controller;

import org.example.techdomemulator.service.EmulatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/authentication")
@RequiredArgsConstructor
public class EmulatorController {
	private final EmulatorService emulatorService;

	@GetMapping
	public String authenticate() {
		System.out.printf("ci test 위해 일부러 작업 변경중!!!!!!!");
		return emulatorService.authenticate();
	}
}
