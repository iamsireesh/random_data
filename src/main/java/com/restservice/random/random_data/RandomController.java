package com.restservice.random.random_data;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomController {

	@GetMapping("/data/{count}")
	public List<FakeData> getdata(@PathVariable(required = true) int count) {
		return new FakeData().getFakeRecords(count);
	}
}
