package com.yliu.executer.jobs;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.yliu.executer.enums.JobType;

public class JobFactory {
	
	private final static Logger log = LoggerFactory.getLogger(JobFactory.class);
			
	private final static Map<String,JobType> JOB_MAP = new HashMap<>();
	
	static{
		JOB_MAP.put(JobType.JOB_CRAWLER.getJobName(), JobType.JOB_CRAWLER);
		JOB_MAP.put(JobType.VEDIO_CRAWLER.getJobName(), JobType.VEDIO_CRAWLER);
		JOB_MAP.put(JobType.TORRENT_CRAWLER.getJobName(), JobType.TORRENT_CRAWLER);
	}
	
	public static void run(String jobName){
		JobType jobType = JOB_MAP.get(jobName);
		Job job = jobType.getJob().apply(null);
		log.info("执行Job:{}->{},执行类{}",jobType.getJobName()
				,jobType.getJobDescribe(),job.getClass().getName());
		job.run();
	}
}
