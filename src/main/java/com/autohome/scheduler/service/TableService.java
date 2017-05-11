package com.autohome.scheduler.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autohome.scheduler.entity.DpmTable;
import com.autohome.scheduler.mapper.dpm.TableMapper;

@Service
public class TableService {

	@Autowired
	private TableMapper tableMapper;
	
	public List<String> getAllBaseName(){
		return tableMapper.getAllBaseName();
	}
	
	public Integer insertTableInfo(DpmTable table){
		return tableMapper.insertTableInfo(table);
	}
}
