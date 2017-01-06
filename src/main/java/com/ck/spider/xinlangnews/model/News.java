package com.ck.spider.xinlangnews.model;

public class News {
	private String id; 
	private String url;
	private String keywords;
	private String title;
	private String context;
	
	public News(String id, String url, String keywords, String title) {
		super();
		this.id = id;
		this.url = url;
		this.keywords = keywords;
		this.title = title;
	}
	
	public News() {
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	@Override
	public String toString() {
		return "News [id=" + id + ", url=" + url + ", keywords=" + keywords
				+ ", title=" + title + ", context=" + context + "]";
	}

}
