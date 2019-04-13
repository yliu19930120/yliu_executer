package com.yliu.executer.enums;

import java.util.function.Function;

import com.yliu.executer.crawlerjob.JobCrawlerJob;
import com.yliu.executer.jobs.Job;

/**
 * 定时Job枚举
 * @author YLiu
 * @Email yliu19930120@163.com
 * 2018年12月25日 下午11:03:40
 */
public enum JobType {
	
	JOB_CRAWLER(1,"JOB_CRAWLER","爬取51JOB的爬虫",v->new JobCrawlerJob());
	/**
	 * job编号
	 */
	private Integer jobNum;
	/**
	 * job的名称
	 */
	private String jobName;
	/**
	 * Job的描述
	 */
	private String jobDescribe;
	/**
	 * 绑定的具体的job
	 */
	private Function<Void,Job> job;

	
	private JobType(Integer jobNum, String jobName, String jobDescribe, Function<Void, Job> job) {
		this.jobNum = jobNum;
		this.jobName = jobName;
		this.jobDescribe = jobDescribe;
		this.job = job;
	}

	public Integer getJobNum() {
		return jobNum;
	}

	public void setJobNum(Integer jobNum) {
		this.jobNum = jobNum;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobDescribe() {
		return jobDescribe;
	}

	public void setJobDescribe(String jobDescribe) {
		this.jobDescribe = jobDescribe;
	}

	public Function<Void, Job> getJob() {
		return job;
	}

	public void setJob(Function<Void, Job> job) {
		this.job = job;
	}
	
}
