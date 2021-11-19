package com.ssafy.happyhouse.model;

public class QnaDto {
	private String num;
	private String id;
	private String title;
	private String content;
	private String wdate;
	private String reply;

	public QnaDto() {}

	public QnaDto(String num, String id, String title, String content, String wdate, String reply) {
		super();
		this.num = num;
		this.id = id;
		this.title = title;
		this.content = content;
		this.wdate = wdate;
		this.reply = reply;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWdate() {
		return wdate;
	}

	public void setWdate(String wdate) {
		this.wdate = wdate;
	}

	public String getReply() {
		return reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}
	
	
	
}
