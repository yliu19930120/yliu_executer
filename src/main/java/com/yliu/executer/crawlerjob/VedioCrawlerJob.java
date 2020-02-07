package com.yliu.executer.crawlerjob;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yliu.crawler.viedocrawler.ViedoCrawler;
import com.yliu.executer.jobs.Job;

public class VedioCrawlerJob implements Job{

	private final static Logger log = LoggerFactory.getLogger(VedioCrawlerJob.class);
	
	@Override
	public void run() {
		log.info("执行电影爬虫");
		new ViedoCrawler().catchVedio();
	}

}
