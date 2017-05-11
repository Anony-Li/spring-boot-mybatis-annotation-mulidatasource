package com.autohome.scheduler.scheduler;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.autohome.scheduler.entity.DpmTable;
import com.autohome.scheduler.service.MatestoreService;
import com.autohome.scheduler.service.TableService;

@Component
public class ScheduledTable {

	private Logger logger = Logger.getLogger(ScheduledTable.class);
	@Autowired
	private TableService tableService;
	@Autowired
	private MatestoreService matestoreService;
	
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    @Scheduled(cron = "0 */1 * * * ?")
    public void reportCurrentTime() {
        System.out.println("The time is now " + dateFormat.format(new Date()));
        List<DpmTable> tableInfo = matestoreService.getTableInfo();
        logger.info("获取到 "+tableInfo.size()+" 条表信息");
        int sum = 0;
        for (DpmTable table : tableInfo) {
			//Integer info = tableService.insertTableInfo(table);
			//sum += info;
		}
        logger.info("插入dpm_table表 "+sum+" 条数据");
//        List<String> list = tableService.getAllBaseName();
//        System.out.println(list.size());
    }
}
