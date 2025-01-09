package org.example.techdomcollector;

import org.example.techdomcommon.Authentication;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/authentication")
public class CollectorController {

	public void hello(){
		new Authentication();
		System.out.println("ㅇㅇㅇ");
		System.out.println("dd");
	}
}
