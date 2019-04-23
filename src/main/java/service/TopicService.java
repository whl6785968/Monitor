package service;

import java.util.List;

import model.Board;
import model.Post;
import model.Topic;

public interface TopicService {
	List<Post> getAllReplyByTopicId(Integer topicId);
	Topic getTopicById(Integer topicId);
	Post getHostPost(Integer topicId,Integer userId);
	void addPost(Post post);
	List<Board> getBorder();
	Integer getLastInsertTopicId();
	void addTopic(Topic topic);
	List<Topic> getTopicByUserId(Integer userId);
	void addViews(Integer TopicId);
	void addReplies(Post post);
	void deletePost(Integer postId);
}
