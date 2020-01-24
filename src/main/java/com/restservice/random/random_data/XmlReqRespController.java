package com.restservice.random.random_data;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class XmlReqRespController {

	@PostMapping(path = "/read-cust-info", produces = MediaType.APPLICATION_XML_VALUE)
	public Customer customerInformation(@RequestBody Customer cust) {

		return cust;
	}
}
