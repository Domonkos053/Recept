package com.example.demo;

import com.example.demo.gyakorlas.Auto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		Auto SuzukiSwift = new Auto();
		SuzukiSwift.setSzin("piros");
		SuzukiSwift.setMárka("Suzuki");
		SuzukiSwift.setLoero(93);

		Auto FordMondeo = new Auto();
		FordMondeo.setSzin("szürke");
		FordMondeo.setMárka("Ford");
		FordMondeo.setLoero(170);
System.out.println(SuzukiSwift.kiir());
		System.out.println(FordMondeo.kiir());
	}

}
