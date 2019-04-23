package service.impl;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.BoardMapper;
import dao.PostMapper;
import dao.TopicMapper;
import dao.UserMapper;
import model.Board;
import model.Post;
import model.Topic;
import model.User;
import service.TopicService;
@Service
public class TopicServiceImpl implements TopicService{
	@Autowired
	private PostMapper postMapper;
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private TopicMapper topicMapper;
	@Autowired
	private BoardMapper boardMapper;
	@Override
	public List<Post> getAllReplyByTopicId(Integer topicId) {
		// TODO Auto-generated method stub
		List<Post> posts = postMapper.selectByTopicId(topicId);
	
		for(int i =0;i<posts.size();i++)
		{
			if(posts.get(i).getPostType()==Post.TYPE_MAIN)
			{
				posts.remove(i);
			}
		}
		for (Post post : posts) {
			post.setPostTitle(userMapper.selectByPrimaryKey(post.getUserId()).getUserName());
		}
		return posts;
	}
	@Override
	public Topic getTopicById(Integer topicId) {
		// TODO Auto-generated method stub
		Topic topic = topicMapper.selectByPrimaryKey(topicId);
		return topic;
	}
	@Override
	public Post getHostPost(Integer topicId, Integer userId) {
		// TODO Auto-generated method stub
		Post post = postMapper.getHostTopicInnerText(topicId, userId);
		return post;
	}
	@Override
	public void addPost(Post post) {
		// TODO Auto-generated method stub
		post.setCreateTime(new Timestamp(System.currentTimeMillis()));
		post.setPostTitle("王彦之父");
		postMapper.insert(post);
		User user = userMapper.selectByPrimaryKey(post.getUserId());
		user.setCredit(user.getCredit()+5);
		userMapper.updateByPrimaryKeySelective(user);
		Topic topic = topicMapper.selectByPrimaryKey(post.getTopicId());
		topic.setTopicReplies(topic.getTopicReplies()+1);
		topic.setLastPost(new Timestamp(System.currentTimeMillis()));
		topicMapper.updateByPrimaryKeySelective(topic);
		
	}
	@Override
	public List<Board> getBorder() {
		// TODO Auto-generated method stub
		List<Board> board = boardMapper.getAllBoard();
		return board;
	}
	@Override
	public Integer getLastInsertTopicId() {
		// TODO Auto-generated method stub
		int topicId = topicMapper.selectLastInsertId();
		return topicId;
	}
	@Override
	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		topicMapper.insert(topic);
	}
	@Override
	public List<Topic> getTopicByUserId(Integer userId) {
		// TODO Auto-generated method stub
		List<Topic> topic = topicMapper.selectByuserId(userId);
		return topic;
	}
	@Override
	public void addViews(Integer topicId) {
		// TODO Auto-generated method stub
		Topic topic = topicMapper.selectByPrimaryKey(topicId);
		topic.setTopicViews(topic.getTopicViews()+1);
		topicMapper.updateByPrimaryKeySelective(topic);
	}
	@Override
	public void addReplies(Post post) {
		// TODO Auto-generated method stub
		Integer topicId = post.getTopicId();
		Topic topic = topicMapper.selectByPrimaryKey(topicId);
		topic.setTopicReplies(topic.getTopicReplies()+1);
		topicMapper.updateByPrimaryKeySelective(topic);
	}
	@Override
	public void deletePost(Integer postId) {
		// TODO Auto-generated method stub
		postMapper.deleteByPrimaryKey(postId);
	}

}
