package com.coderby.myapp.hello.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService implements IHelloService {

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		String result =  "Hello ~" + name;
		return result;
	}


}
