package model;

import java.io.Serializable;

public class TestData implements Serializable {
	private String id;
	private String price;
	private Integer num;
	public TestData() {}
	public TestData(String id, String price, Integer num) {
		super();
		this.id = id;
		this.price = price;
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	
	
}
