package com.ck.spider.xinlangnews.parser;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.selector.Html;

import com.ck.spider.xinlangnews.model.News;
import com.ck.spider.xinlangnews.tool.HTMLSpirit;

public class HtmlParser {

	private News news;

	public HtmlParser(News news) {
		this.news = news;
	}

	public News parseHtmlToString(){
		try {
			Document doc = Jsoup.connect(news.getUrl())
				 .get();
			Element div = doc.select("#artibody.content").first();
			String context = HTMLSpirit.delHTMLTag(div.html());
			this.news.setContext(context);
			return news;
		} catch (IOException e) {
			e.printStackTrace();
			return news;
		}
	}
	
	public HtmlParser() {
		super();
	}
}
