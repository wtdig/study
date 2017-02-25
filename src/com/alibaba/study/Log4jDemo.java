package com.alibaba.study;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Log4jDemo {
	// 获取logger日志对象
	static Logger logger = Logger.getLogger(Log4jDemo.class);

	public static void main(String[] args) {
		// 默认加载的配置项
		//BasicConfigurator.configure();
		//设置日志级别
		//logger.setLevel(Level.ERROR);
		logger.trace("trace");
		logger.debug("debug");
		logger.info("info");
		logger.warn("warn");
		logger.error("error");
		logger.fatal("fatal");
	}
	
	//打印logger日志的方法
	public void loggerStudy(){
		logger.info("这是info");
		logger.debug("这是debug");
		System.out.println("打印日志");
	}
}
