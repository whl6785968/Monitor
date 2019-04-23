package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.TopicMapper;
import model.Topic;
import service.PageService;
@Service
public class PageServiceImpl implements PageService {
	@Autowired
	private TopicMapper topicMapper;
	@Override
	public List<Topic> getHotTopic() {
		// TODO Auto-generated method stub
		List<Topic> list = topicMapper.selectOrderByReply();
		return list;
	}
	@Override
	public List<Topic> getNewTopic() {
		// TODO Auto-generated method stub
		List<Topic> list = topicMapper.selectOrderBydatetime();
		return list;
	}
	
}
