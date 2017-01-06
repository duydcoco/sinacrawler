package com.ck.spider.xinlangnews.parser;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.google.gson.Gson;

import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

public class JsonPipeline implements Pipeline{

	@Override
	public void process(ResultItems resultItems, Task task) {
		File file = new File("result.json");
		String data = new Gson().toJson(resultItems.get("news"));
		FileWriter fw=null;
		try{
			fw= new FileWriter(file,true);
			fw.write(data+"\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(fw!=null){
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
