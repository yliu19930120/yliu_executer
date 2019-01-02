package com.yliu.executer.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yliu.executer.jobs.JobFactory;
import com.yliu.executer.thread.ThreadPool;

import redis.clients.jedis.JedisPubSub;

public class Subscriber extends JedisPubSub{
	
	private final static Logger log = LoggerFactory.getLogger(Subscriber.class);
	
	@Override
	public void onMessage(String channel, String message) {
		log.info("接收到频道{}的消息{}",channel,message);
		ThreadPool.execute(()->JobFactory.run(message));
	}

	@Override
	public void onSubscribe(String channel, int subscribedChannels) {
		log.info("正在监听频道{}的消息{}",channel,subscribedChannels);
	}

	@Override
	public void onUnsubscribe(String channel, int subscribedChannels) {
		log.info("退出频道{}的消息监听{}",channel,subscribedChannels);
	}
	
}
