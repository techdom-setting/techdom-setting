package org.example.techdomcollector;

import org.example.techdomcommon.Authentication;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/authentication")
public class CollectorController {

	public void hello(){
		new Authentication();
		System.out.printf("ci test 위해 일부러 작업 변경중!");
		System.out.println("dd");
	}
}
