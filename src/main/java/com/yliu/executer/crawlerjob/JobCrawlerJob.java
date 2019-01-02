package com.yliu.executer.crawlerjob;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.yliu.crawler.jobcrawler.JobCrawler;
import com.yliu.executer.jobs.Job;

public class JobCrawlerJob implements Job{
	
	private final static Logger log = LoggerFactory.getLogger(JobCrawlerJob.class);
	
	@Override
	public void run() {
		log.info("开始执行爬虫程序");
		new JobCrawler().catchJob();
	}

}
