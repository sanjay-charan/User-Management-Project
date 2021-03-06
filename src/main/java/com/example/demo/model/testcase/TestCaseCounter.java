package com.example.demo.model.testcase;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import com.example.demo.constants.Constants;

@Document(collection = Constants.COUNTER_COLLECTION)
public class TestCaseCounter {

	@Id
	private String id;
	private int seq;
	
	
	public TestCaseCounter() {
		super();
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
}
