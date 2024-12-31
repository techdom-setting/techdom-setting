package org.example.techdomemulator.controller.dto;

public record AuthenticationResponse(
	String rstCd,
	String rstMsg,
	String mdn,
	String token,
	String exPeriod
) {
}
