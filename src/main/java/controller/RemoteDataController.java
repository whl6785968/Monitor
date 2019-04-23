package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Dt;
import model.TestData;

@Controller
public class RemoteDataController {
	@RequestMapping("/showRemoteDataRecieve")
	public String showRemoteDataRecieve()
	{
		return "remoteDataReceive";
	}
	
	@ResponseBody
	@RequestMapping("/startPort")
	public List<TestData> startPort(HttpServletRequest request) throws Exception
	{
		System.out.println("开启端口");
		List<TestData> list = new ArrayList<TestData>();
		ServerSocket ss = new ServerSocket(10086);
		Socket socket = ss.accept();
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String line = null;
		while((line = br.readLine())!=null)
		{
			String[] strs = line.split(",");
//			TestData td = new TestData(strs[0],strs[1],Integer.parseInt(strs[2]));
			TestData td = new TestData();
			td.setId(strs[0]);
			td.setPrice(strs[1]);
			td.setNum(Integer.parseInt(strs[2]));
			list.add(td);
			
		}
		request.getSession().setAttribute("remote", list);
		br.close();
		isr.close();
		is.close();
		socket.close();
		ss.close();
		
		return list;
	}
}
