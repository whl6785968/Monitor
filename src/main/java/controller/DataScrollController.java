package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Muser;
import model.MuserExample;
import service.MuserService;

@Controller
public class DataScrollController {
	@Autowired
	private MuserService ms;
	
 	@RequestMapping("/dataScroll")
	public String showDataScroll(HttpServletRequest request)
	{
		return "dynamicScroll";
	}
	
	@ResponseBody
	@RequestMapping("/getScrollData")
	public List<Muser> getScrollData(String mark,final HttpServletRequest request)
	{
		
		
		tThread thread = new tThread(mark, request,true);
		FutureTask task = new FutureTask<>(thread);
		Thread t = new Thread(task);
		t.setName("我是一个有名字的线程");
		t.start();
		ThreadGroup Group = 
				Thread.currentThread().getThreadGroup();
				int bef = Group.activeCount();
				Thread[] Threads = new Thread[bef];
				Group.enumerate(Threads);
				for (int i = 0; i < bef; i++)
				System.out.println("线程号：" + i + " = " + Threads[i].getName());
		List<Muser> nMuser = null;
		try {
			nMuser = (List<Muser>) task.get();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		System.out.println("exe thread");
		ThreadGroup currentGroup = 
		Thread.currentThread().getThreadGroup();
		int noThreads = currentGroup.activeCount();
		Thread[] lstThreads = new Thread[noThreads];
		currentGroup.enumerate(lstThreads);
		for (int i = 0; i < noThreads; i++)
		System.out.println("线程号：" + i + " = " + lstThreads[i].getName());
		t.interrupt();
		return nMuser;
		
		
	}
	@ResponseBody
	@RequestMapping("/clear")
	public String killSession(String mark,HttpServletRequest request) throws Exception
	{
		ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
		int activeCount = threadGroup.activeCount();
		Thread[] lstThread = new Thread[activeCount];
		threadGroup.enumerate(lstThread);
		for(int i=0;i<lstThread.length;i++) {
			if((lstThread[i].getName()).equals("我是一个有名字的线程"))
			{
				lstThread[i].interrupt();
				request.getSession().setAttribute("LenMap", null);
				System.out.println("==================Len is"+request.getSession().getAttribute("LenMap"));
			}
		}
		return "suc";
	}
	
	public List<Muser> getData(HttpServletRequest request,String mark) throws Exception
	{
		System.out.println("long connect start");
		List<Muser> allMuser = null;
		List<String> mids = null;
		List<Muser> nMuser = null;
		List<String> stoMids = null;
		Map<String,Integer> len = null;
		
		Map<String,List<String>> midsList = null;
		
		while(true) {
	
		/*	System.out.println("check");*/
			System.out.println(request.getSession().getAttribute("LenMap")+"after");
			mids = new ArrayList<String>();
			stoMids = new ArrayList<String>();
			MuserExample example = new MuserExample();
			Thread.sleep(3000);
			allMuser = ms.getAllMuser(example);
			Integer l = allMuser.size();
			for(Muser user : allMuser)
			{
				mids.add(user.getId());
				stoMids.add(user.getId());
			}
			
			if(request.getSession().getAttribute("LenMap")==null )
			{
				len = new HashMap<String,Integer>();
			}
			else
			{
				len = (Map<String, Integer>) request.getSession().getAttribute("LenMap");
			}
			if(request.getSession().getAttribute("StoMap")==null) {
				midsList = new HashMap<String,List<String>>();
			}
			else
			{
				midsList = (Map<String, List<String>>) request.getSession().getAttribute("StoMap");
			}
			if(len.get("Len")==null)
			{
				
				System.out.println("execute first");
				len.put("Len",l);
				midsList.put("StoMids", mids);
				request.getSession().setAttribute("LenMap", len);
				request.getSession().setAttribute("StoMap", midsList);
				return allMuser;
				
			}
			else
			{
				len = (Map<String, Integer>) request.getSession().getAttribute("LenMap");
				midsList = (Map<String, List<String>>) request.getSession().getAttribute("StoMap");
				if(len.get("Len")!=l)
				{
					System.out.println("behind");
					len.put("Len", l);
					System.out.println("l is"+l);
					List<String> oldList = midsList.get("StoMids");
					System.out.println("oldList is"+oldList);
					System.out.println("newList is"+mids);
					midsList.put("StoMids", stoMids);
					request.getSession().setAttribute("LenMap", len);
					request.getSession().setAttribute("StoMap", midsList);
					
					mids.removeAll(oldList);
					System.out.println("after"+mids.toString());
					nMuser = new ArrayList<>();
					for(String id : mids)
					{
						Muser muser = ms.getMuser(id);
						nMuser.add(muser);
					}
					System.out.println(midsList.get("StoMids").toString());
					return nMuser;
				}
			}
		
		}
		
	}
	class tThread implements Callable<List<Muser>>{
		private String mark;
		private HttpServletRequest request;
		private boolean isOpen;
		public tThread(String mark,HttpServletRequest request,boolean isOpen)
		{
			this.mark = mark;
			this.request = request;
			this.isOpen = isOpen;
		}
		public void setOpen(boolean isOpen)
		{
			this.isOpen = isOpen;
		}
		public List<Muser> call() throws Exception {
			   List<Muser> nMuser = getData(request,mark);
				return nMuser;
				
		}
			
		
	}

}
