package com.yliu.executer.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yliu.utils.RedisUtils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPubSub;
/**
 * redis频道监听
 * @author YLiu
 * @Email yliu19930120@163.com
 * 2018年12月25日 下午10:04:52
 */
public class JobLintener {
	
	private final static Logger log = LoggerFactory.getLogger(JobLintener.class);
			
	public final static String CHANNEL = "JOBS";
	
	public static void listen(){
		new JobLintener().sub();
	}
	public void sub(){
		log.info("启动任务执行器的消息监听...");
		Jedis jedis = RedisUtils.getJedis();
		JedisPubSub sub = new Subscriber();
		jedis.subscribe(sub, CHANNEL);
	}
}
