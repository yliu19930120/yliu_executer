package com.yliu.executer.jobs;
/**
 * 带锁的job,带有相同lockKey的job，同一时间内只有一个
 * @author YLiu
 * @Email yliu19930120@163.com
 * 2018年12月27日 下午9:28:40
 */
public abstract class AbstractLockJob implements Job{
	
	@Override
	public void run() {
		
	}

	public abstract void excute();
		
}
