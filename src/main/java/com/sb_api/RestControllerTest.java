package com.sb_api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestControllerTest {
	@GetMapping("/name")
	public String getName() {
		return "My first app is on Git";
	}

}
