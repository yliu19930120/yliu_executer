package com.yliu.executer.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThreadPool {
	
private final static Logger log = LoggerFactory.getLogger(ThreadPool.class);
	
	private final static int CORE_POOL_SIZE = 6;
	
	private static ExecutorService pool;
	
	static{
		init(CORE_POOL_SIZE);
	}
	
	private static void init(int num){
		log.info("初始化线程池数{}",num);
		pool = Executors.newFixedThreadPool(num);
	}


	public static void execute(Runnable r){
		pool.execute(r);
	}

	public static void close(){
		pool.shutdown();
	}
}
