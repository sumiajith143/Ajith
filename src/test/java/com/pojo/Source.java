package com.pojo;

public class Source {
	private String url;
	private String text;
	
    public Source(String url, String text) {
		super();
		this.url = url;
		this.text = text;
	}
    public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getText() {
		return text;
	}
	
}