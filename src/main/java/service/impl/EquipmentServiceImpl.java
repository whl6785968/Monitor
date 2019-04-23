package service.impl;

import java.util.List;



import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import com.sandalen.redis.JedisClient;

import dao.DtMapper;
import dao.EquipmentMapper;
import model.Dt;
import model.DtExample;
import model.Equipment;
import model.EquipmentExample;
import service.EquipmentService;
import util.JsonUtils;
@Service
public class EquipmentServiceImpl implements EquipmentService{
	@Autowired
	private EquipmentMapper em;
	@Autowired
	private DtMapper dm;
	@Autowired
	private HttpSolrServer solrServer;
	@Autowired
	private JedisClient jedisClient;
	@Autowired
	private JmsTemplate jms;
	@Resource(name="topicDestination")
	private Destination topicDestination;
	@Override
	public List<Equipment> getAllEquipment(EquipmentExample example) {
		// TODO Auto-generated method stub
		/*String json = jedisClient.hget("EUQIP_KEY", "equip");
		System.out.println(json);
		if(json!=null) {
			List<Equipment> list = JsonUtils.jsonToList(json, Equipment.class);
			System.out.println(list);
			System.out.println("有缓存......");
			return list;
		}*/
		List<Equipment> list = em.selectByExample(example);
		System.out.println(list.size());
	/*	jedisClient.hset("EUQIP_KEY","equip" ,JsonUtils.objectToJson(list));*/
		return list;
	}
	@Override
	public Equipment getEquipment(final Long eid,final Integer uid) {
		// TODO Auto-generated method stub
		String json = jedisClient.hget("Equip", eid+" ");
		System.out.println(json);
		if(json!=null)
		{
			Equipment equipment = JsonUtils.jsonToPojo(json, Equipment.class);
			System.out.println(equipment);
			System.out.println("有缓存........");
			jms.send(topicDestination,new MessageCreator() {
				
				@Override
				public Message createMessage(Session session) throws JMSException {
					// TODO Auto-generated method stub
					TextMessage message = session.createTextMessage(uid+"-"+eid);
					System.out.println("已经发送消息了~");
					return message;
				}
			});
			return equipment;
		}
		Equipment equipment = em.selectByPrimaryKey(eid);
		jedisClient.hset("Equip", eid+" ", JsonUtils.objectToJson(equipment));
		jms.send(topicDestination,new MessageCreator() {
			
			@Override
			public Message createMessage(Session session) throws JMSException {
				// TODO Auto-generated method stub
				TextMessage message = session.createTextMessage(uid+"-"+eid);
				System.out.println("已经发送消息了~");
				return message;
			}
		});
		return equipment;
	}
	@Override
	public void updateEquipment(Equipment equipment) {
		// TODO Auto-generated method stub
		em.updateByPrimaryKeySelective(equipment);
		Long eid = equipment.getEid();
		System.out.println(eid);
		jedisClient.hdel("Equip", eid+" ");
		
	}
	@Override
	public List<Dt> getAllDt(DtExample example) {
		// TODO Auto-generated method stub
		List<Dt> list = dm.selectByExample(example);
		return list;
	}
	@Override
	public Equipment getSingleEquipment(Long id) {
		// TODO Auto-generated method stub
		Equipment equipment = em.selectByPrimaryKey(id);
		return equipment;
	}
	@Override
	public Integer getCount(EquipmentExample example) {
		// TODO Auto-generated method stub
		int countByExample = em.countByExample(example);
		return countByExample;
	}

	
	

}
