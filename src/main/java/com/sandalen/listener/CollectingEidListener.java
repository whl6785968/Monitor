package com.sandalen.listener;

import java.io.BufferedOutputStream;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;


public class CollectingEidListener implements MessageListener {

	@Override
	public void onMessage(Message message) {
		// TODO Auto-generated method stub
		try {
		TextMessage textMessage = null;
		String record = null;
		String uid = null;
		System.out.println("监听者启动！！！");
		if(message instanceof TextMessage)
		{
			textMessage = (TextMessage) message;
			record = textMessage.getText();
			uid = record.split("-")[0];
			System.out.println("我已经监听到了"+record+"======================");
			FileWriter fw = new FileWriter("C:\\Users\\dell\\Desktop\\java\\collect_of_monitorData\\"+uid+".txt",true);
			FileWriter cf = new FileWriter("C:\\Users\\dell\\Desktop\\java\\collect_of_monitorData\\cf.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);
			BufferedWriter bcf = new BufferedWriter(cf);
			bw.write(record);
			bw.write("\r\n");
			bw.close();
			fw.close();
			bcf.write(record);
			bcf.write("\r\n");
			bcf.close();
			cf.close();
		}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
