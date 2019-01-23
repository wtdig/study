package com.alibab.study.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.alibaba.study.Log4jDemo;

public class LoggerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("֮ǰ");
		System.out.println("new branch");
	}

	@Test
	public void testLoggerStudy() {
		//fail("Not yet implemented");
		Log4jDemo ld = new Log4jDemo();
		ld.loggerStudy();
	}

}
