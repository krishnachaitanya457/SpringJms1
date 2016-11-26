package com.comapany.business;

import javax.jms.JMSException;

import org.apache.activemq.command.ActiveMQTextMessage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

public class Mainapp {

	public static void main(String[] args) throws JMSException {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		JmsTemplate jmsTemplate=(JmsTemplate)applicationContext.getBean("jmsTemplate");
		ActiveMQTextMessage activeMQTextMessage=(ActiveMQTextMessage)jmsTemplate.receive();
		String msg=activeMQTextMessage.getText();
		System.out.println(msg);
	}
}
