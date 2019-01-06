package cn.hyf.start;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import cn.hyf.info.HtmlInfo;
import cn.hyf.util.RequestTool;

@Component
public class Main implements CommandLineRunner {
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	RequestTool requestTool;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		String name = "神火股份";
		
		log.info("工作开始");
		HttpResponse httpResponse = requestTool.request("http://www.baidu.com/s?wd="+name);
//		log.info(map.toString());
		HttpEntity entity = httpResponse.getEntity();
		InputStream stream = entity.getContent();
		
		ByteArrayOutputStream result = new ByteArrayOutputStream();
		byte[] buffer = new byte[1024];
		int length;
		while ((length = stream.read(buffer)) != -1) {
		    result.write(buffer, 0, length);
		}
		String str = result.toString(StandardCharsets.UTF_8.name());
		
//		log.info(str);
		
		int p = 0;
		if(str.indexOf("成交量") != -1){
			p = str.indexOf("成交量");
		}
		log.info(str.substring(p, p+120));
		
		HtmlInfo info = new HtmlInfo();
		
		log.info(name+" 股票代码为："+info.getCode(name, str));
		
		
		
	}

}
