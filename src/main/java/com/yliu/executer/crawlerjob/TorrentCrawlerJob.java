package com.yliu.executer.crawlerjob;

import com.yliu.crawler.torrentcrawler.TorrentCrawler;
import com.yliu.executer.jobs.Job;

public class TorrentCrawlerJob implements Job{

	@Override
	public void run() {
		new TorrentCrawler().catchTorrent();
	}

}
