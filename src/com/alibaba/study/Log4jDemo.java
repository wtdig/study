package com.alibaba.study;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Log4jDemo {
	// ��ȡlogger��־����
	static Logger logger = Logger.getLogger(Log4jDemo.class);

	public static void main(String[] args) {
		// Ĭ�ϼ��ص�������
		//BasicConfigurator.configure();
		//������־����
		//logger.setLevel(Level.ERROR);
		logger.trace("trace");
		logger.debug("debug");
		logger.info("info");
		logger.warn("warn");
		logger.error("error");
		logger.fatal("fatal");
	}
	
	//��ӡlogger��־�ķ���
	public void loggerStudy(){
		logger.info("����info");
		logger.debug("����debug");
		System.out.println("��ӡ��־1234");
		System.out.println("��ӡ��־devops");
	}
}
