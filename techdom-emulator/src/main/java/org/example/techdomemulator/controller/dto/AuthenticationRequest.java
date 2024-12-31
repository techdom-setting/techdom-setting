package org.example.techdomemulator.controller.dto;

public record AuthenticationRequest(
	String mdn,
	String tid,
	String mid,
	String pv,
	String did,
	String dFWVer
) {
}
