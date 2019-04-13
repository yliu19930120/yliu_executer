package com.yliu.executer.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThreadPool {
	
private final static Logger log = LoggerFactory.getLogger(ThreadPool.class);
	
	private final static int CORE_POOL_SIZE = 6;
	
	private static ThreadPoolExecutor executor;
	
	static{
		init(CORE_POOL_SIZE);
	}
	
	private static void init(int num){
		log.info("初始化线程池数{}",num);
		executor = 
				new ThreadPoolExecutor(num, 12, 4, TimeUnit.HOURS, new ArrayBlockingQueue<Runnable>(1));
	}


	public static void execute(Runnable r){
		executor.execute(r);
	}

	public static void close(){
		executor.shutdown();
	}
}
