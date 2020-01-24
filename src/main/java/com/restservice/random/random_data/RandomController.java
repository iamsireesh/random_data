package com.restservice.random.random_data;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomController {

	@GetMapping(path = "/data/{count}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<FakeData> getdata(@PathVariable(required = true) int count) {
		return new FakeData().getFakeRecords(count);
	}
}
