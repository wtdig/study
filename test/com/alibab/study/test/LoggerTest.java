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
		System.out.println("new branch local");
		System.out.println("new branch romote");
		System.out.println("new branch 123456 lcoal update");
		System.out.println("new branch 123456 romote update");
	}

	@Test
	public void testLoggerStudy() {
		//fail("Not yet implemented");
		Log4jDemo ld = new Log4jDemo();
		ld.loggerStudy();
	}

}
