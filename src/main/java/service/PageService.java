package service;

import java.util.List;

import model.Topic;

public interface PageService {
	public List<Topic> getHotTopic();
	public List<Topic> getNewTopic();
}
