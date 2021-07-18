package com.restful.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestfulController {
	@RequestMapping(method=RequestMethod.GET, path = "/")
	public String restful() {
		return "restful";
	}
	@GetMapping(path = "/api")
	public RestfulBean restfulBean() {
		return new RestfulBean("restful");
	}
	@GetMapping(path = "/api/path/{data}")
	public RestfulBean restfulBeanPV(@PathVariable String data) {
		return new RestfulBean(String.format("Data: %s", data));
	}
}
